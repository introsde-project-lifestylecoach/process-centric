package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifestylecoach.business.BusinessClient;
import lifestylecoach.rest.models.Goal;
import lifestylecoach.rest.models.Success;
import ws.business.Business;
import ws.business.GoalBusiness;
import ws.business.GoalType;
import ws.business.MeasureType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/goal")
public class ResGoal {

    @GET
    @Produces("application/json")
    public String show() {
        System.out.println(":: GOAL GET RECIEVED : /goal");
        return "Welcome to goal!";
    }

    @GET
    @Path("delete/{uid}/{title}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String deleteGoal(@PathParam("uid") Integer uid, @PathParam("title") String title) {

        System.out.println(":: GOAL GET RECIEVED : /goal/delete/" + uid + "/" + title);

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Gson gson = new Gson();
        if (business.deleteGoalByTitle(uid, title.replace("_", " ")) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @POST
    @Path("new/{uid}/{oldTitle}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newGoal(@PathParam("uid") Integer uid, @PathParam("oldTitle") String oldTitle, String goaljson) {

        System.out.println(":: GOAL POST RECIEVED : /goal/new/" + uid + "/" + oldTitle);
        System.out.println("\t JSON -> " + goaljson);

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Gson gson = new Gson();
        Goal newGoal = gson.fromJson(goaljson, Goal.class);

        ws.business.Goal wsGoal = new ws.business.Goal();
        wsGoal.setTitle(newGoal.title);

        wsGoal.setDescription(newGoal.description);

        // parse condition
        String condition[] = newGoal.condition.split(" ");
        String cType = condition[0].toLowerCase();
        String cIncrease = condition[1];
        Float cValue = Float.valueOf(condition[2]);

        MeasureType measureType = new MeasureType();
        measureType.setType(cType);
        wsGoal.setMeasureType(measureType);

        wsGoal.setValue(cValue);

        GoalType goalType = new GoalType();
        goalType.setType(cIncrease);
        wsGoal.setGoalType(goalType);


        if (business.updateGoal(uid, wsGoal, oldTitle) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }


    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showGoals(@PathParam("id") Integer uid) {

        System.out.println(":: GOAL GET RECIEVED : /goal/show/" + uid);

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        boolean isEmpty = false;
        List<GoalBusiness> goals = null;
        try {
            goals = business.getGoals(uid);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            isEmpty = true;
        }

        Gson gson = new Gson();

        if (isEmpty == false) {
            Iterator it;
            it = goals.iterator();

            List<Goal> goalsRest = new ArrayList<Goal>();
            while (it.hasNext()) {
                GoalBusiness goalBusiness = (GoalBusiness) it.next();
                ws.business.Goal goal = goalBusiness.getGoal();

                String condition = "";
                if (goal.getGoalType().getType().equals("increase"))
                    condition = goal.getMeasureType().getType()
                            + " > "
                            + goal.getValue();
                else
                    condition = goal.getMeasureType().getType()
                            + " < "
                            + goal.getValue();


                goalsRest.add(new Goal(goal.getTitle(), goal.getDescription(), goalBusiness.isDone(), condition));
            }
            return gson.toJson(goalsRest, goalsRest.getClass());
        } else {
            return gson.toJson(new ArrayList<Goal>());
        }
    }
}

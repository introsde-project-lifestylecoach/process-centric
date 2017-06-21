package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifestylecoach.business.BusinessClient;
import lifestylecoach.rest.models.Goal;
import lifestylecoach.rest.models.Success;
import lifestylecoach.ws.business.Business;
import lifestylecoach.ws.business.GoalBusiness;
import lifestylecoach.ws.business.GoalType;
import lifestylecoach.ws.business.MeasureType;

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
        return "{ \"hello\" : \"TODO show goals\" }"; //TODO
    }

    @POST
    @Path("new/{uid}/{oldTitle}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newGoal(@PathParam("uid") Integer uid, @PathParam("oldTitle") String oldTitle, String goaljson) {
        //TODO new person

        System.out.println("======================");
        System.out.println(uid);
        System.out.println(oldTitle);
        System.out.println(goaljson);

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Gson gson = new Gson();
        Goal newGoal = gson.fromJson(goaljson, Goal.class);

        lifestylecoach.ws.business.Goal wsGoal = new lifestylecoach.ws.business.Goal();
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

        System.out.println("======================");
        System.out.println(wsGoal.getIdGoal());
        System.out.println(wsGoal.getDate());
        System.out.println(wsGoal.getDescription());
        System.out.println(wsGoal.getGoalType().getType());
        System.out.println(wsGoal.getMeasureType().getType());
        System.out.println(wsGoal.getTitle());
        System.out.println(wsGoal.getValue());
        System.out.println(uid + " " + oldTitle);

        if (business.updateGoal(uid, wsGoal, oldTitle) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }


    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showGoals(@PathParam("id") Integer uid) {

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        boolean isEmpty = false;
        List<GoalBusiness> goals = null;
        try {
            goals = business.getGoals(uid);
        } catch (com.sun.xml.internal.ws.fault.ServerSOAPFaultException e) {
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
                lifestylecoach.ws.business.Goal goal = goalBusiness.getGoal();
                goalsRest.add(new Goal(goal.getTitle(), goal.getDescription(), goalBusiness.isDone(), goal.getDate()));
            }
            return gson.toJson(goalsRest, goalsRest.getClass());
        } else {
            return gson.toJson(new ArrayList<Goal>());
        }
    }
}

package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifestylecoach.business.BusinessClient;
import lifestylecoach.rest.models.Goal;
import lifestylecoach.ws.business.Business;
import lifestylecoach.ws.business.GoalType;
import lifestylecoach.ws.business.MeasureType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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

        System.out.println(business.updateGoal(uid, wsGoal, oldTitle));

        return "{\"success\":true}"; //TODO
    }


    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showGoals(@PathParam("id") Integer uid) {

        /*StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        BusinessClient businessClient = new BusinessClient();
        Business business =

        List<lifestylecoach.ws.storage.Goal> goals = storage.getGoalsById(uid);

        Iterator it;
        it = goals.iterator();

        List<Goal> goalsRest = new ArrayList<Goal>();
        while(it.hasNext()) {
            lifestylecoach.ws.storage.Goal goal = (lifestylecoach.ws.storage.Goal) it.next();
            goalsRest.add(new Goal(goal.getTitle(), goal.getDescription(), goal.get))
        }
        */


        //return "[{\"title\":\"title1\",\"description\":\"description1\",\"status\":false},{\"title\":\"title2\",\"description\":\"description2\",\"status\":false}]";
        return "[{\"title\":\"Walk\",\"description\":\"Make at least 1000 steps per day\",\"status\":true}," +
                "{\"title\":\"Lose weight\",\"description\":\"Don't be fat (less than 100 kg)!\",\"status\":true}]";
    }

}

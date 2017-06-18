package lifestylecoach.rest.resources;

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
    public String newUser(@PathParam("uid") Integer uid, @PathParam("oldTitle") String oldTitle, String goaljson) {
        //TODO new person
        System.out.println(uid);
        System.out.println(oldTitle);
        System.out.println(goaljson);

        return "{\"success\":true}"; //TODO
    }


    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showGoals(@PathParam("id") String type) {
        //return "[{\"title\":\"title1\",\"description\":\"description1\",\"status\":false},{\"title\":\"title2\",\"description\":\"description2\",\"status\":false}]";
        return "[{\"title\":\"Walk\",\"description\":\"Make at least 1000 steps per day\",\"status\":true}," +
                "{\"title\":\"Lose weight\",\"description\":\"Don't be fat (less than 100 kg)!\",\"status\":true}]";
    }

}

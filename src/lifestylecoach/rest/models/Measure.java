package lifestylecoach.rest.models;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/measure")
public class Measure {

    @GET
    @Produces("application/json")
    public String show() {
        System.out.println("/measure");
        return "{ \"hello\" : \"TODO show measure\" }"; //TODO
    }

    @GET
    @Path("show/{type}")
    @Produces("application/json")
    public String showByType(@PathParam("type") String type) {
        System.out.println("/measure/new" + type);
        return "{\"measures\": " +
                "[" +
                "{\"type\":\"weight\",\"value\":123}," +
                "{\"type\":\"weight\",\"value\":4324}," +
                "{\"type\":\"weight\",\"value\":543}" +
                "]" +
                "}";
    }

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newMeasure(String text) {
        //TODO new person
        System.out.println(text);
        System.out.println("/measure/now");
        return "TODO";
    }
}

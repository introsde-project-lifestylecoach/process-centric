package lifestylecoach.rest.models;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by matteo on 15/06/17.
 */


@Path("/user")
public class User {

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newUser(String json) {
        //TODO new person
        System.out.println(json);
        System.out.println("/user/new");
        return "{\"success\":true}"; //TODO
    }

    @GET
    @Path("exist/{id}")
    @Produces("application/json")
    public String existUser() {
        return "{\"success\":true}"; //TODO
    }

    @GET
    @Path("profile/{id}")
    @Produces("application/json")
    public String getProfile() {
        return "{ \"uid\":123231,\"name\":\"Giacomo\",\"surname\":\"Leopardi\",\"height\":\"160\",\"weight\":\"60\"}"; //TODO
    }


}

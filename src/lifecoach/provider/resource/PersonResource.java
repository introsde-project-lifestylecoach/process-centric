package lifecoach.provider.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/user")
public class PersonResource {

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


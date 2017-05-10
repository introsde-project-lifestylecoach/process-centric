package lifestylecoach.rest.models;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/goals")
public class Goal {

    @GET
    @Produces("application/json")
    public String show() {
        return "{ \"hello\" : \"TODO show goals\" }"; //TODO
    }
}

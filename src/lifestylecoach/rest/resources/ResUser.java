package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifecoach.localdb.webservice.Person;
import lifecoach.storage.webservice.Storage;
import lifestylecoach.rest.models.Success;
import lifestylecoach.rest.models.User;
import lifestylecoach.storage.StorageClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by matteo on 15/06/17.
 */


@Path("/user")
public class ResUser {

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newUser(String json) {
        //TODO new person

        System.out.println("/user/new");
        System.out.println(json);

        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);

        Person person = new Person();

        person.setIdPerson(user.uid);
        person.setFirstname(user.name);
        person.setLastname(user.surname);

        // service
        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        storage.createPerson(person);

        //Check if the new person operation is sucessfull
        return existUser(user.uid);
    }

    @GET
    @Path("exist/{id}")
    @Produces("application/json")
    public String existUser(@PathParam("id") Integer id) {

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        Person person = storage.readPerson(id);

        Gson gson = new Gson();

        if (person != null)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @GET
    @Path("profile/{id}")
    @Produces("application/json")
    public String getProfile(@PathParam("id") Integer id) {

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        Person person = storage.readPerson(id);

        Gson gson = new Gson();
        //gson.toJson(person, User);


        return "{ \"uid\":123231,\"name\":\"Giacomo\",\"surname\":\"Leopardi\",\"height\":\"160\",\"weight\":\"60\"}"; //TODO
    }


}

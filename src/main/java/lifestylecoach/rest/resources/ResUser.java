package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifestylecoach.business.BusinessClient;
import lifestylecoach.rest.models.Success;
import lifestylecoach.rest.models.User;
import lifestylecoach.rest.models.UserMeasure;
import lifestylecoach.storage.StorageClient;
import ws.business.Bmi;
import ws.business.Business;
import ws.storage.Measure;
import ws.storage.Storage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

        System.out.println(json);

        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);

        ws.business.Person person = new ws.business.Person();

        person.setIdPerson(user.uid);
        person.setFirstname(user.name);
        person.setLastname(user.surname);
        person.setSex(user.sex);
        person.setBirthdate(user.birthdate);
        person.setWaist(Float.parseFloat(user.waist));
        person.setHip(Float.parseFloat(user.hip));

        // CALL business service
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        //business.createPerson(person);
        business.updatePerson(person);

        //Check if the new person operation is sucessfull
        return existUser(user.uid);
    }

    @GET
    @Path("exist/{id}")
    @Produces("application/json")
    public String existUser(@PathParam("id") Integer id) {

        System.out.println("Check user " + id);

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        ws.storage.Person person = storage.readPerson(id);

        Gson gson = new Gson();

        System.out.println("================================> " + gson + " | " + person.getLastname());

        if (person != null)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @GET
    @Path("profile/{id}")
    @Produces("application/json")
    public String getProfile(@PathParam("id") Integer id) {

        System.out.println("seeprofile id : " + id);
        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        ws.storage.Person person = storage.readPerson(id);
        List<Measure> measures = storage.getLastMeasure(id);

        String height = "0";
        String weight = "0";

        for (Measure m : measures) {
            if (m.getMeasureType().getType().equals("height"))
                height = String.valueOf(m.getValue());
            else if (m.getMeasureType().getType().equals("weight"))
                weight = String.valueOf(m.getValue());
        }

        UserMeasure user = new UserMeasure(person.getIdPerson(),
                person.getFirstname(),
                person.getLastname(),
                person.getSex(),
                person.getBirthdate(),
                String.valueOf(person.getWaist()),
                String.valueOf(person.getHip()),
                height,
                weight);

        Gson gson = new Gson();
        String res = gson.toJson(user, UserMeasure.class);

        return res;
    }

    @GET
    @Path("bmi/{id}")
    @Produces("application/json")
    public String getBmi(@PathParam("id") Integer uid) {

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Bmi bmi = business.getBmi(uid); //weight height sex age waist hip*/

        Gson gson = new Gson();
        String bmijson = gson.toJson(bmi, bmi.getClass());

        return bmijson;
    }
}
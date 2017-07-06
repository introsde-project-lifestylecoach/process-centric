package lifestylecoach.rest.resources;

import com.google.gson.Gson;
import lifestylecoach.business.BusinessClient;
import lifestylecoach.storage.StorageClient;
import ws.business.Business;
import ws.business.MeasureType;
import ws.storage.Storage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/measure")
public class ResMeasure {

    @GET
    @Produces("application/json")
    public String show() {
        System.out.println("/measure");
        return "{ \"hello\" : \"TODO show measure\" }"; //TODO
    }

    @GET
    @Path("show/{id}/{type}")
    @Produces("application/json")
    public String showByType(@PathParam("id") Integer uid, @PathParam("type") String type) {
        System.out.println("/measure/new" + type);

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        List<ws.storage.Measure> measures = storage.getMeasureHistory(uid, type);
        ArrayList<lifestylecoach.rest.models.Measure> jsonMeasures = new ArrayList<lifestylecoach.rest.models.Measure>();

        Collections.reverse(measures);

        Iterator it = measures.iterator();
        int i = 0;
        while (it.hasNext() && i < 15) {
            ws.storage.Measure measure = (ws.storage.Measure) it.next();

            jsonMeasures.add(new lifestylecoach.rest.models.Measure(uid,
                    measure.getMeasureType().getType(),
                    Float.toString(measure.getValue()),
                    measure.getDate()));
            i++;
        }

        Gson gson = new Gson();
        System.out.println(gson.toJson(jsonMeasures, jsonMeasures.getClass()));
        return gson.toJson(jsonMeasures, jsonMeasures.getClass());
    }

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newMeasure(String text) {

        System.out.println(text);
        System.out.println("/measure/new");

        Gson gson = new Gson();
        lifestylecoach.rest.models.Measure measure = gson.fromJson(text, lifestylecoach.rest.models.Measure.class);

        ws.business.Measure pMeasure = new ws.business.Measure();
        MeasureType type = new MeasureType();
        type.setType(measure.measureType);

        pMeasure.setValue(Float.parseFloat(measure.measureValue));
        pMeasure.setMeasureType(type);
        pMeasure.setDate("");

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        business.createMeasure(measure.uid, pMeasure);

        return "TODO";
    }
}

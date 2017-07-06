package lifestylecoach.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by matteo on 10/05/17.
 */

@ApplicationPath("lifestylecoach-process-centric")
public class Configuration extends ResourceConfig {
    public Configuration() {
        packages("lifestylecoach.rest");
    }
}

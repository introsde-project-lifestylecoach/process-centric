package lifecoach.provider;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("lifestylecoach-process-centric")
public class Configuration extends ResourceConfig {
    public Configuration () {
        packages("lifecoach.provider");
    }
}


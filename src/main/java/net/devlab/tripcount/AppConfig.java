package net.devlab.tripcount;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * 
 * @author dj0n1
 *
 */
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        register(JacksonFeature.class);
        packages("net.devlab.tripcount.api");
    }
}

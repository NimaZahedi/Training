package training;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

/**
 * Created by nimazahedi on 05/08/16.
 */

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MessageResource.class);
    }
}

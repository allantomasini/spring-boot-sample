package br.com.cinq.greet;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.cinq.greet.controller.GreetingController;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(GreetingController.class);
        register(CORSFilter.class);
    }
}
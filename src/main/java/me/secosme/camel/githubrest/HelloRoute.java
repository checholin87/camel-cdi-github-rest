package me.secosme.camel.githubrest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("hello")
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() {
        /**
         * http://localhost:8080/github-rest/camel/say/hello/
         * http://localhost:8080/github-rest/camel/say/hello/checholin87
         */
        rest("/say/")
            .produces("text/plain")
            .get("hello")
            .route()
            .transform().constant("Hello World!")
            .endRest()
            .get("hello/{name}")
            .route()
            .bean("hello")
            .log("${body}");
    }
}
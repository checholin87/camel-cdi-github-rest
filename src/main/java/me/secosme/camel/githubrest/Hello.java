package me.secosme.camel.githubrest;

import javax.inject.Inject;
import javax.inject.Named;
import org.apache.camel.CamelContext;
import org.apache.camel.Header;

@Named("hello")
public class Hello {

    @Inject
    CamelContext context;

    public String hello(@Header("name") String name) {
        return "Hello " + name + ", I'm " + context + "!";
    }
}

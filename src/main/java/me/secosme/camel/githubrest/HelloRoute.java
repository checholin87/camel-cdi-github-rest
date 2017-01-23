package me.secosme.camel.githubrest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("github")
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() {

        /**
         * http://localhost:8080/camel-cdi-github-rest/camel/say?name=checholin87
         */

        from("servlet:///say?servletName=CamelServlet&matchOnUriPrefix=true&httpMethodRestrict=GET").beanRef("hello").log("${body}");
    }
}

package me.secosme.camel.githubrest;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("github")
public class GitHubRestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        /**
         * 200 => http://localhost:8080/camel-cdi-github-rest/camel/github?user=checholin87
         * 404 => http://localhost:8080/camel-cdi-github-rest/camel/github?user=fjwlfjwklejel
         */

        from("servlet:///github?servletName=CamelServlet&matchOnUriPrefix=true&httpMethodRestrict=GET")
            .log("${header.user}")
            .setHeader(Exchange.HTTP_PATH, simple("/users/${header.user}/repos"))
            .to("https://api.github.com?throwExceptionOnFailure=false&bridgeEndpoint=true");
    }

}

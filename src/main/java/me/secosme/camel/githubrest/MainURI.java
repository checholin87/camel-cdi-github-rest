package me.secosme.camel.githubrest;

import java.net.URI;

/**
 * Proof of concept of how camel-servlet 2.13.4 parses the "relative path" in the 
 * class HttpEndpoint (http-component).
 * 
 * @author checholin87
 */
public class MainURI {

    public static void main(String[] args) {
        // path recognized by camel-servlet
        print(URI.create("servlet:///github?servletName=CamelServlet&matchOnUriPrefix=true&httpMethodRestrict=GET"));
        print(URI.create("servlet://0.0.0.0:0/github?servletName=CamelServlet&matchOnUriPrefix=true&httpMethodRestrict=GET"));
        // path not recognized by camel-servlet
        print(URI.create("servlet://github?servletName=CamelServlet&matchOnUriPrefix=true&httpMethodRestrict=GET"));
    }

    private static void print(URI uri) {
        System.out.println(String.format("{uri:'%s', scheme: '%s', authotity: '%s', host: '%s', "
            + "port: '%s', path: '%s', query: '%s', fragment: '%s'}",
            uri.toString(),
            uri.getScheme(),
            uri.getAuthority(),
            uri.getHost(),
            uri.getPort(),
            uri.getPath(),
            uri.getQuery(),
            uri.getFragment()));
    }

}

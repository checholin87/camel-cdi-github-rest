package me.secosme.camel.githubrest;

import javax.enterprise.context.ApplicationScoped;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.impl.DefaultCamelContext;

@ApplicationScoped
@ContextName("github")
public class GitHubCamelContext extends DefaultCamelContext {
}

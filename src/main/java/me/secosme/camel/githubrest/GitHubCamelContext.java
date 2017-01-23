package me.secosme.camel.githubrest;

import javax.enterprise.context.ApplicationScoped;
import org.apache.camel.cdi.CdiCamelContext;
import org.apache.camel.cdi.ContextName;

@ApplicationScoped
@ContextName("github")
public class GitHubCamelContext extends CdiCamelContext {
}

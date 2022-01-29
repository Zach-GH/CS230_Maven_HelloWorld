package com.dropwizard.helloworld.resources;

import com.dropwizard.helloworld.resources.HelloWorldResource; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path ("hello")
public class HelloWorldResource {
	@GET
	@Produces (MediaType.TEXT_PLAIN )
	public String getGreeting() {
		return "Hello World";
	}
}

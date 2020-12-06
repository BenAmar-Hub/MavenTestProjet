package my.first.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	public String sayHello() {		
	return"Hello World!";
	  }

	@GET
	 @Path("/{param}")
	 @Produces(MediaType.TEXT_PLAIN) 
	 public String sayHelloWithParam(@PathParam("param") String  name) {		
	      String greeting = "Hello "+name;
	 	return greeting;
	  }
	}

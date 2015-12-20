package br.com.cinq.greet.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cinq.greet.message.Greeting;

@Controller
@Path("/greeting")
public class GreetingController {
	@Autowired
	Greeting greeting;

	@GET
	@Produces("application/json")
	public Greeting greeting() {
		return greeting;
	}

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/post")
	public Greeting postMsg(final Greeting message) {
		greeting.setMessage(message.getMessage());
		return greeting;
	}
}

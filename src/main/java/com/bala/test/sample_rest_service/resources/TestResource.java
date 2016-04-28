package com.bala.test.sample_rest_service.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResource {

	@GET
	public String getData()
	{
		String json = "";
		json += "{\"";
		json += "data\" :";
		json += "\"";
		json += "Hi ! I am rest service";
		json += "\"}";
		return json;
	}
}

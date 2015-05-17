package com.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ilyzeservice")
public class IlyzeService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/status")
	public Response getStatus(){
		return Response.ok("{\"status\":\"Service Ilyze Service is running...\"}").build();
	}
}

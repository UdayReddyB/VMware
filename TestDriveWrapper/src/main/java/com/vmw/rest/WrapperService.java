package com.vmw.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.web.bind.annotation.RequestBody;

@Path("/service")
public class WrapperService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "TestWrapper : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@POST
	@Path("/postEmail")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response wrapperMethod(@RequestBody String rb) {

		

		return Response.status(200).entity("ReqestBody is: "+rb.toString()).build();

	}


}

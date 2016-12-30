package com.crunchify.restjersey;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class SimpleService {
    @POST
    @Produces("application/json")
    @Path("/test")
    public Response getMsg(String msg) {
        String output;
		output = msg;
		return Response.status(200).entity(output).build();
    }

}
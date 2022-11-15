package ch.bbw.km;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    public Response helloWorld() {
        return Response.ok("Hello World!").build();
    }

    @Path("{number1}/{number2}")
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")

    public Response addNumbers(@PathParam("number1") int number1, @PathParam("number2") int number2) {
        return Response.ok(number1 + number2).build();
    }



}

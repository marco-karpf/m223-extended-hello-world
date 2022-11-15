package ch.bbw.km;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    public Response helloWorld() {
        return Response.ok("Hello World!").build();
    }



}

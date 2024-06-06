package org.acme.webapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/")
public class FilmResource {
    @GET
    @Path("/helloworld")
    @Produces("text/plain")
    public String helloWorld() {
        return "Hello, World!";
    }
}

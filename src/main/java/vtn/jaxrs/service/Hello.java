package vtn.jaxrs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("greeting")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
    }
}

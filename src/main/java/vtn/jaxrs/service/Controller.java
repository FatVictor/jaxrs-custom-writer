package vtn.jaxrs.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import vtn.jaxrs.model.Person;

@Path("person")
public class Controller {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public List<Person> getAllPerson() {
        List<Person> result = new ArrayList<>();
        result.add(new Person(1, "First", 29));
        result.add(new Person(2, "Second", 19));
        result.add(new Person(3, "Third", 25));
        result.add(new Person(4, "Fourth", 35));
        return result;
    }

}

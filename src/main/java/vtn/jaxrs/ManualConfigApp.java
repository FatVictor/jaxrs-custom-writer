package vtn.jaxrs;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import vtn.jaxrs.service.Controller;
import vtn.jaxrs.service.Hello;
import vtn.jaxrs.writer.ListPersonWriter;

@ApplicationPath("sv")
public class ManualConfigApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();

        classes.add(Hello.class);
        classes.add(Controller.class);
        classes.add(ListPersonWriter.class);
        return classes;
    }
}

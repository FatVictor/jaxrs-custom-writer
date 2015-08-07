package vtn.jaxrs.writer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import vtn.jaxrs.model.Person;

@Provider
public class ListPersonWriter implements MessageBodyWriter<List<Person>> {

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(List<Person> t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(List<Person> persons, Class<?> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        StringBuilder sb = new StringBuilder("[");
        persons.stream().forEach((person) -> {
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(person.toJsonString());
        });
        sb.append("]");
        entityStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
        entityStream.flush();

    }

}

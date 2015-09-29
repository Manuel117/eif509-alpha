package una.cr.alpha.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.model.User;
import org.appfuse.service.GenericManager;

import una.cr.alpha.model.Person;

@WebService
@Path("/persons")
public interface PersonManager extends GenericManager<Person, Long> {

    @GET
    @Path("/{id}")
    Person findById(@PathParam("id") Long id);

    @GET
    @Path("/findUser/{user}")
    Person findByUser(@PathParam("user") User user);

    @GET
    @Path("/nickname/{nickname}")
    Person findByNickname(@PathParam("nickname") String nickname);

    @GET
    @Path("/findBirthday/{birthday}")
    List<Person> findByBirthday(@PathParam("birthday") Date birthday);

    @GET
    @Path("/findFirstName/{firstName}")
    List<Person> findByFirstName(@PathParam("firstName") String firstName);

    @GET
    @Path("/findLastName/{lastName}")
    List<Person> findByLastName(@PathParam("lastName") String lastName);

    @GET
    @Path("/")
    List<Person> getPeople();

}

package una.cr.alpha.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;

import una.cr.alpha.model.Dish;

@WebService
@Path("/dish")
public interface DishManager extends GenericManager<Dish, Long> {

	@GET
    @Path("{description}")
    List<Dish> findByDescription(@PathParam("description") String description);

    @GET
    List<Dish> getDishes();
}

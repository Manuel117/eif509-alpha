package una.cr.alpha.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;

import una.cr.alpha.model.Preference;
import una.cr.alpha.model.Dish;

@WebService
@Path("/preference")
public interface PreferenceManager extends GenericManager<Preference, Long> {

	@GET
    @Path("{dish_id}")
    List<Preference> findByDish(@PathParam("dish_id") Dish dich);

    @GET
    List<Preference> getPreferences();
}

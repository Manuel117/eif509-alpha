package una.cr.alpha.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;
import una.cr.alpha.model.Category;

@WebService
@Path("/categories")
public interface CategoryManager extends GenericManager<Category, Long> {

	@GET
    @Path("{description}")
    List<Category> findByDescription(@PathParam("description") String description);

    @GET
    List<Category> getCategories();
}


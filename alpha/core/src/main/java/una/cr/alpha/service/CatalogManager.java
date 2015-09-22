package una.cr.alpha.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;

import una.cr.alpha.model.Catalog;

@WebService
@Path("/catalog")
public interface CatalogManager extends GenericManager<Catalog, Long> {

    @GET
    @Path("/find/{id}")
    Catalog findById(@PathParam("id") Long id);

    @GET
    @Path("/findDescription/{description}")
    List<Catalog> findByDescription(@PathParam("description") String description);

    @GET
    List<Catalog> getCatalogs();

}

package una.cr.alpha.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.appfuse.service.GenericManager;

import una.cr.alpha.model.CatalogValue;
import una.cr.alpha.model.Catalog;

@WebService
@Path("/catalogValue")
public interface CatalogValueManager extends GenericManager<CatalogValue, Long> {

    @GET
    @Path("/find/{id}")
    CatalogValue findById(@PathParam("id") Long id);

    @GET
    @Path("/findDescription/{description}")
    List<CatalogValue> findByDescription(@PathParam("description") String description);

    @GET
    @Path("/findCatalog/{catalog}")
    List<CatalogValue> findByCatalog(@PathParam("catalog") Catalog catalog);

    @GET
    List<CatalogValue> getCatalogsValues();

}

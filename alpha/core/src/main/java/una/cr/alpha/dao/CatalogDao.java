package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Catalog;

public interface CatalogDao extends GenericDao<Catalog, Long> {
    public Catalog findById(Long id);
    
    public List<Catalog> findByDescription(String description);

}

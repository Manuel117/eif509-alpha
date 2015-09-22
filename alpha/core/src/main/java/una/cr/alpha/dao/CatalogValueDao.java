package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Catalog;
import una.cr.alpha.model.CatalogValue;

public interface CatalogValueDao extends GenericDao<CatalogValue, Long> {
    public CatalogValue findById(Long id);
    
    public List<CatalogValue> findByDescription(String description);

    public List<CatalogValue> findByCatalogId(Catalog catalog);

}

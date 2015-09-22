package una.cr.alpha.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import una.cr.alpha.dao.CatalogDao;
import una.cr.alpha.model.Catalog;
import una.cr.alpha.service.CatalogManager;

@Service("catalogManager")
@WebService(serviceName = "CatalogService", endpointInterface = "una.cr.alpha.service.CatalogManager")
public class CatalogManagerImpl extends GenericManagerImpl<Catalog, Long> implements CatalogManager {
	CatalogDao catalogDao;

    public CatalogManagerImpl() {}

    @Autowired
    public CatalogManagerImpl(CatalogDao catalogDao) {
        super(catalogDao);
        this.catalogDao = catalogDao;
    }

    public Catalog findById(Long id) {
        return catalogDao.findById(id);
    }
    
    public List<Catalog> findByDescription(String desciption) {
        return catalogDao.findByDescription(desciption);
    }

    public List<Catalog> getCatalogs() {
        return catalogDao.getAll();
    }

}

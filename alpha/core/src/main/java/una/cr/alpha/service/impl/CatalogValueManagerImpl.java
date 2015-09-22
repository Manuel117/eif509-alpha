package una.cr.alpha.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import una.cr.alpha.dao.CatalogValueDao;
import una.cr.alpha.model.Catalog;
import una.cr.alpha.model.CatalogValue;
import una.cr.alpha.service.CatalogValueManager;

@Service("catalogValueManager")
@WebService(serviceName = "CatalogValueService", endpointInterface = "una.cr.alpha.service.CatalogValueManager")
public class CatalogValueManagerImpl extends GenericManagerImpl<CatalogValue, Long> implements CatalogValueManager {
	CatalogValueDao catalogValueDao;

    public CatalogValueManagerImpl() {}

    @Autowired
    public CatalogValueManagerImpl(CatalogValueDao catalogValueDao) {
        super(catalogValueDao);
        this.catalogValueDao = catalogValueDao;
    }

    public CatalogValue findById(Long id) {
        return catalogValueDao.findById(id);
    }
    
    public List<CatalogValue> findByDescription(String desciption) {
        return catalogValueDao.findByDescription(desciption);
    }
    
    public List<CatalogValue> findByCatalog(Catalog catalog) {
        return catalogValueDao.findByCatalogId(catalog);
    }

    public List<CatalogValue> getCatalogsValues() {
        return catalogValueDao.getAll();
    }


}

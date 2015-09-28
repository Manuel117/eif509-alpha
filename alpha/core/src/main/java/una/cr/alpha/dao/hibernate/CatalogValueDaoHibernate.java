package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.CatalogValueDao;
import una.cr.alpha.model.Catalog;
import una.cr.alpha.model.CatalogValue;

@Repository("catalogValueDao")
public class CatalogValueDaoHibernate extends GenericDaoHibernate<CatalogValue, Long> implements CatalogValueDao {

    public CatalogValueDaoHibernate() {
        super(CatalogValue.class);
    }

    public CatalogValue findById(Long id) {
        return (CatalogValue) getSession().createCriteria(CatalogValue.class).add(Restrictions.eq("idcatalog_value", id)).uniqueResult();
    }
    
    public List<CatalogValue> findByDescription(String desciption) {
        return getSession().createCriteria(CatalogValue.class).add(Restrictions.eq("desciption", desciption)).list();
    }
    
    public List<CatalogValue> findByCatalogId(Catalog catalog) {
        return getSession().createCriteria(CatalogValue.class).add(Restrictions.eq("catalog", catalog)).list();
    }

}

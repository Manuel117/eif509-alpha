package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.CatalogDao;
import una.cr.alpha.model.Catalog;

@Repository("catalogDao")
public class CatalogDaoHibernate extends GenericDaoHibernate<Catalog, Long> implements CatalogDao {

    public CatalogDaoHibernate() {
        super(Catalog.class);
    }

    public Catalog findById(Long id) {
        return (Catalog) getSession().createCriteria(Catalog.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    public List<Catalog> findByDescription(String desciption) {
        return getSession().createCriteria(Catalog.class).add(Restrictions.eq("desciption", desciption)).list();
    }

}

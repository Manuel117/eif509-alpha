package una.cr.alpha.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.SuggestDao;
import una.cr.alpha.model.Suggest;

@Repository("suggestDao")
public class SuggestDaoHibernate extends GenericDaoHibernate<Suggest,Long> implements SuggestDao {
	 public SuggestDaoHibernate() {
	        super(Suggest.class);
	    }

	    public Suggest findById(Long id) {
	        return (Suggest) getSession().createCriteria(Suggest.class).add(Restrictions.eq("idsuggest", id)).uniqueResult();
	    }
	    
}

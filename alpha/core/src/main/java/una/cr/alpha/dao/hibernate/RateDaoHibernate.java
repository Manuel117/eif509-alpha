package una.cr.alpha.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.RateDao;
import una.cr.alpha.model.Rate;

@Repository("rateDao")
public class RateDaoHibernate extends GenericDaoHibernate<Rate,Long> implements RateDao {
	 public RateDaoHibernate() {
	        super(Rate.class);
	    }

	    public Rate findById(Long id) {
	        return (Rate) getSession().createCriteria(Rate.class).add(Restrictions.eq("idrate", id)).uniqueResult();
	    }
	    
}

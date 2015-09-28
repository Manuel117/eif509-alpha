package una.cr.alpha.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.PreferenceDao;
import una.cr.alpha.model.Preference;

@Repository("preferenceDao")
public class PreferenceDaoHibernate extends GenericDaoHibernate<Preference,Long> implements PreferenceDao {
   public PreferenceDaoHibernate() {
	        super(Preference.class);
	    }
	
   public Preference findById(Long id){
	   return (Preference) getSession().createCriteria(Preference.class).add(Restrictions.eq("idpreference", id)).uniqueResult();
   }
}

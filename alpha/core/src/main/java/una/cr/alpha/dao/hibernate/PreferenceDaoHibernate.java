package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.PreferenceDao;
import una.cr.alpha.model.Preference;
import una.cr.alpha.model.Dish;

@Repository("preferenceDao")
public class PreferenceDaoHibernate extends GenericDaoHibernate<Preference, Long> implements PreferenceDao {
	
	public PreferenceDaoHibernate(){
		super(Preference.class);
	}
	
	public List<Preference> findByDish(Dish dish) {
		return getSession().createCriteria(Preference.class).add(Restrictions.eq("dish_id", dish)).list();
	}

}


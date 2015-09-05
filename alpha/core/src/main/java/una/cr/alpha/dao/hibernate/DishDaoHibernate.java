package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.DishDao;
import una.cr.alpha.model.Dish;

@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Long> implements DishDao {
	
	public DishDaoHibernate(){
		super(Dish.class);
	}
	
	public List<Dish> findByDescription(String description) {
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("description", description)).list();
	}

}

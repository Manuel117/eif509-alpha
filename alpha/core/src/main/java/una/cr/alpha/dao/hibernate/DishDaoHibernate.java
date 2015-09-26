package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.DishDao;
import una.cr.alpha.model.Dish;

@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Long> implements DishDao {

	   public DishDaoHibernate() {
	        super(Dish.class);
	    }

	    public Dish findById(Long id) {
	        return (Dish) getSession().createCriteria(Dish.class).add(Restrictions.eq("id", id)).uniqueResult();
	    }
	    
	    public List<Dish> findByDescription(String desciption) {
	        return getSession().createCriteria(Dish.class).add(Restrictions.eq("desciption", desciption)).list();
	    }

	
	
}

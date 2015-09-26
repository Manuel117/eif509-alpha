package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.FoodDao;
import una.cr.alpha.model.Food;

@Repository("foodDao")
public class FoodDaoHibernate extends GenericDaoHibernate<Food,Long> implements FoodDao{

	public FoodDaoHibernate() {
        super(Food.class);
    }
	public Food findById(Long id) {
        return (Food) getSession().createCriteria(Food.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    public List<Food> findByName(String name) {
        return getSession().createCriteria(Food.class).add(Restrictions.eq("name", name)).list();
    }
}

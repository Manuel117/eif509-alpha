package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import una.cr.alpha.model.Category;
import una.cr.alpha.dao.CategoryDao;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDaoHibernate extends GenericDaoHibernate<Category, Long> implements CategoryDao {
	
	public CategoryDaoHibernate(){
		super(Category.class);
	}
	
	public List<Category> findByDescription(String description) {
		return getSession().createCriteria(Category.class).add(Restrictions.eq("description", description)).list();
	}

}

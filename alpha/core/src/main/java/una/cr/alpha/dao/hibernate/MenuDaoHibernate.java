package una.cr.alpha.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import una.cr.alpha.model.Menu;
import una.cr.alpha.dao.MenuDao;

import org.springframework.stereotype.Repository;

@Repository("menuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu, Long> implements MenuDao {

	public MenuDaoHibernate() {
        super(Menu.class);
    }
	
	 public List<Menu> findById(Long id) {
	        return getSession().createCriteria(Menu.class).add(Restrictions.eq("id", id)).list();
	    }
}

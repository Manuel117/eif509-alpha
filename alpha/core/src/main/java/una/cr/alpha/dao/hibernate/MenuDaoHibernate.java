package una.cr.alpha.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.MenuDao;
import una.cr.alpha.model.Menu;

@Repository("menuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu,Long> implements  MenuDao{
	public MenuDaoHibernate(){
		super(Menu.class);
	}
	public Menu findById(Long id){
		return (Menu) getSession().createCriteria(Menu.class).add(Restrictions.eq("idmenu", id)).uniqueResult();
	}
}

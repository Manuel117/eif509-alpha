package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Menu;

public interface MenuDao extends GenericDao<Menu,Long> {
    public Menu findById(Long id);
}

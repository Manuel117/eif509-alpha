
package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Menu;

import java.util.List;

public interface MenuDao extends GenericDao<Menu, Long>{

	public List<Menu> findById(Long id);
}

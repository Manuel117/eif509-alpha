package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Goto;

public interface GotoDao extends GenericDao<Goto,Long> {
	public Goto findById(Long id);
}

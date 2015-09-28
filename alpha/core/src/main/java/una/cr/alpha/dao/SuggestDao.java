package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Suggest;

public interface SuggestDao extends GenericDao<Suggest,Long>{
	public Suggest findById(Long id);
}

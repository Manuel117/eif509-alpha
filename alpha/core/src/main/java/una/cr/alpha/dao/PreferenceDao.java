package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Preference;

public interface PreferenceDao extends GenericDao<Preference,Long>{
  public Preference findById(Long id);
}

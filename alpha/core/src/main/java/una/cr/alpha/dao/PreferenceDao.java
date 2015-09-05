package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Preference;
import una.cr.alpha.model.Dish;

public interface PreferenceDao extends GenericDao<Preference, Long> {

    public List<Preference> findByDish(Dish dish);
}

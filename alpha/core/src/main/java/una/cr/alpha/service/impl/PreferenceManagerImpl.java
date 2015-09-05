package una.cr.alpha.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import una.cr.alpha.dao.PreferenceDao;
import una.cr.alpha.model.Preference;
import una.cr.alpha.model.Dish;
import una.cr.alpha.service.PreferenceManager;

@Service("preferenceManager")
@WebService(serviceName = "PreferenceService", endpointInterface = "una.cr.alpha.service.PreferenceManager")
public class PreferenceManagerImpl extends GenericManagerImpl<Preference, Long> implements PreferenceManager {
	PreferenceDao preferenceDao;
	
	public PreferenceManagerImpl() {}
	
	 @Autowired
	    public PreferenceManagerImpl(PreferenceDao preferenceDao) {
	        super(preferenceDao);
	        this.preferenceDao = preferenceDao;
	    }

	    public List<Preference> findByDish(Dish dish) {
	        return preferenceDao.findByDish(dish);
	    }

	    public List<Preference> getPreferences() {
	        return preferenceDao.getAll();
	    }
}

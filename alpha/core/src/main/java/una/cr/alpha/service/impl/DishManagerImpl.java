package una.cr.alpha.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import una.cr.alpha.dao.DishDao;
import una.cr.alpha.model.Dish;
import una.cr.alpha.service.DishManager;

@Service("dishManager")
@WebService(serviceName = "DishService", endpointInterface = "una.cr.alpha.service.DishManager")
public class DishManagerImpl extends GenericManagerImpl<Dish, Long> implements DishManager {
	DishDao dishDao;
	
	public DishManagerImpl() {}
	
	 @Autowired
	    public DishManagerImpl(DishDao dishDao) {
	        super(dishDao);
	        this.dishDao = dishDao;
	    }

	    public List<Dish> findByDescription(String description) {
	        return dishDao.findByDescription(description);
	    }

	    public List<Dish> getDishes() {
	        return dishDao.getAll();
	    }

}

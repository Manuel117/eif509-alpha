package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Dish;

public interface DishDao extends GenericDao<Dish, Long> {

    public List<Dish> findByDescription(String description);
}


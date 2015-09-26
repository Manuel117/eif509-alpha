package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Food;

public interface FoodDao extends GenericDao<Food,Long>{
	 public Food findById(Long id);
	 public List<Food> findByName(String name);
}

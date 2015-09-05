package una.cr.alpha.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import una.cr.alpha.model.Category;
import una.cr.alpha.model.Dish;

public class DishDaoTest extends BaseDaoTestCase {

	@Autowired
    private DishDao dishDao;
	@Autowired
    private CategoryDao categoryDao;

    @Test
    public void testFindDishByDescription() throws Exception {
        List<Dish> dishes = dishDao.findByDescription("Pinto");
        assertTrue(dishes.size() > 0);
    }
    

    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveDish() throws Exception {
    	Category category = new Category();
    	category.setDescription("Seafood");
    	
    	category = categoryDao.save(category);
    	
    	Dish dish = new Dish();
        dish.setDescription("Fish");

        dish = dishDao.save(dish);
        flush();

        dish = dishDao.get(dish.getId());

        assertEquals("Fish", dish.getDescription());
        assertNotNull(dish.getId());

        log.debug("removing dish...");

        dishDao.remove(dish.getId());
        flush();
        
        category = categoryDao.get(category.getId());
        
        assertEquals("Seafood", category.getDescription());
        assertNotNull(category.getId());
        
        categoryDao.remove(category);

        // should throw DataAccessException
        dishDao.get(dish.getId());
    }
}
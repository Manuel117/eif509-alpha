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
import una.cr.alpha.model.Preference;

public class PreferencesDaoTest extends BaseDaoTestCase {

	@Autowired
    private DishDao dishDao;
	@Autowired
    private CategoryDao categoryDao;
	@Autowired
    private PreferenceDao preferenceDao;
	
	 @Test
	    public void testFindPreferenceByDish() throws Exception {
		 	Dish dish = new Dish();
		 	dish = dishDao.findByDescription("Pinto").get(0);
	        List<Preference> preferences = preferenceDao.findByDish(dish);
	        assertTrue(preferences.size() > 0);
	    }
	    

	    @Test(expected=DataAccessException.class)
	    public void testAddAndRemovePreference() throws Exception {
	    	Category category = new Category();
	    	category.setDescription("Seafood");
	    	
	    	category = categoryDao.save(category);
	    	
	    	Dish dish = new Dish();
	        dish.setDescription("Fish");

	        dish = dishDao.save(dish);
	        
	        Preference preference = new Preference();
	        preference.setDish_id(dish);
	        
	        preference = preferenceDao.save(preference);
	        flush();
	        
	        preference = preferenceDao.get(preference.getId());

	        assertEquals("Fish", preference.getDish_id().getDescription());
	        assertNotNull(preference.getId());


	        log.debug("removing preference...");

	        preferenceDao.remove(preference.getId());
	        flush();
	        
	        dishDao.remove(dish.getId());
	        flush();
	        
	        category = categoryDao.get(category.getId());
	        
	        assertEquals("Seafood", category.getDescription());
	        assertNotNull(category.getId());
	        
	        categoryDao.remove(category);

	        // should throw DataAccessException
	        preferenceDao.get(preference.getId());
	    }

}

package una.cr.alpha.dao;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import una.cr.alpha.model.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

public class CategoryDaoTest extends BaseDaoTestCase {

	@Autowired
    private CategoryDao categoryDao;

    @Test
    public void testFindCategoryByDescription() throws Exception {
        List<Category> categories = categoryDao.findByDescription("Breakfast");
        assertTrue(categories.size() > 0);
    }
    

    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveCategory() throws Exception {
        Category category = new Category();
        category.setDescription("Lunch");

        category = categoryDao.save(category);
        flush();

        category = categoryDao.get(category.getId());

        assertEquals("Lunch", category.getDescription());
        assertNotNull(category.getId());

        log.debug("removing category...");

        categoryDao.remove(category.getId());
        flush();

        // should throw DataAccessException
        categoryDao.get(category.getId());
    }
}


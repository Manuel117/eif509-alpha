package una.cr.alpha.dao;

import org.appfuse.dao.BaseDaoTestCase;

import una.cr.alpha.model.Menu;
import una.cr.alpha.dao.MenuDao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

import static org.junit.Assert.*;
public class MenuDaoTest extends BaseDaoTestCase {
	
	@Autowired
    private MenuDao menuDao;

	@Test
    public void testFindById() throws Exception {
        List<Menu> menus = menuDao.findById((long)1);
        assertTrue(menus.size() > 0);
    }
	
}

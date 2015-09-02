package una.cr.alpha.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import una.cr.alpha.model.Category;

public interface CategoryDao extends GenericDao<Category, Long> {

    public List<Category> findByDescription(String description);
}



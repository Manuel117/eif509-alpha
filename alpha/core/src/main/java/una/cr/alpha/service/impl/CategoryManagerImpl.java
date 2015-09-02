package una.cr.alpha.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import una.cr.alpha.dao.CategoryDao;
import una.cr.alpha.model.Category;
import una.cr.alpha.service.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoryManager")
@WebService(serviceName = "CategoryService", endpointInterface = "una.cr.alpha.service.CategoryManager")
public class CategoryManagerImpl extends GenericManagerImpl<Category, Long> implements CategoryManager {
	CategoryDao categoryDao;
	
	public CategoryManagerImpl() {}
	
	 @Autowired
	    public CategoryManagerImpl(CategoryDao categoryDao) {
	        super(categoryDao);
	        this.categoryDao = categoryDao;
	    }

	    public List<Category> findByDescription(String description) {
	        return categoryDao.findByDescription(description);
	    }

	    public List<Category> getCategories() {
	        return categoryDao.getAll();
	    }

	
}


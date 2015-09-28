package una.cr.alpha.dao;

import org.appfuse.dao.GenericDao;

import una.cr.alpha.model.Rate;

public interface RateDao extends GenericDao<Rate,Long> {
    public Rate findById(Long id);
    
}

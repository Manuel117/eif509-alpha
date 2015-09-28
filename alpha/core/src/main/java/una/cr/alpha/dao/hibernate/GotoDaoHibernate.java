package una.cr.alpha.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.GotoDao;
import una.cr.alpha.model.Goto;


@Repository("gotoDao")
public class GotoDaoHibernate extends GenericDaoHibernate<Goto,Long> implements GotoDao {
	public GotoDaoHibernate() {
        super(Goto.class);
    }
	public Goto findById(Long id){
		return(Goto)getSession().createCriteria(Goto.class).add(Restrictions.eq("idgoto", id)).uniqueResult();
	}
}

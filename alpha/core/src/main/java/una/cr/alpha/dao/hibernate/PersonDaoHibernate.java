package una.cr.alpha.dao.hibernate;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.appfuse.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import una.cr.alpha.dao.PersonDao;
import una.cr.alpha.model.Person;

@Repository("personDao")
public class PersonDaoHibernate extends GenericDaoHibernate<Person, Long> implements PersonDao {

    public PersonDaoHibernate() {
        super(Person.class);
    }

    public Person findById(Long id) {
        return (Person) getSession().get(Person.class, new Long(id));
    }
    
    public Person findByUser(User user) {
        return (Person) getSession().createCriteria(Person.class).add(Restrictions.eq("user", user)).uniqueResult();
    }
    
    public Person findByNickname(String nickname) {
    	Criteria c2 = getSession().createCriteria(Person.class);
    	c2.add(Restrictions.eq("nickname",new String(nickname)));
    	c2.setMaxResults(1);
    	Person person=(Person)c2.list().get(0);
    	return person;
    	//return (Person) getSession().get(arg0, arg1, arg2);
    }
    //return (Person) getSession().get(Person.class, new String(nickname));
    public List<Person> findByBirthday(Date date){
        return getSession().createCriteria(Person.class).add(Restrictions.eq("date", date)).list();
    }

    public List<Person> findByFirstName(String firstName){
        return getSession().createCriteria(Person.class).add(Restrictions.eq("firstName", firstName)).list();
    }
    
    public List<Person> findByLastName(String lastName){
        return getSession().createCriteria(Person.class).add(Restrictions.eq("lastName", lastName)).list();
    }

}

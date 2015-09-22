package una.cr.alpha.dao;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.GenericDao;
import org.appfuse.model.User;

import una.cr.alpha.model.Person;

public interface PersonDao extends GenericDao<Person, Long> {
    public Person findById(Long id);
    
    public Person findByUser(User user);
    
    public Person findByNickname(String nickname);

    public List<Person> findByBirthday(Date date);

    public List<Person> findByFirstName(String firstName);
    
    public List<Person> findByLastName(String lastName);

}

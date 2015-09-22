package una.cr.alpha.service.impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.appfuse.model.User;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import una.cr.alpha.dao.PersonDao;
import una.cr.alpha.model.Person;
import una.cr.alpha.service.PersonManager;

@Service("personManager")
@WebService(serviceName = "PersonService", endpointInterface = "una.cr.alpha.service.PersonManager")
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager {
	PersonDao personDao;

    public PersonManagerImpl() {}

    @Autowired
    public PersonManagerImpl(PersonDao personDao) {
        super(personDao);
        this.personDao = personDao;
    }

    public Person findById(Long id) {
        return personDao.findById(id);
    }
    
    public Person findByUser(User user) {
        return personDao.findByUser(user);
    }
    
    public Person findByNickname(String nickname) {
        return personDao.findByNickname(nickname);
    }
    
    public List<Person> findByBirthday(Date date) {
        return personDao.findByBirthday(date);
    }
    
    public List<Person> findByFirstName(String firstName) {
        return personDao.findByFirstName(firstName);
    }
    
    public List<Person> findByLastName(String lastName) {
        return personDao.findByLastName(lastName);
    }

    public List<Person> getPeople() {
        return personDao.getAll();
    }

}

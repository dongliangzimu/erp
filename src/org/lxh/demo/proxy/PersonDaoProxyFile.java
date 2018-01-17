package org.lxh.demo.proxy;

import java.util.Set;

import org.lxh.demo.dao.PersonDao;
import org.lxh.demo.dao.impl.PersonDaoImpl;
import org.lxh.demo.vo.Person;

public class PersonDaoProxyFile implements PersonDao {
    
	private PersonDao personDao;
	public PersonDaoProxyFile(){
		personDao = new PersonDaoImpl();
	}
	@Override
	public boolean doCreate(Person person) throws Exception {
		
		return this.personDao.doCreate(person);
	}

	@Override
	public boolean doUpdate(Person person) throws Exception {
		
		return this.personDao.doUpdate(person);
	}

	@Override
	public boolean doDelete(String id) throws Exception {
		
		return this.personDao.doDelete(id);
	}

	@Override
	public Set<? extends Person> findAll() throws Exception {
		
		return this.personDao.findAll();
	}

	@Override
	public Person findById(String id) throws Exception {
		
		return this.personDao.findById(id);
	}

	@Override
	public Set<? extends Person> findByLike(String keyWord) throws Exception {
        
		return this.personDao.findByLike(keyWord);
	}

}

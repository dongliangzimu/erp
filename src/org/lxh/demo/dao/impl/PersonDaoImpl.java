package org.lxh.demo.dao.impl;

import java.util.Set;

import org.lxh.demo.dao.PersonDao;
import org.lxh.demo.vo.Person;

public class PersonDaoImpl implements PersonDao {

	@Override
	public boolean doCreate(Person person) throws Exception {
		return false;
	}

	@Override
	public boolean doUpdate(Person person) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doDelete(String id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<? extends Person> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<? extends Person> findByLike(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

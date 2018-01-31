package org.lxh.demo.dao;

import java.util.Set;

import org.lxh.demo.vo.Person;

/**
 * 定义具体的操作数据的方法
 * @author Administrator
 *
 */
public interface PersonDao {
	
	/**
	 * 插入数据的操作，   
	 * @param person 插入的是一个人员信息
	 * @return 操作成功与否的提示
	 * @throws Exception  如果有异常，则把异常抛出
	 */
	public boolean doCreate(Person person) throws Exception;
	
	/**
	 * 更新数据的操作，判断更新成功与否 
	 * @param person 修改的是一个人员信息
	 * @return 操作成功与否的提示
	 * @throws Exception  如果有异常，则把异常抛出
	 */
	public boolean doUpdate(Person person)throws Exception;
	
	
	/**
	 * 删除数据的操作
	 * @param person 根据人员的编号,删除的是一个人员信息
	 * @return 操作成功与否的提示
	 * @throws Exception  如果有异常，则把异常抛出
	 */
	public boolean doDelete(String id)throws Exception;
	
	
	
	/**
	 * 查询数据的操作
	 * @param person 查询全部人员信息
	 * @return 查询成功与否的提示
	 * @throws Exception  如果有异常，则把异常抛出
	 */
	
	public Set<? extends Person> findAll()throws Exception;
	
	/**
	 * 精准查询，根据人员编号，查询人员的信息
	 * @param person 查询全部人员信息
	 * @return 查询成功与否的提示
	 * @throws Exception  如果有异常，则把异常抛出
	 */
	 
	public Person findById(String id)throws Exception;
	
	/**
	 * 根据关键字进行模糊查询
	 * @param person 按照关键字查询
	 * @return 返回一个set 集合
	 * @throws Exception  如果有异常，则把异常抛出
	 */
     
	public Set<? extends Person> findByLike(String keyWord)throws Exception;
		
	
}

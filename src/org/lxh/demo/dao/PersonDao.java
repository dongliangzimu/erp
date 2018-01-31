package org.lxh.demo.dao;

import java.util.Set;

import org.lxh.demo.vo.Person;

/**
 * �������Ĳ������ݵķ���
 * @author Administrator
 *
 */
public interface PersonDao {
	
	/**
	 * �������ݵĲ�����   
	 * @param person �������һ����Ա��Ϣ
	 * @return �����ɹ�������ʾ
	 * @throws Exception  ������쳣������쳣�׳�
	 */
	public boolean doCreate(Person person) throws Exception;
	
	/**
	 * �������ݵĲ������жϸ��³ɹ���� 
	 * @param person �޸ĵ���һ����Ա��Ϣ
	 * @return �����ɹ�������ʾ
	 * @throws Exception  ������쳣������쳣�׳�
	 */
	public boolean doUpdate(Person person)throws Exception;
	
	
	/**
	 * ɾ�����ݵĲ���
	 * @param person ������Ա�ı��,ɾ������һ����Ա��Ϣ
	 * @return �����ɹ�������ʾ
	 * @throws Exception  ������쳣������쳣�׳�
	 */
	public boolean doDelete(String id)throws Exception;
	
	
	
	/**
	 * ��ѯ���ݵĲ���
	 * @param person ��ѯȫ����Ա��Ϣ
	 * @return ��ѯ�ɹ�������ʾ
	 * @throws Exception  ������쳣������쳣�׳�
	 */
	
	public Set<? extends Person> findAll()throws Exception;
	
	/**
	 * ��׼��ѯ��������Ա��ţ���ѯ��Ա����Ϣ
	 * @param person ��ѯȫ����Ա��Ϣ
	 * @return ��ѯ�ɹ�������ʾ
	 * @throws Exception  ������쳣������쳣�׳�
	 */
	 
	public Person findById(String id)throws Exception;
	
	/**
	 * ���ݹؼ��ֽ���ģ����ѯ
	 * @param person ���չؼ��ֲ�ѯ
	 * @return ����һ��set ����
	 * @throws Exception  ������쳣������쳣�׳�
	 */
     
	public Set<? extends Person> findByLike(String keyWord)throws Exception;
		
	
}

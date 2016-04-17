package com.lauren.lr.test.dao;

import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.lauren.lr.test.entity.Cpu;

public class CpuDaoImpl  extends HibernateDaoSupport implements CpuDao { 
	
	@Autowired
	public void setSessionFactory0(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public void updateCpu(int id, Map<String, Object> params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCpuByHQL(int id, Map<String, Object> params) {
		this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {
			
			@Override
			public Object doInHibernate(Session session) throws HibernateException{
				StringBuilder hql = new StringBuilder();
				hql.append("UPDATE Cpu T SET");
				Query query = session.createQuery(hql.toString());
				query.executeUpdate();
				return null;
			
			}
		});
		
	}

	@Override
	public void insertSingleCpuObj(Cpu cpu) {
		this.getHibernateTemplate().save(cpu);
		
	}

	@Override
	public void deleteSingleCpuObj(Cpu cpu) {
		this.getHibernateTemplate().delete(cpu);
	}

}

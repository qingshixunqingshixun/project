package online.shixun.preject.Dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FinancingDao {
	private SessionFactory sessionFactory;
	
	@Resource(name="mySessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//获取session
	public Session getsession(){
		return sessionFactory.getCurrentSession();
	}
}

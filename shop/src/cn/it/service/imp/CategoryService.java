package cn.it.service.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cn.it.model.Category;
import cn.it.service.CategoryInterface;
import cn.it.util.HibernateSessionFactory;

public class CategoryService implements CategoryInterface {
	
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
		
	}
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	@Override//手动开启事务
	public void save(Category category) {
		
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		try {
			Transaction tx =session.getTransaction();
			tx.begin();
//			执行业务逻辑
			session.save(category);
			tx.commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		finally {
			HibernateSessionFactory.closeSession();
		}

	}
	
	@Override/*spring管理事务*/
	public void update(Category category) {
		
		getSession().update(category);
	}
}

package cn.it.service.imp;

import cn.it.model.Category;
import cn.it.service.CategoryInterface;

@SuppressWarnings("unchecked")
public class CategoryService extends BaseServiceImpl <Category> implements CategoryInterface {
	
//	用于查询或其他事务
	public CategoryService(){
		super();
	}
	
	/*private SessionFactory sessionFactory;
	
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
	
	@Override
	public void save(Category category) {
		getSession().save(category);
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub mathod 1 
		Object object = getSession().get(Category.class, id);
		if (object != null)
			getSession().delete(object);
//		method 2
		String hql = "DELETE Category WHERE id = id";
		getSession().createQuery(hql).setInteger("id", id).executeUpdate();
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return (Category)getSession().get(Category.class, id);
	}


	@Override
	public List<Category> query() {
		// TODO Auto-generated method stub
		String hqlString = "FROM Category";
		return getSession().createQuery(hqlString).list();
	}


	@Overridespring管理事务
	public void update(Category category) {
		
		getSession().update(category);
	}*/
}

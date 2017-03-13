package cn.it.service.imp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.it.model.Department;
import cn.it.service.DepartmentDao;
import cn.it.util.HibernateSessionFactory;

public class DepartmentService implements DepartmentDao {

	@Override
	public void save(Department department) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		try {
			Transaction tx =session.getTransaction();
			tx.begin();
			session.save(department);
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw new RuntimeException(e);
			// TODO: handle exception
		}
		finally {
			HibernateSessionFactory.closeSession();
		}

	}

}

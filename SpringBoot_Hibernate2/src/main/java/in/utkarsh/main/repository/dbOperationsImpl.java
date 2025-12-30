package in.utkarsh.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import in.utkarsh.main.config.HibernateConfig;
import in.utkarsh.main.entities.User;

@Repository
public class dbOperationsImpl implements dbOperations{

	@Override
	public User getUserDetails(Long id) {
		
		User user=null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			user = session.get(User.class, id);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}

}

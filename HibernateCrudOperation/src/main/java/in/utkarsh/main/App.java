package in.utkarsh.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import in.utkarsh.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	User user = new User();
//
//      	user.setName("priya");
//    	user.setEmail("priya@gmail");
//    	user.setPassword("priya");
//    	user.setGender("priya");
//    	user.setCity("delhi");    
    	
        Configuration cfg = new Configuration();
        cfg.configure("/in/utkarsh/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        //------------------INSERTION operation----------
//        try {
//        	
//        	session.save(user);
//        	transaction.commit();
//        	
//        	System.out.println("User Details added Successfully");
//			
//		} catch (Exception e) {
//
//			transaction.rollback();
//			System.out.println("User Details are not added due to some error");
//           e.printStackTrace();
//			
//		}
        
        //----------SELECT operation------------------
        
//        try {
//			
//        	User user1 = session.get(User.class, 2L);
//        	if (user1!=null) {
//        		
//        		System.out.println(user1.getId());
//            	System.out.println(user1.getName());
//            	System.out.println(user1.getEmail());
//            	System.out.println(user1.getPassword());
//            	System.out.println(user1.getGender());
//            	System.out.println(user1.getCity());
//				
//			} else {
//                     
//				System.out.println("No record exist with this ID");
//			}
//        	
//		} catch (Exception e) {
//			e.printStackTrace()	;
//			}
        
      //  ------------------UPDATE operation----------
//      try {
//      	
//    		User user = session.get(User.class, 3L);
//    		user.setCity("pune");
//          	session.saveOrUpdate(user);
//         	transaction.commit();
//      	
//      	System.out.println("User Details updated Successfully");
//			
//		} catch (Exception e) {
//
//			transaction.rollback();
//			System.out.println("User Details are not updated due to some error");
//            e.printStackTrace();
//			
//		}
      
      //  ------------------UPDATE operation----------
      try {
      	
    		User user = new User();
    		user.setId(3L);
    		
          	session.delete(user);
         	transaction.commit();
      	
      	System.out.println("User Details deleted Successfully");
			
		} catch (Exception e) {

			transaction.rollback();
			System.out.println("User Details are not deleted due to some error");
            e.printStackTrace();
			
		}
    }
}

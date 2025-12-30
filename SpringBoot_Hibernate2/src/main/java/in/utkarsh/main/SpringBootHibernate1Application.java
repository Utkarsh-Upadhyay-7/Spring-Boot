package in.utkarsh.main;

import org.springframework.boot.SpringApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.utkarsh.main.entities.User;
import in.utkarsh.main.repository.dbOperations;

@SpringBootApplication
public class SpringBootHibernate1Application {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(SpringBootHibernate1Application.class, args);
		
		 dbOperations dbop =  context.getBean(dbOperations.class);
         User user = dbop.getUserDetails(1L);
         
     	if (user!=null) {
     		
     		System.out.println(user.getId());
         	System.out.println(user.getName());
         	System.out.println(user.getEmail());
         	System.out.println(user.getPassword());
         	System.out.println(user.getGender());
         	System.out.println(user.getCity());
				
			} else {
                  
				System.out.println("No record exist with this ID");
			}
	        
	}

}

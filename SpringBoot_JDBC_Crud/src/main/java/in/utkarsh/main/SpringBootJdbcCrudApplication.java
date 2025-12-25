package in.utkarsh.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.utkarsh.main.dao.UserDao;
import in.utkarsh.main.entity.User;

@SpringBootApplication
public class SpringBootJdbcCrudApplication implements CommandLineRunner{
    
	@Autowired
	private UserDao userdao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//----------------------INSERTION-----------------------------------
//		User user1 = new User("Amit", "amit@gmail.com", "male", "delhi");
	//	User user2 = new User("Abhishek", "abhishek@gmail.com", "male", "chandigarh");
//		Boolean status = userdao.insertUser(user1);
//		if(status)
//		{
//			System.out.println("User inserted Succesfully");
//		}
//		else {
//			System.out.println("User not inserted due to some error");
//		}	
		
		//----------------------UPDATION 1----------------------------------
//		User user = new User("Abhishek", "abhishek@gmail.com", "male", "pune");
//		Boolean status = userdao.updateUser(user);
//		if(status)
//		{
//			System.out.println("User updated Succesfully");
//		}
//		else {
//			System.out.println("User not updated due to some error");
//		}	
		
		//----------------------UPDATION 2----------------------------------
//		User user = userdao.getUserByEmail("amit@gmail.com");
//		user.setCity("lucknow");
//		Boolean status = userdao.updateUser(user);
//		if(status)
//		{
//			System.out.println("User updated Succesfully");
//		}
//		else {
//			System.out.println("User not updated due to some error");
//		}
		
		//----------------------DELETION----------------------------------
		
//		Boolean status = userdao.deleteUserByEmail("amit@gmail.com");
//		if(status)
//			{
//				System.out.println("User deleted Succesfully");
//			}
//			else {
//				System.out.println("User not deleted due to some error");
//			}	
		
		//---------------------SELECT ONE USER-----------------------------
//		User user = userdao.getUserByEmail("abhishek@gmail.com");
//		System.out.println("Name : "+user.getName());
//		System.out.println("email : "+user.getEmail());
//		System.out.println("Gender : "+user.getGender());
//		System.out.println("City : "+user.getCity());
		
		//---------------SELECT ALL USERS---------------------------
		List<User> list = userdao.getAllUsers();
		for(User user :list)
		{
			System.out.println("Name : "+user.getName());
			System.out.println("email : "+user.getEmail());
			System.out.println("Gender : "+user.getGender());
			System.out.println("City : "+user.getCity());
			System.out.println("--------------------");
		}
		
	}
}

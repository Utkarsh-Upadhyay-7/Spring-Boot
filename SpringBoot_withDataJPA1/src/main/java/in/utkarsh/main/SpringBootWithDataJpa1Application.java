package in.utkarsh.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.utkarsh.main.entities.Student;
import in.utkarsh.main.services.studentService;
import in.utkarsh.main.services.studentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
	studentService stdService = context.getBean(studentServiceImpl.class);
	
	// --------Insertion-------------
//	Student std = new Student();
//	std.setName("Abhishek");
//	std.setRollno(16);
//	std.setMarks(91);
//	
//	boolean status = stdService.addStudentDetails(std);
//	if(status) {
//		System.out.println("Student inserted successfully");
//	}
//	else
//	{
//		System.out.println("Student not inserted successfully");
//	}
	
	// Select operation
//	List<Student> stdList= stdService.getAllDetails();
//	for(Student std : stdList) {
//		System.out.println("Id: "+ std.getId());
//		System.out.println("Name: "+ std.getName());
//		System.out.println("Rollno: "+ std.getRollno());
//		System.out.println("Marks: "+ std.getMarks());
//		
//		System.out.println("--------------------------------");
//	}
	
	//select one value by id
//	Student std= stdService.getStdDetails(1L);
//	if(std != null)
//	{System.out.println("Id: "+ std.getId());
//	System.out.println("Name: "+ std.getName());
//	System.out.println("Rollno: "+ std.getRollno());
//	System.out.println("Marks: "+ std.getMarks());
//	}
//	else {
//		System.out.println("Student not Found with this ID");
//	}
	
	//----------update operation
//	boolean status = stdService.updateStdDetails(1L, 93.6f);
//	if(status) {
//		System.out.println("Student details updated successfully");
//	}
//	else {
//		System.out.println("Student details not updated due to error");
//	}
	//----------delete operation
	boolean status = stdService.deleteStdDetails(2L);
	if (status) {
		System.out.println("Student details deleted successfully");
	} else {
		System.out.println("Student details not deleted due to error");
	}
	}
}

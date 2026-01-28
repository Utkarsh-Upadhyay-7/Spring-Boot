package in.utkarsh.main.services;

import java.util.List;

import in.utkarsh.main.entities.Student;

public interface studentService {

	public boolean addStudentDetails(Student std);
	public List<Student> getAllDetails();
	public Student getStdDetails(long id);
	public boolean updateStdDetails(long id, float marks);
	public boolean deleteStdDetails(long id);
}

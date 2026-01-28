package in.utkarsh.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.utkarsh.main.SpringBootWithDataJpa1Application;
import in.utkarsh.main.entities.Student;
import in.utkarsh.main.repository.studentRepository;

@Service
public class studentServiceImpl implements studentService {

    private final SpringBootWithDataJpa1Application springBootWithDataJpa1Application;
	
	@Autowired
	private studentRepository studentRepo;

    studentServiceImpl(SpringBootWithDataJpa1Application springBootWithDataJpa1Application) {
        this.springBootWithDataJpa1Application = springBootWithDataJpa1Application;
    }

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		
		try {
			studentRepo.save(std);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}

	@Override
	public List<Student> getAllDetails() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStdDetails(long id) {
		Optional<Student> optional = studentRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public boolean updateStdDetails(long id, float marks) {
		
		Student std = this.getStdDetails(id);
		if(std != null) {
			std.setMarks(marks);
			studentRepo.save(std);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStdDetails(long id) {
		boolean status=false;
		try {
			studentRepo.deleteById(id);
			status = true;
		}
		catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}

}

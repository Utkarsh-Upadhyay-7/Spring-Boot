package in.utkarsh.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.utkarsh.main.entities.Student;

public interface studentRepository extends JpaRepository<Student, Long> {
	

}

package in.utkarsh.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.utkarsh.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

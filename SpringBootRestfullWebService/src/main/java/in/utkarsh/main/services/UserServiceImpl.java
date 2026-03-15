package in.utkarsh.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.utkarsh.main.entities.User;
import in.utkarsh.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserDetails(int id) {
		
		return userRepo.findById(id);
	}

	@Override
	public User updateUserDetails(int id, User newUser) {

      User userData = userRepo.findById(id).orElse(null);
      
      if(userData != null)
      {
    	  return userRepo.save(newUser);
      }
      
	   throw new RuntimeException("User not found with id : " + id);
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
		
	}

}

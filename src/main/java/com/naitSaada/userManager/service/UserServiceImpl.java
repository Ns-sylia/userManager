package com.naitSaada.userManager.service;

import com.naitSaada.userManager.Repository.UserRepository;
import com.naitSaada.userManager.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
      this.userRepository = userRepository;
    }
    
    
    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    
    
    @Override
    public Optional<List<User>> findAll() {
        return Optional.of(userRepository.findAll());
    }

    @Override
    public void deleteByID(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void save(User e) {
        userRepository.save(e);
    }

    @Override
    public void update(User e) {
        userRepository.save(e);
    }

	@Override
	public void addMany(List<User> userList) {
		userRepository.saveAll(userList);
	}
    

}

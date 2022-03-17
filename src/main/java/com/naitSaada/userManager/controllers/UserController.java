package com.naitSaada.userManager.controllers;

import com.naitSaada.userManager.models.User;
import com.naitSaada.userManager.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    private final com.naitSaada.userManager.service.UserServiceImpl UserServiceImpl;

    @Autowired
    public UserController(UserServiceImpl employeeServiceImpl) {
      this.UserServiceImpl = employeeServiceImpl;
    }
    
    
    @PostMapping("/add")
    public void save(@RequestBody User e) {
       UserServiceImpl.save(e);
    }

    @PutMapping("/update")
    public void update(@RequestBody User e) {
        UserServiceImpl.save(e);
    }

    @DeleteMapping("/delete/{idUtilisateur}")
    void delete(@PathVariable("idUtilisateur") Integer id){
    	UserServiceImpl.deleteByID(id);
    }
    
    @GetMapping("/all")
    public Optional<List<User>> findAll() {
        return UserServiceImpl.findAll();
    }
    
    @GetMapping("/findById/{idUtilisateur}")
    public Optional<User> findById(@PathVariable("idUtilisateur") Integer id) {
        return UserServiceImpl.findById(id);
    }
    
    @PostMapping("/addMany")
	public void addMany(@RequestBody List<User> userList) {
		UserServiceImpl.addMany(userList);
	}

}
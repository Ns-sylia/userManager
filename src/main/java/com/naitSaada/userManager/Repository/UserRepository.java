package com.naitSaada.userManager.Repository;

import com.naitSaada.userManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

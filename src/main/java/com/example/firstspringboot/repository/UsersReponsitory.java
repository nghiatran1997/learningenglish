package com.example.firstspringboot.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.firstspringboot.model.Users;

@Repository
public interface UsersReponsitory extends JpaRepository<Users, Long>{
	
	// Select all user
	@Query(value="SELECT * FROM USERS", nativeQuery = true)
	List<Users> getAllUsers();
	
	
	@Query(value="SELECT * FROM USERS WHERE USER_NAME =:username AND PASSWORD =:password", nativeQuery = true)
	Users authentication(@Param("username") String username, @Param("password") String password);
	
}

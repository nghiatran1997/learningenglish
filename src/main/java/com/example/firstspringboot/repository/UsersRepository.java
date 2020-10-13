package com.example.firstspringboot.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.firstspringboot.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	
	// Select all user
	@Query(value="SELECT * FROM USERS", nativeQuery = true)
	List<Users> getAllUsers();
	
	// API check exist user at regist
	@Query(value="SELECT COUNT(*) USER_NAME FROM USERS WHERE USER_NAME =:username", nativeQuery = true)
	Integer checkExistUserAPI(@Param("username") String username);
	
	// Check users to validate regist
	@Query(value="SELECT * FROM USERS WHERE USER_NAME =:username", nativeQuery = true)
	Users checkExistUser(@Param("username") String username);
	
	// Select Users to login
	@Query(value="SELECT * FROM USERS WHERE USER_NAME =:username AND PASSWORD =:password", nativeQuery = true)
	Users authentication(@Param("username") String username, @Param("password") String password);
	

}

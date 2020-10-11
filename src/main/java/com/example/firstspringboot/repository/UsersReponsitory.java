package com.example.firstspringboot.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.firstspringboot.model.Users;

@Repository
public interface UsersReponsitory extends JpaRepository<Users, Long>{
	
	// Select all user
	@Query(value="SELECT * FROM USERS", nativeQuery = true)
	List<Users> getAllUsers();
	
	@Query(value="SELECT * FROM USERS WHERE USER_NAME =:username", nativeQuery = true)
	Users checkExistUser(@Param("username") String username);
	
	
	@Query(value="SELECT * FROM USERS WHERE USER_NAME =:username AND PASSWORD =:password", nativeQuery = true)
	Users authentication(@Param("username") String username, @Param("password") String password);
	
	@Transactional
	@Query(value="INSERT INTO USERS(USER_NAME,PASSWORD,FIRST_NAME,LAST_NAME) VALUES (:username,:password,:firstname,:lastname)", nativeQuery = true)
	Integer insertNewUser(@Param("username") String username, @Param("password") String password, @Param("firstname") String firstName,@Param("lastname") String lastName);
	
}

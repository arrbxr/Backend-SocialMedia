package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User save(User user);

	ArrayList<User> findAll();

	User findAllByuserID(String userID);

}

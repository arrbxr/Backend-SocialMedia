package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import com.example.demo.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

	User save(User user);

	ArrayList<User> findAll();

	User findAllByuserID(UUID userID);

}

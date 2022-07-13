package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

	ArrayList<Post> findAll();

	Post save(Post post);

	void deleteById(UUID postID);

}

package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status, UUID> {

	Status save(Status status);

	ArrayList<Status> findAll();

}

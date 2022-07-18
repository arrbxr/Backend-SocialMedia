package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userID;
	private String userName;
	private String userImage;
	private boolean active;
	private Timestamp joiningDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "us_stts", referencedColumnName = "userID")
	List<Status> status = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "us_po", referencedColumnName = "userID")
	List<Post> posts = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "us_co", referencedColumnName = "userID")
	List<Comment> comment = new ArrayList<>();	
}

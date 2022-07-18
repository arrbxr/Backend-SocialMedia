package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "Post")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id
	private Long postID;
	private String userName;
	private String imageURL;
	private String description;
	private String postImgURL;
	private int likes;
	private Timestamp dateTime;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "po_co", referencedColumnName = "postID")
	List<Comment> comments = new ArrayList<>();
	
}
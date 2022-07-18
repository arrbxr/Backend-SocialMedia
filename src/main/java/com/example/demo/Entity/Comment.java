package com.example.demo.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comment")

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

	@Id
	private Long commentID;
	private Long postID;
	private String userImage;
	private String userName;
	public void setTimestamp(Timestamp dateTime) {
		// TODO Auto-generated method stub
		
	}

	
}

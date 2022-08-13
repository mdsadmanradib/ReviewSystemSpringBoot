package net.javaguides.rsm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "dir_name", nullable = false)
	private String dirName;

	@Column(name = "release", nullable = false)
	private String release;

	@Column(name = "rating", nullable = false)
	private String rating;

	@Column(name = "status", nullable = false)
	private String status;
	
	public Movies() {
		
	}
	
	public Movies(String name, String dirName, String release, String rating, String status) {
		super();
		this.name = name;
		this.dirName = dirName;
		this.release = release;
		this.rating = rating;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirName() {
		return dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}

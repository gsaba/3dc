package org.climbing.domain;
// Generated 14-feb-2016 21.19.01 by Hibernate Tools 4.3.1.Final

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
//	private List<Comment> comments = new ArrayList<Comment>();
//	private List<Person> persons = new ArrayList<Person>();
	private List<Role> roles = new ArrayList<Role>();

	public User() {}

//	public User(String username, String password, Set comments, Set persons, Set roles) {
//		this.username = username;
//		this.password = password;
//		this.comments = comments;
//		this.persons = persons;
//		this.roles = roles;
//	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	public List<Person> getPersons() {
//		return persons;
//	}
//
//	public void setPersons(List<Person> persons) {
//		this.persons = persons;
//	}


}

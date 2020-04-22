package com.jeu.hibernate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private String dob;
    @Column(name="image")
	private byte[] image;
	@Transient
	private String base64;
    public UserDetails() {
    }
    public UserDetails(int id, String firstName, String lastName, String email, String dob,byte[] image ,String base64) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.image = this.image;
	    this.base64 = this.base64;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    @Transient //Annotation so it does not persist in the database
	public String getBase64() {
	    //Convert the data type byte to String, store it in the variable and return it
	    return this.base64 = Base64.encode(this.image); 
	}

	public void setBase64(String base64) {
	    this.base64 = base64;
	}
	@Column(name = "image")
	public byte[] getImagec() {
	    return this.image;
	}

	public void setImagec(byte[] image) {
	    this.image = image;
	}

}
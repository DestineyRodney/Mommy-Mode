package com.example.newlywed.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "First name cannot be empty.")
    private String firstName;

    @Column(nullable = false, length = 50)
    @NotEmpty(message = "Last name cannot be empty.")
    private String lastName;

    @Column(nullable = false, length = 75)
    @NotEmpty(message = "Username cannot be empty.")
    private String username;

    @Column(nullable = false, length = 255)
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private String dateOfBirth;

    @Column (nullable = false, length = 255)
    private String address;

    @Column (nullable = false, length = 50)
    private String city;

    @Column (nullable = false, length = 2)
    private String state;

    @Column (nullable = false)
    private int zipcode;


//    Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

//    CONSTRUCTORS

    public User(long id, String firstName, String lastName, String username, String email, String dateOfBirth, String address, String city, String state, int zipcode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
//    makes sure instance is always valid
    public User(){}
}



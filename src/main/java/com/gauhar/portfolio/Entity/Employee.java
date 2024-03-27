package com.gauhar.portfolio.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "employee_name", length = 255)
    private String name;

    @Column(name = "employee_phoneno", length = 255)
    private String phone;

    @Column(name = "employee_email", length = 255)
    private String email;

    @Column(name = "employee_message", length = 1000)
    private String message;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(Long id, String name, String phone, String email, String message) { // Changed type of phone parameter
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }

    // Getters and setters
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.aizecode.entity;

import jakarta.persistence.*;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "student_name")
    private String student_name;
    @Column(name = "student_email")
    private String student_email;
    @Column(name = "student_age")
    private int student_age;
    @Column(name = "student_gender")
    private String student_gender;

    public Student() {
    }

    public Student(int id, String student_name, String student_email, int student_age, String student_gender) {
        this.id = id;
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_age = student_age;
        this.student_gender = student_gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public String getStudent_gender() {
        return student_gender;
    }

    public void setStudent_gender(String student_gender) {
        this.student_gender = student_gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", student_email='" + student_email + '\'' +
                ", student_age=" + student_age +
                ", student_gender='" + student_gender + '\'' +
                '}';
    }
}

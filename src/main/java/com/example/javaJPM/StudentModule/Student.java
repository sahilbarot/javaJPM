package com.example.javaJPM.StudentModule;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student
{

    @Id      //Primary Key
    String id;

    String name;
    String course;
    int fees;

    public Student() {
    }

    public Student(String id, String name, String course, int fees) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}

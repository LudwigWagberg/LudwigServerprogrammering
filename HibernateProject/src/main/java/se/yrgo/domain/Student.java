package se.yrgo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// @Table(name = "TBL_STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // This line is optional
    private int id;

    @Column(name = "NUM_COURSES")
    private Integer numberOfCourses;

    // @ManyToOne
    // @JoinColumn(name = "TUTOR_FK")
    // privat;

    private String enrollmentID;
    private String name;

    public Student() {
    }

    public Student(String name, String enrollmentID) {
        this.name = name;
        this.enrollmentID = enrollmentID;
    }

    public String toString() {
        return "name:" + name;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(Integer numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}

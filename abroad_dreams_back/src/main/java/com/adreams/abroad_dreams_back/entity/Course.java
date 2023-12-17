package com.adreams.abroad_dreams_back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(generator = "courses_seq_gen", strategy = GenerationType.SEQUENCE)
    private Long courseId;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "credits", nullable = false)
    private int credits;

    @Column(name = "duration", nullable = false)
    private int duration;

//    @ManyToOne
//    @JoinColumn(name = "student_id", nullable = false)
//    private Student student;

    @ManyToOne
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;

    @Column(name = "course_fee", nullable = false)
    private double courseFee;

    @Column(name = "availability", nullable = false)
    private boolean availability;

//Need to add once Instructor is set up

//    @ManyToMany
//    @JoinTable(
//            name = "course_instructor",
//            joinColumns = @JoinColumn(name = "course_id"),
//            inverseJoinColumns = @JoinColumn(name = "instructor_id")
//    )
//    private Set<Instructor> instructors = new HashSet<>();

    // Other attributes, getters, setters, and methods as needed
}

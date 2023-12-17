package com.adreams.abroad_dreams_back.service.impl;

import com.adreams.abroad_dreams_back.entity.Course;
import com.adreams.abroad_dreams_back.pojo.CoursePojo;
import com.adreams.abroad_dreams_back.repo.CourseRepo;
import com.adreams.abroad_dreams_back.service.CourseService;
import com.adreams.abroad_dreams_back.service.InstitutionService;
//import com.adreams.abroad_dreams_back.service.StudentService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
//    private final StudentService studentService;
    private final InstitutionService institutionService;

    @Override
    public String save(CoursePojo coursePojo) {
        Course course;

        if (coursePojo.getCourseId() != null) {
            // If ID is present, fetch the existing course from the database
            course = courseRepo.findById(coursePojo.getCourseId())
                    .orElseThrow(() -> new EntityNotFoundException("Course not found with ID: " + coursePojo.getCourseId()));
        } else {
            // If ID is null, it's a new course
            course = new Course();
        }

        // Set values from CoursePojo to Course entity
        course.setCourseName(coursePojo.getCourseName());
        course.setCredits(coursePojo.getCredits());
        course.setDuration(coursePojo.getDuration());
        course.setCourseFee(coursePojo.getCourseFee());
        course.setAvailability(coursePojo.isAvailability());

        // Fetch and set the associated student using studentId after Student
//        course.setStudent(studentService.getById(coursePojo.getStudentId())
//                .orElseThrow(() -> new EntityNotFoundException("Student not found with ID: " + coursePojo.getStudentId())));

        // Fetch and set the associated institution using institutionId
        course.setInstitution(institutionService.getById(coursePojo.getInstitutionId())
                .orElseThrow(() -> new EntityNotFoundException("Institution not found with ID: " + coursePojo.getInstitutionId())));

        courseRepo.save(course); // Save the Entity
        return "Saved Successfully!";
    }

    @Override
    public List<Course> getAll() {
        return courseRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public Optional<Course> getById(Long id) {
        return courseRepo.findById(id);
    }

    // Other methods as needed
}

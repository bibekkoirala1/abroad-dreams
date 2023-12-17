package com.adreams.abroad_dreams_back.controller;

import com.adreams.abroad_dreams_back.entity.Course;
import com.adreams.abroad_dreams_back.pojo.CoursePojo;
import com.adreams.abroad_dreams_back.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveCourse(@RequestBody CoursePojo coursePojo) {
        String result = courseService.save(coursePojo);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAll();
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long id) {
        Optional<Course> course = courseService.getById(id);
        return course.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable("id") Long id) {
        courseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Add additional endpoints for updating and other operations as needed
}

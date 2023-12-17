package com.adreams.abroad_dreams_back.service;

import com.adreams.abroad_dreams_back.pojo.CoursePojo;
import com.adreams.abroad_dreams_back.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    String save(CoursePojo coursePojo);

    List<Course> getAll();

    void deleteById(Long id);

    Optional<Course> getById(Long id);

    // Other methods as needed
}

package com.adreams.abroad_dreams_back.pojo;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoursePojo {

    private Long courseId;

    @NotNull
    private String courseName;

    @NotNull
    private int credits;

    @NotNull
    private int duration;

    @NotNull
    private Long studentId;

    @NotNull
    private Long institutionId;

    @NotNull
    private double courseFee;

    @NotNull
    private boolean availability;

    // Other attributes, getters, setters, and methods as needed
}

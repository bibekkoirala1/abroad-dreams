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
public class CountryPojo {

    private Long id;

    @NotNull
    private String countryname;

    @NotNull
    private String countryshort;

}

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
public class InstitutionPojo {

    private Long id;

    @NotNull
    private String institutionName;

    @NotNull
    private String address;

    @NotNull
    private Long countryId;

    private String officialWebsite;


}

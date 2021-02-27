package com.hacettepe.rehabsoft.dto;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Data Transfer Object for CoexistingDiseases")
public class HearingImpairmentDto {
    private Long id;
    private Boolean isUseHearingAid;
}

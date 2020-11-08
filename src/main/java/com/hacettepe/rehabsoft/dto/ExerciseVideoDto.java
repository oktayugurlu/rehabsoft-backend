package com.hacettepe.rehabsoft.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Data Transfer Object for ExerciseVideo")
public class ExerciseVideoDto {

    @ApiModelProperty(required = true,value = "ID")
    private Long id;

    @NotEmpty
    @ApiModelProperty(required = true , value = "VideoUrl")
    private String videoUrl;

}
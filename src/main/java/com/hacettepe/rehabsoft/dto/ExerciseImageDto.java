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
@ApiModel(value = "Data Transfer Object for ExerciseImage")
public class ExerciseImageDto {

    @ApiModelProperty(required = true,value = "ID")
    private Long id;

    @NotEmpty
    @ApiModelProperty(required = true , value = "ImageUrl")
    private String imageurl;
}

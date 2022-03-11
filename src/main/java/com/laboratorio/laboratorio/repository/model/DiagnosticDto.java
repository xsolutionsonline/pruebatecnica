package com.laboratorio.laboratorio.repository.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NoArgsConstructor
@Data
public class DiagnosticDto {

    Long id;

    @Min(value=0)
    @Max(value=100)
    Long sugarPercentage;

    @Min(value=0)
    @Max(value=100)
    Long fatPercentage;

    @Min(value=0)
    @Max(value=100)
    Long oxygenPercentage;


    String risk;
}

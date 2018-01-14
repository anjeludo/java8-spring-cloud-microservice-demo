package com.anjeludo.microservicios.businesslogicapi.json;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FizzReport {
    private FizzBuzzJson fizzBuzz;
    private FizzReportRow reportRow;
}

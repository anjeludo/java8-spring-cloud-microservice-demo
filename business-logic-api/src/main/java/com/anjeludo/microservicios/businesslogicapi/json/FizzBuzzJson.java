package com.anjeludo.microservicios.businesslogicapi.json;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FizzBuzzJson {
    private String fizz;
    private String buzz;
    private Boolean isFizzBuzz;
    
    public FizzBuzzJson(String fizz) {
        this.fizz = fizz;
    }
}

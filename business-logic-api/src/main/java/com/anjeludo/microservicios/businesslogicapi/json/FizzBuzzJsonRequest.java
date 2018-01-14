package com.anjeludo.microservicios.businesslogicapi.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FizzBuzzJsonRequest extends FizzBuzzJson {
    private Long id;
}
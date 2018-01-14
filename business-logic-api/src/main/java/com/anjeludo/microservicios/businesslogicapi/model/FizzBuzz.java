package com.anjeludo.microservicios.businesslogicapi.model;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FizzBuzz {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String fizz;

    @Column(nullable = false)
    private String buzz;

    @Column
    private Boolean isFizzBuzz;
    
    public FizzBuzz(String fizz, String buzz, Boolean isFizzBuzz) {
        this.fizz = fizz;
        this.buzz = buzz;
        this.isFizzBuzz = isFizzBuzz;
    }
}

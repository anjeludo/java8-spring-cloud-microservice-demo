package com.anjeludo.microservicios.businesslogicapi.json;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FizzReportRow {
    private String complicatedData1;
    private Integer someTrickySumValue;
}

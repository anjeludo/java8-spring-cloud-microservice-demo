package com.anjeludo.microservicios.businesslogicapi.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anjeludo.microservicios.businesslogicapi.json.FizzReportRow;

import java.util.List;

@FeignClient("reports-api")
public interface ReportsApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/fizz/collate")
    ResponseEntity<List<FizzReportRow>> getFizzReportDataFromReportsApi(@RequestHeader("Authorization") String authorization);

}

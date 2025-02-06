package com.example.soapConsumerTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.soapConsumerTest.service.CountryService;
import com.example.soapConsumerTest.soap.TCountryCodeAndName;


@Controller
@RequestMapping("api/v1/app/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping()
    public ResponseEntity<List<TCountryCodeAndName>> getAllCountries() {
        
        List<TCountryCodeAndName> result = countryService.getCountryNames();

        return new ResponseEntity<>(result, HttpStatus.OK);

    }


}

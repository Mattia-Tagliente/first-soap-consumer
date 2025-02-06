package com.example.soapConsumerTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soapConsumerTest.client.CountryClient;
import com.example.soapConsumerTest.soap.ListOfCountryNamesByNameResponse;
import com.example.soapConsumerTest.soap.TCountryCodeAndName;

@Service
public class CountryService {

    @Autowired
    CountryClient countryClient;

    public List<TCountryCodeAndName> getCountryNames(){

        ListOfCountryNamesByNameResponse soapResponse = countryClient.getCountryNames();

        List<TCountryCodeAndName> array = soapResponse.getListOfCountryNamesByNameResult().getTCountryCodeAndName();

        return array;

    }

}

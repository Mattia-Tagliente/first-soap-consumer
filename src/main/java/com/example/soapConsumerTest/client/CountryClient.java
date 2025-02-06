package com.example.soapConsumerTest.client;

import java.util.List;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.soapConsumerTest.soap.ArrayOftCountryCodeAndName;
import com.example.soapConsumerTest.soap.ListOfCountryNamesByName;
import com.example.soapConsumerTest.soap.ListOfCountryNamesByNameResponse;
import com.example.soapConsumerTest.soap.TCountryCodeAndName;

public class CountryClient extends WebServiceGatewaySupport {

    public ListOfCountryNamesByNameResponse  getCountryNames(){

        ListOfCountryNamesByName request = new ListOfCountryNamesByName ();

        ListOfCountryNamesByNameResponse response = (ListOfCountryNamesByNameResponse) getWebServiceTemplate().
        marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",
        request);

        return response;

    }

}

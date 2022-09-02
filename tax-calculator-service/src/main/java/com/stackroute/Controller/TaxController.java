package com.stackroute.Controller;


import com.stackroute.RabbitMq.CustomMessage;
import com.stackroute.RabbitMq.MessagePublisher;
import com.stackroute.Services.TaxService;
import com.stackroute.TaxModel.CalculatedTax;
import com.stackroute.TaxModel.Tax;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ("api/v1/"))
//@CrossOrigin(origins = "*")

public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @Autowired
    public MessagePublisher publisher;

    @GetMapping("/details")
    public List<Tax> getDetails(){
        return taxService.getDetail();
    }

    @GetMapping("/GetTax")
    public List<CalculatedTax> getCalculatedTax(){
        return taxService.getCalTax();
    }

    @PostMapping("/saveNew")
    public String addNewDetails(@RequestBody Tax tax){

        taxService.addNewDetail(tax);
        return "Data Stored";
    }

    @PostMapping ("/TaxCalculated")
    public ResponseEntity<JSONObject> CalculateTax(@RequestBody Tax tax){
        JSONObject message=taxService.calTax(tax);
        //rabitmq message publishing
        CustomMessage messageRabbit= new CustomMessage(tax.getIFS(), tax.getIFI(), tax.getIPHL(), tax.getEDS(), tax.getBD(), tax.getDTC(), tax.getIDA(),tax.getIEL(), tax.getIFD(), tax.getIHL(),tax.getIPL(), tax.getNPS(), tax.getOI(), tax.getRI(), tax.getMI(), tax.getTax1(),tax.getTax2());
        publisher.publishMessage(messageRabbit);

        return new ResponseEntity<JSONObject>(message, HttpStatus.OK);
    }
}

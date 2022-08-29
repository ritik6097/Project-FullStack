package com.stackroute.Controller;


import com.stackroute.RabbitMq.CustomMessage;
import com.stackroute.RabbitMq.MessagePublisher;
import com.stackroute.Services.TaxService;
import com.stackroute.TaxModel.CalculatedTax;
import com.stackroute.TaxModel.Tax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ("api/v1/"))
@CrossOrigin(origins = "*")

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
        //rabitmq message publishing
        CustomMessage message= new CustomMessage(tax.getIFS(), tax.getIFI(), tax.getIPHL(), tax.getEDS(), tax.getBD(), tax.getDTC(), tax.getIDA(),tax.getIEL(), tax.getIFD(), tax.getIHL(),tax.getIPL(), tax.getNPS(), tax.getOI(), tax.getRI(), tax.getMI(), tax.getTaxCalculated());
        publisher.publishMessage(message);
        taxService.addNewDetail(tax);
        return "Data Stored";
    }

    @PostMapping ("/TaxCalculated")
    public String CalculateTax(@RequestBody Tax tax){
        return taxService.calTax(tax);
    }
}

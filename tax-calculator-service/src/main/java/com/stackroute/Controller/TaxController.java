package com.stackroute.Controller;


import com.stackroute.Services.TaxService;
import com.stackroute.TaxModel.CalculatedTax;
import com.stackroute.TaxModel.Tax;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ("api/v1/"))

public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping("/details")
    public List<Tax> getDetails(){
        return taxService.getDetail();
    }

    @GetMapping("/GetTax")
    public List<CalculatedTax> getCalculatedTax(){
        return taxService.getCalTax();
    }

    @PostMapping("/saveNew")
    public void addNewDetails(@RequestBody Tax tax){
        taxService.addNewDetail(tax);
    }

    @PostMapping ("/TaxCalculated")
    public String CalculateTax(@RequestBody Tax tax){
        return "it's working";

    }
}

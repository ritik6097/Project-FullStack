package com.stackroute.TaxModel;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "Tax")
public class CalculatedTax {

    private Long id;
    private double TaxCalculated;

}

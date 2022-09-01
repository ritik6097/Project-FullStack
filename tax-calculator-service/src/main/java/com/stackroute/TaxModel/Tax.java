package com.stackroute.TaxModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;




@Data
@Document(collection = "TaxDetails")
@NoArgsConstructor
@AllArgsConstructor

public class Tax {


    private Long id=212L;

    private Double IFS;

    private Double IFI;

    private Double IPHL;

    private Double IPL;

    private Double EDS;

    private Double OI;

    private Double RI;

    private Double IDA;

    private Double BD;

    private Double IFD;

    private Double MI;

    private Double DTC;

    private Double IEL;

    private Double IHL;

    private Double NPS;

    private Double Tax1;

    private Double Tax2;

    private Double GTI1=0.00;

    private Double Ded1=0.00;


    private Double GTI2=0.00;

    //@Column(name="Ded2")
    private Double Ded2=0.00;


//    public Tax(Long id, Double IFS) {
//        super();
//        this.id = id;
//        this.IFS = IFS;
//    }


}

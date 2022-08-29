package com.stackroute.RabbitMq;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage {

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

    private Double TaxCalculated;

}

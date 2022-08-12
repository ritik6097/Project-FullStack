package com.stackroute.TaxModel;

import javax.persistence.*;

@Entity
@Table(name = "Tax")
public class CalculatedTax {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CalculatedTax")
    private double TaxCalculated;

    public CalculatedTax() {
    }

    public CalculatedTax(Long id, Float taxCalculated) {
        this.id = id;
        TaxCalculated = taxCalculated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTaxCalculated() {
        return TaxCalculated;
    }

    public void setTaxCalculated(double taxCalculated) {
        TaxCalculated = taxCalculated;
    }
}

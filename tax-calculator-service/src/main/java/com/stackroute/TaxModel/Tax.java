package com.stackroute.TaxModel;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.lang.annotation.Documented;


@Data
@Document(collection = "TaxDetails")
public class Tax {


    private Long id;
    private Double incomeFromSalary;

    private Double incomeFromInterest;

    private Double interestPaidOnHomeLoan;

    private Double interestPaidOnLoan;

    private Double deductionFromSalary;

    private Double otherIncome;

    private Double rentalIncome;

    private Double incomeFromDigitalAssets;

    private Double basicDeduction;

    private Double interestFromDeposite;

    private Double medicalInsurance;

    private Double donationToCharity;

    //private Integer interestOnEducationLoan;

    private Double interestOnHousingLoan;

    private Double employeeContributionNPS;

    private Double TaxCalculated;


}

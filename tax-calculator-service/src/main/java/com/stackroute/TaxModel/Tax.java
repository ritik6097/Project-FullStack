package com.stackroute.TaxModel;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.lang.annotation.Documented;


@Data
@Document(collection = "TaxDetails")
public class Tax {


    private Long id;
    private Integer incomeFromSalary;

    private Integer incomeFromInterest;

    private Integer interestPaidOnHomeLoan;

    private Integer interestPaidOnLoan;

    private Integer deductionFromSalary;

    private Integer otherIncome;

    private Integer rentalIncome;

    private Integer incomeFromDigitalAssets;

    private Integer basicDeduction;

    private Integer interestFromDeposite;

    private Integer medicalInsurance;

    private Integer donationToCharity;

    private Integer interestOnEduationLoan;

    private Integer interestOnHousingLoan;

    private Integer employeeContributionNPS;



}

package com.stackroute.Services;


import com.google.gson.GsonBuilder;
import com.stackroute.Repository.TaxRepository;
import com.stackroute.Repository.UserRepository;
import com.stackroute.TaxModel.CalculatedTax;
import com.stackroute.TaxModel.Tax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

import java.util.List;
import java.util.Optional;

@Service
public class TaxService {


    private final UserRepository userRepository;
    private final TaxRepository taxRepository;

    @Autowired
    public TaxService(UserRepository userRepository, TaxRepository taxRepository) {
        this.userRepository = userRepository;
        this.taxRepository = taxRepository;
    }


    //double[] arr=new double[1];
    double result;

    public List<Tax> getDetail() {
        return userRepository.findAll();
    }

    public void addNewDetail(Tax tax) {
        Optional<Tax>TaxById=userRepository.findTaxById(tax.getId());
        if (TaxById.isPresent()){
            throw new IllegalStateException("Already Exist");
        }
        userRepository.save(tax);
    }

    public List<CalculatedTax> getCalTax() {
        return taxRepository.findAll();
    }

    public String calTax(Tax tax) {
        //CalculatedTax taxCal=new CalculatedTax();

        this.userRepository.save(tax);

        double total=tax.getIncomeFromSalary()-(tax.getInterestPaidOnLoan()
                +tax.getInterestPaidOnHomeLoan()
                +tax.getOtherIncome()
                +tax.getDeductionFromSalary()
                +tax.getDonationToCharity()
                +tax.getBasicDeduction()
                +tax.getEmployeeContributionNPS()
                +tax.getIncomeFromDigitalAssets()
                +tax.getInterestFromDeposite()
//                +tax.getInterestOnEducationLoan()
                +tax.getInterestOnHousingLoan()
                +tax.getMedicalInsurance()
                +tax.getRentalIncome()
                +tax.getIncomeFromInterest());
        if (total<=250000){
            double totalTax = 0.00;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else if ((total>250000)&&(total<500000)) {
            double totalTax=(total-250000)*0.05;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else if ((total>500000)&&(total<750000)) {
            double totalTax=(total-500000)*0.1;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else if ((total>750000)&&(total<1000000)) {
            double totalTax=(total-750000)*0.15;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else if ((total>1000000)&&(total<1250000)) {
            double totalTax=(total-1000000)*0.2;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else if ((total>1250000)&&(total<1500000)) {
            double totalTax=(total-1250000)*0.25;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        } else{
            double totalTax=(total-1500000)*0.3;
            tax.setTaxCalculated(totalTax);
            result=totalTax;
            this.userRepository.save(tax);
        }
            return String.valueOf(result);

    }

}

package com.stackroute.Services;


import com.stackroute.Repository.TaxRepository;
import com.stackroute.Repository.UserRepository;
import com.stackroute.TaxModel.CalculatedTax;
import com.stackroute.TaxModel.Tax;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    double result1;
    double result2;
    Double[] RES = new Double[2];
    String[] myResult = {"TaxCaluclated1","TaxCalulated2"};

    public List<Tax> getDetail() {
        return userRepository.findAll();
    }

    public void addNewDetail(Tax tax) {
        userRepository.save(tax);
    }

    public List<CalculatedTax> getCalTax() {
        return taxRepository.findAll();
    }

    public JSONObject calTax(Tax tax) {
        CalculatedTax taxCal=new CalculatedTax();

        double total1=tax.getIFS()+(tax.getEDS()+tax.getOI()+tax.getIDA()+tax.getIPHL()+tax.getIEL()+tax.getRI()+tax.getIFI())
        -(tax.getIPL() +tax.getDTC() +tax.getBD() +tax.getNPS() +tax.getIFD() +tax.getIHL() +tax.getMI());

        double total2=tax.getIFS()+(tax.getEDS()+tax.getOI()+tax.getIDA()+tax.getIPHL()+tax.getIEL()+tax.getRI()+tax.getIFI())
                -(tax.getIPL() +tax.getDTC()+tax.getNPS() +tax.getIHL());


        if (total1<=250000 && total2<=250000){
            double totalTax1 = 0.00;
            double totalTax2=0.00;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else if (((total1>250000)&&(total1<=500000)) && ((total2>250000)&&(total2<=500000))) {
            double totalTax1=(total1-250000)*0.05;
            double totalTax2=(total2-250000)*0.05;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else if (((total1>500000)&&(total1<=750000)) && ((total2>500000)&&(total2<=750000))) {
            double totalTax1=(total1-500000)*0.1;
            double totalTax2=(total2-500000)*0.1;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else if (((total1>750000)&&(total1<=1000000)) && ((total2>750000)&&(total2<=1000000))) {
            double totalTax1=(total1-750000)*0.15;
            double totalTax2=(total2-750000)*0.15;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else if (((total1>1000000)&&(total1<=1250000)) && ((total2>1000000)&&(total2<=1250000))) {
            double totalTax1=(total1-1000000)*0.2;
            double totalTax2=(total2-1000000)*0.2;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else if (((total1>1250000)&&(total1<=1500000)) && ((total2>1250000)&&(total2<=1500000))) {
            double totalTax1=(total1-1250000)*0.25;
            double totalTax2=(total2-1250000)*0.25;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        } else{
            double totalTax1=(total1-1500000)*0.3;
            double totalTax2=(total2-1500000)*0.3;
            tax.setTax1(totalTax1);
            tax.setTax2(totalTax2);
            taxCal.setTaxCalculated1(totalTax1);
            taxCal.setTaxCalculated2(totalTax2);
            result1=totalTax1;
            result2=totalTax2;
            RES[0]=result1;
            RES[1]=result2;
            this.userRepository.deleteAll();
            this.userRepository.save(tax);
        }

        this.taxRepository.deleteAll();
        this.taxRepository.save(taxCal);


        JSONObject file = new JSONObject();
        for(var i =0;i<myResult.length;i++) {
            file.put(myResult[i], RES[i]);
        }
        return file;
    }

}



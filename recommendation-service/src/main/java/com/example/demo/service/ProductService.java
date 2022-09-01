package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import org.json.simple.JSONObject;

import com.example.demo.entity.Advice;
import com.example.demo.entity.Product;
import com.example.demo.repository.AdviceRepository;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductService{
	@Autowired
	ProductRepository productRepository;
	@Autowired
	AdviceRepository  adviceRepository;
	String[] myString = new String[7];
	String[] myAdvice = {"Advice1","Advice2","Advice3","Advice4","Advice5","Advice6","Advice7"};
	
	public List<Product> getAllProducts() {
		List<Product> list = this.productRepository.findAll();

		return list;
	}
	public List<Advice> getAllAdvices() {
		List<Advice> list = this.adviceRepository.findAll();

		return list;
	}
	public JSONObject saveProduct(Product product) {
		Advice adv = new Advice();
		this.productRepository.save(product);
		if((product.getTax1()<=0) || (product.getTax2()<=0)) {
			String Advice1 = "You are having tax free income";
			myString[0]=Advice1;
			adv.setAdvice1(Advice1);
			
			}else {
				String Advice1="Here are Suggestions, to save your taxes:-";
				myString[0]=Advice1;
				adv.setAdvice1(Advice1);
			}
		if((product.getTax1()>0) && (product.getTax2()>0)&& (product.getTax1()>product.getTax2())) {
			String Advice2="You should opt for New Regime as it will provide you benefit of Rs "+ (product.getTax1()-product.getTax2()) +" over Old regime";
			myString[1]=Advice2;
			adv.setAdvice2(Advice2);
			
			}
		if(product.getTax1()==0 && product.getTax2()!=0) {
			String Advice2="Opt for Old regime then your income will be tax free";
			myString[1]=Advice2;
			adv.setAdvice2(Advice2);
			
		}
		if(product.getTax2()==0 && product.getTax1()!=0) {
			String Advice2="Opt for New regime then your income  will be tax free";
			myString[1]=Advice2;
			adv.setAdvice2(Advice2);
			
		}
		if((product.getTax1()>0) && (product.getTax2()>0)&& (product.getTax1()<product.getTax2())) {
			String Advice2="You should opt for Old Regime as it will provide you benefit of Rs "+ (product.getTax2()-product.getTax1()) +" over New regime";
			myString[1]=Advice2;
			adv.setAdvice2(Advice2);
			
			}
		if((product.getTax1()>0) && (product.getTax2()>0) && product.getBD()>=0) {
			String Advice3="Make an investment of Rs "+ (150000-product.getBD()) +" under Sec 80C to reduce your taxable income.";
			myString[2]=Advice3;
			adv.setAdvice3(Advice3);
		}else{
			String Advice3="";
			myString[2]=Advice3;
			adv.setAdvice3(Advice3);
			
		}
		if((product.getTax1()>0) && (product.getTax2()>0) && product.getNPS()>=0) {
			String Advice4="Additional deduction of Rs "+ (50000-product.getNPS()) +" can be claimed by investing in NPS under 80CCD (1b)";
			myString[3]=Advice4;
			adv.setAdvice4(Advice4);
		}else{
			String Advice4="";
			myString[3]=Advice4;
			adv.setAdvice4(Advice4);
		}
		if((product.getTax1()>0) && (product.getTax2()>0) && product.getMI()>=0) {
			String Advice5="You can buy medical insurance upto "+ (100000-product.getMI()) + ",maximum deduction allowed is Rs. 1,00,000 (Rs 50,000 for self and family if senior citizen and Rs 50,000 for senior citizen parents) under Section 80D.";
			myString[4]=Advice5;
			adv.setAdvice5(Advice5);
		}else {
			String Advice5="";
			myString[4]=Advice5;
			adv.setAdvice5(Advice5);
		}
		if((product.getTax1()>0) && (product.getTax2()>0) && product.getIHL()>=0) {
			String Advice6="Claim deduction up to Rs"+(50000-product.getIHL())+" on Home Loan Interest under Section 80EE";
			myString[5]=Advice6;
			adv.setAdvice6(Advice6);
		}else {
			String Advice6="";
			myString[5]=Advice6;
			adv.setAdvice6(Advice6);
		}
		if((product.getTax1()>0) && (product.getTax2()>0) && product.getDTC()==0) {
			String Advice7="Any charity to notified institutions or funds can be claimed as a deduction under section 80G";
			myString[6]=Advice7;
			adv.setAdvice7(Advice7);
			
		}else {
			String Advice7="";
			myString[6]=Advice7;
			adv.setAdvice7(Advice7);
		}
		JSONObject file = new JSONObject();
		for(var i =0;i<myString.length;i++) {
			file.put(myAdvice[i], myString[i]);
		}
		this.adviceRepository.deleteAll();
		this.adviceRepository.save(adv);
		return file;

	}
	
}

package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "product")
public class Product {
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private Long id;

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
	
	
	//@Column(name="GTI1")
	private Double GTI1;
	
	//@Column(name="Ded1")
	private Double Ded1;
	
	//@Column(name="Tax1")
	private Double Tax1;
	
	//@Column(name="GTI2")
	private Double GTI2;
	
	//@Column(name="Ded2")
	private Double Ded2;
	
	//@Column(name="Tax2")
	private Double Tax2;


	public Double getIFS() {
		return IFS;
	}

	public void setIFS(Double IFS) {
		this.IFS = IFS;
	}

	public Double getIFI() {
		return IFI;
	}

	public void setIFI(Double IFI) {
		this.IFI = IFI;
	}

	public Double getIPHL() {
		return IPHL;
	}

	public void setIPHL(Double IPHL) {
		this.IPHL = IPHL;
	}

	public Double getIPL() {
		return IPL;
	}

	public void setIPL(Double IPL) {
		this.IPL = IPL;
	}

	public Double getEDS() {
		return EDS;
	}

	public void setEDS(Double EDS) {
		this.EDS = EDS;
	}

	public Double getOI() {
		return OI;
	}

	public void setOI(Double OI) {
		this.OI = OI;
	}

	public Double getRI() {
		return RI;
	}

	public void setRI(Double RI) {
		this.RI = RI;
	}

	public Double getIDA() {
		return IDA;
	}

	public void setIDA(Double IDA) {
		this.IDA = IDA;
	}

	public Double getBD() {
		return BD;
	}

	public void setBD(Double BD) {
		this.BD = BD;
	}

	public Double getIFD() {
		return IFD;
	}

	public void setIFD(Double IFD) {
		this.IFD = IFD;
	}

	public Double getMI() {
		return MI;
	}

	public void setMI(Double MI) {
		this.MI = MI;
	}

	public Double getDTC() {
		return DTC;
	}

	public void setDTC(Double DTC) {
		this.DTC = DTC;
	}

	public Double getIEL() {
		return IEL;
	}

	public void setIEL(Double IEL) {
		this.IEL = IEL;
	}

	public Double getIHL() {
		return IHL;
	}

	public void setIHL(Double IHL) {
		this.IHL = IHL;
	}

	public Double getNPS() {
		return NPS;
	}

	public void setNPS(Double NPS) {
		this.NPS = NPS;
	}

	public Double getGTI1() {
		return GTI1;
	}

	public void setGTI1(Double GTI1) {
		this.GTI1 = GTI1;
	}

	public Double getDed1() {
		return Ded1;
	}

	public void setDed1(Double ded1) {
		Ded1 = ded1;
	}

	public Double getTax1() {
		return Tax1;
	}

	public void setTax1(Double tax1) {
		Tax1 = tax1;
	}

	public Double getGTI2() {
		return GTI2;
	}

	public void setGTI2(Double GTI2) {
		this.GTI2 = GTI2;
	}

	public Double getDed2() {
		return Ded2;
	}

	public void setDed2(Double ded2) {
		Ded2 = ded2;
	}

	public Double getTax2() {
		return Tax2;
	}

	public void setTax2(Double tax2) {
		Tax2 = tax2;
	}
}

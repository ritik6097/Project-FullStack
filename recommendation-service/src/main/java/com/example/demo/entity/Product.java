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
	
	//@Column(name="IFS")
	private int IFS;
	
	//@Column(name="IPHL")
	private int IPHL;
	
	//@Column(name="IPL")
	private int IPL;
	
	//@Column(name="EDS")
	private int EDS;
	
	//@Column(name="OI")
	private int OI;
	
	//@Column(name="RIR ")
	private int RIR;
	
	//@Column(name="IFDS")
	private int IFDS;
	
	//@Column(name="BD")
	private int BD;
	
	//@Column(name="MD")
	private int MD;
	
	//@Column(name="IOEL")
	private int IOEL;
	
	//@Column(name="NPS")
	private int NPS;
	
	//@Column(name="IFD")
	private int IFD;
	
	//@Column(name="DTC")
	private int DTC;
	
	//@Column(name="IOHL")
	private int IOHL;
	
	
	//@Column(name="GTI1")
	private int GTI1;
	
	//@Column(name="Ded1")
	private int Ded1;
	
	//@Column(name="Tax1")
	private int Tax1;
	
	//@Column(name="GTI2")
	private int GTI2;
	
	//@Column(name="Ded2")
	private int Ded2;
	
	//@Column(name="Tax2")
	private int Tax2;
	
	
	
	
	public int getIFS() {
		return IFS;
	}

	public void setIFS( int IFS) {
		this.IFS = IFS;
	}

	public int getIPHL() {
		return IPHL;
	}
	
	public void setIPHL( int IPHL) {
		this.IPHL = IPHL;
	}
	
	public int getIPL() {
		return IPL;
	}
	
	public void setIPL( int IPL) {
		this.IPL = IPL;
	}
	
	public int getEDS() {
		return EDS;
	}
	
	public void setEDS( int EDS) {
		this.EDS = EDS;
	}
	
	public int getOI() {
		return OI;
	}
	
	public void setOI( int OI) {
		this.OI = OI;
	}
	
	public int getRIR() {
		return RIR;
	}
	
	public void setRIR( int RIR) {
		this.RIR = RIR;
	}
	
	public int getIFDS() {
		return IFDS;
	}
	
	public void setIFDS( int IFDS) {
		this.IFDS = IFDS;
	}
	
	public int getBD() {
		return BD;
	}
	
	public void setBD( int BD) {
		this.BD = BD;
	}
	
	public int getMD() {
		return MD;
	}
	
	public void setMD( int MD) {
		this.MD = MD;
	}
	
	public int getIOEL() {
		return IOEL;
	}
	
	public void setIOEL( int IOEL) {
		this.IOEL = IOEL;
	}
	
	public int getNPS() {
		return NPS;
	}
	
	public void setNPS( int NPS) {
		this.NPS = NPS;
	}
	
	public int getIFD() {
		return IFD;
	}
	
	public void setIFD( int IFD) {
		this.IFD = IFD;
	}
	public int getDTC() {
		return DTC;
	}
	
	public void setDTC( int DTC) {
		this.DTC = DTC;
	}
	
	public int getIOHL() {
		return IOHL;
	}
	
	public void setIOHL( int IOHL) {
		this.IOHL = IOHL;
	}
	
	public int getGTI1() {
		return GTI1;
	}
	
	public void setGTI1( int GTI1) {
		this.GTI1 = GTI1;
	}
	
	public int getDed1() {
		return Ded1;
	}
	
	public void setDed1( int Ded1) {
		this.Ded1 = Ded1;
	}
	
	public int getTax1() {
		return Tax1;
	}
	
	public void setTax1( int Tax1) {
		this.Tax1 = Tax1;
	}
	
	public int getGTI2() {
		return GTI2;
	}
	
	public void setGTI2( int GTI2) {
		this.GTI2 = GTI2;
	}
	
	public int getDed2() {
		return Ded2;
	}
	
	public void setDed2( int Ded2) {
		this.Ded2 = Ded2;
	}
	
	public int getTax2() {
		return Tax2;
	}
	
	public void setTax2( int Tax2) {
		this.Tax2 = Tax2;
	}




	
	
	

}

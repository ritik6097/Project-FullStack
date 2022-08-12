package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Advice")

public class Advice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="Advice1")
	private String Advice1;
	
	@Column(name="Advice2")
	private String Advice2;
	
	@Column(name="Advice3")
	private String Advice3;
	
	@Column(name="Advice4")
	private String Advice4;
	
	@Column(name="Advice5")
	private String Advice5;
	
	@Column(name="Advice6")
	private String Advice6;
	
	@Column(name="Advice7")
	private String Advice7;
	
	public String getAdvice1() {
		return Advice1;
	}

	public void setAdvice1( String Advice1) {
		this.Advice1 = Advice1;
	}
	
	public String getAdvice2() {
		return Advice2;
	}

	public void setAdvice2( String Advice2) {
		this.Advice2 = Advice2;
	}
	
	public String getAdvice3() {
		return Advice3;
	}

	public void setAdvice3( String Advice3) {
		this.Advice3 = Advice3;
	}
	
	public String getAdvice4() {
		return Advice4;
	}

	public void setAdvice4( String Advice4) {
		this.Advice4 = Advice4;
	}
	public String getAdvice5() {
		return Advice5;
	}

	public void setAdvice5( String Advice5) {
		this.Advice5 = Advice5;
	}
	public String getAdvice6() {
		return Advice6;
	}

	public void setAdvice6( String Advice6) {
		this.Advice6= Advice6;
	}
	public String getAdvice7() {
		return Advice7;
	}

	public void setAdvice7( String Advice7) {
		this.Advice7 = Advice7;
	}

	

}

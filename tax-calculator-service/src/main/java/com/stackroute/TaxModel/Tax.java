package com.stackroute.TaxModel;

import javax.persistence.*;

@Entity
@Table(name = "TaxDetails")
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "IFS")
    private Integer incomeFromSalary;
    @Column(name = "IFT")
    private Integer incomeFromInterest;
    @Column(name = "IPHL")
    private Integer interestPaidOnHomeLoan;
    @Column(name = "IPL")
    private Integer interestPaidOnLoan;
    @Column(name = "DFS")
    private Integer deductionFromSalary;
    @Column(name = "OI")
    private Integer otherIncome;
    @Column(name = "RI")
    private Integer rentalIncome;
    @Column(name = "IFDA")
    private Integer incomeFromDigitalAssets;
    @Column(name = "BD")
    private Integer basicDeduction;
    @Column(name = "IFD")
    private Integer interestFromDeposite;
    @Column(name = "MI")
    private Integer medicalInsurance;
    @Column(name = "DTC")
    private Integer donationToCharity;
    @Column(name = "IEL")
    private Integer interestOnEduationLoan;
    @Column(name = "IHL")
    private Integer interestOnHousingLoan;
    @Column(name = "ECNPS")
    private Integer employeeContributionNPS;


    public Tax() {
    }

    public Tax(Long id,
               Integer incomeFromSalary,
               Integer incomeFromInterest,
               Integer interestPaidOnHomeLoan,
               Integer interestPaidOnLoan,
               Integer deductionFromSalary,
               Integer otherIncome,
               Integer rentalIncome,
               Integer incomeFromDigitalAssets,
               Integer basicDeduction,
               Integer interestFromDeposite,
               Integer medicalInsurance,
               Integer donationToCharity,
               Integer interestOnEduationLoan,
               Integer interestOnHousingLoan,
               Integer employeeContributionNPS) {
        this.id = id;
        this.incomeFromSalary = incomeFromSalary;
        this.incomeFromInterest = incomeFromInterest;
        this.interestPaidOnHomeLoan = interestPaidOnHomeLoan;
        this.interestPaidOnLoan = interestPaidOnLoan;
        this.deductionFromSalary = deductionFromSalary;
        this.otherIncome = otherIncome;
        this.rentalIncome = rentalIncome;
        this.incomeFromDigitalAssets = incomeFromDigitalAssets;
        this.basicDeduction = basicDeduction;
        this.interestFromDeposite = interestFromDeposite;
        this.medicalInsurance = medicalInsurance;
        this.donationToCharity = donationToCharity;
        this.interestOnEduationLoan = interestOnEduationLoan;
        this.interestOnHousingLoan = interestOnHousingLoan;
        this.employeeContributionNPS = employeeContributionNPS;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIncomeFromSalary() {
        return incomeFromSalary;
    }

    public void setIncomeFromSalary(Integer incomeFromSalary) {
        this.incomeFromSalary = incomeFromSalary;
    }

    public Integer getIncomeFromInterest() {
        return incomeFromInterest;
    }

    public void setIncomeFromInterest(Integer incomeFromInterest) {
        this.incomeFromInterest = incomeFromInterest;
    }

    public Integer getInterestPaidOnHomeLoan() {
        return interestPaidOnHomeLoan;
    }

    public void setInterestPaidOnHomeLoan(Integer interestPaidOnHomeLoan) {
        this.interestPaidOnHomeLoan = interestPaidOnHomeLoan;
    }

    public Integer getInterestPaidOnLoan() {
        return interestPaidOnLoan;
    }

    public void setInterestPaidOnLoan(Integer interestPaidOnLoan) {
        this.interestPaidOnLoan = interestPaidOnLoan;
    }

    public Integer getDeductionFromSalary() {
        return deductionFromSalary;
    }

    public void setDeductionFromSalary(Integer deductionFromSalary) {
        this.deductionFromSalary = deductionFromSalary;
    }

    public Integer getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(Integer otherIncome) {
        this.otherIncome = otherIncome;
    }

    public Integer getRentalIncome() {
        return rentalIncome;
    }

    public void setRentalIncome(Integer rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    public Integer getIncomeFromDigitalAssets() {
        return incomeFromDigitalAssets;
    }

    public void setIncomeFromDigitalAssets(Integer incomeFromDigitalAssets) {
        this.incomeFromDigitalAssets = incomeFromDigitalAssets;
    }

    public Integer getBasicDeduction() {
        return basicDeduction;
    }

    public void setBasicDeduction(Integer basicDeduction) {
        this.basicDeduction = basicDeduction;
    }

    public Integer getInterestFromDeposite() {
        return interestFromDeposite;
    }

    public void setInterestFromDeposite(Integer interestFromDeposite) {
        this.interestFromDeposite = interestFromDeposite;
    }

    public Integer getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(Integer medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public Integer getDonationToCharity() {
        return donationToCharity;
    }

    public void setDonationToCharity(Integer donationToCharity) {
        this.donationToCharity = donationToCharity;
    }

    public Integer getInterestOnEduationLoan() {
        return interestOnEduationLoan;
    }

    public void setInterestOnEduationLoan(Integer interestOnEduationLoan) {
        this.interestOnEduationLoan = interestOnEduationLoan;
    }

    public Integer getInterestOnHousingLoan() {
        return interestOnHousingLoan;
    }

    public void setInterestOnHousingLoan(Integer interestOnHousingLoan) {
        this.interestOnHousingLoan = interestOnHousingLoan;
    }

    public Integer getEmployeeContributionNPS() {
        return employeeContributionNPS;
    }

    public void setEmployeeContributionNPS(Integer employeeContributionNPS) {
        this.employeeContributionNPS = employeeContributionNPS;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "id=" + id +
                ", incomeFromSalary=" + incomeFromSalary +
                ", incomeFromInterest=" + incomeFromInterest +
                ", interestPaidOnHomeLoan=" + interestPaidOnHomeLoan +
                ", interestPaidOnLoan=" + interestPaidOnLoan +
                ", deductionFromSalary=" + deductionFromSalary +
                ", otherIncome=" + otherIncome +
                ", rentalIncome=" + rentalIncome +
                ", incomeFromDigitalAssets=" + incomeFromDigitalAssets +
                ", basicDeduction=" + basicDeduction +
                ", interestFromDeposite=" + interestFromDeposite +
                ", medicalInsurance=" + medicalInsurance +
                ", donationToCharity=" + donationToCharity +
                ", interestOnEduationLoan=" + interestOnEduationLoan +
                ", interestOnHousingLoan=" + interestOnHousingLoan +
                ", employeeContributionNPS=" + employeeContributionNPS +
                '}';
    }
}

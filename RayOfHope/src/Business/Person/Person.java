/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.Date;

/**
 *
 * @author khyati
 */
public class Person {

    int personId;
    String name;
    int personAge;
    String status;
    String imageDetails;
    String identificationMark;
    String gender;
    private static int count = 1;
    Date registrationDate;
    String medicalStatus;
    private double BP;
    private double pulseRate;
    private double respirationRate;
    private double bodytemp;
    private boolean financialHelp;
    private String amt;
    private boolean medicalHelp;
    private boolean isSpecialPerson;

    public double getBP() {
        return BP;
    }

    public void setBP(double BP) {
        this.BP = BP;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getBodytemp() {
        return bodytemp;
    }

    public void setBodytemp(double bodytemp) {
        this.bodytemp = bodytemp;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getIdentificationMark() {
        return identificationMark;
    }

    public void setIdentificationMark(String identificationMark) {
        this.identificationMark = identificationMark;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imageDetails = imageDetails;
    }

    public boolean isFinancialHelp() {
        return financialHelp;
    }

    public void setFinancialHelp(boolean financialHelp) {
        this.financialHelp = financialHelp;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public boolean isMedicalHelp() {
        return medicalHelp;
    }

    public void setMedicalHelp(boolean medicalHelp) {
        this.medicalHelp = medicalHelp;
    }

    public boolean isIsSpecialPerson() {
        return isSpecialPerson;
    }

    public void setIsSpecialPerson(boolean isSpecialPerson) {
        this.isSpecialPerson = isSpecialPerson;
    }

    @Override
    public String toString() {
        return String.valueOf(personId);
    }
}

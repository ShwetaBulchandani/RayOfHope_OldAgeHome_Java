/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;

/**
 *
 * @author khyati
 */
public class RegisterDonorRequest extends WorkRequest{
    
    private String ssn;
    private String address1;
    private String address2;
    private String gender;
    private String annualIncome;
    private String userEmailId;
    private String userCity;
    private String userContact;
    private String contactCarrierName;
    
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String name;
    private String orgName;
    private String userName;
    private String userPassword;

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public String getContactCarrierName() {
        return contactCarrierName;
    }

    public void setContactCarrierName(String contactCarrierName) {
        this.contactCarrierName = contactCarrierName;
    }
    
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public String getName() {
        return name;
    }

   

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }
    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    @Override
    public String toString() {
        return userName;
    }  
}

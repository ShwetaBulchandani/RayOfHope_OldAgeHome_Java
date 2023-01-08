/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Person.PersonDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organizations.Organization;


import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FundingFinanceRole.FundingWorkArea;


/**
 *
 * @author parag
 */
public class FundingFinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory childdirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
        return new FundingWorkArea(userProcessContainer, account, organization, enterprise, business, childdirectory);
    }
     @Override
    public String toString(){
        return (RoleType.Finance.getValue());
    }
}

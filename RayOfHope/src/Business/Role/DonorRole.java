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

import userinterface.Sponsor.SponsorWorkArea;
;

/**
 *
 * @author parag
 */
public class DonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory childdirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
        return new SponsorWorkArea(userProcessContainer, account, organization,enterprise, business,adopterdirectory,childdirectory,donorDirectory);
    }
    
}

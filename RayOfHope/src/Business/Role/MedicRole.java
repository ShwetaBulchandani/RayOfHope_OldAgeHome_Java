/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Person.PersonDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MedicOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MedicOrg.MedicWorkArea;

/**
 *
 * @author parag
 */
public class MedicRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory childdirectory, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        return new MedicWorkArea(userProcessContainer, account, (MedicOrganization) organization, enterprise, business, childdirectory);
    }
    
    @Override
    public String toString(){
        return (RoleType.Doctor.getValue());
    }
}

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
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.labOrganization.LabWorkArea;

/**
 *
 * @author parag
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory childdirectory, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        return new LabWorkArea(userProcessContainer, account, organization, business);
    }
    
    @Override
    public String toString(){
        return (RoleType.LabAssistant.getValue());
    }
     
}

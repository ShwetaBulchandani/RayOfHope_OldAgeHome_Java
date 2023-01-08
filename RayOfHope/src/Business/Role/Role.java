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

/**
 *
 * @author parag
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        PersonCare("Person Care Examinator"),
        FosterCare("Foster Care Admin"),
        PersonRegistration("Person Registrar"), 
        Finance ("Accountant"),
        AdoptionAdmin("Adoption Admin Organization"), 
        Adoption("Adoption Manager"), 
        Adopter("Adopter"),
        CriminalCheck("Criminal Check Org Employee"),
        FinanceCheck("Finance Check Org Employee"),
        Pharmacist("Pharmacist"),
        Donor("Sponsorer");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business, PersonDirectory childdirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
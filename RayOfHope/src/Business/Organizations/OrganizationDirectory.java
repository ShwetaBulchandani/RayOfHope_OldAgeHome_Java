/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;




import Business.Enterprise.Enterprise;
import Business.Organizations.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name,Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new MedicOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Pharmacist.getValue())){
            organization = new PharmacistOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PersonCare.getValue())){
            organization = new PersonCareOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PersonRegistration.getValue())){
            organization = new PersonRegistrationOrganization(name);
            organizationList.add(organization);
        }
       
        
        else if (type.getValue().equals(Type.CriminalCheck.getValue())){
            organization = new VerificationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceCheck.getValue())){
            organization = new FinanceVerificationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Espousal.getValue())){
            organization = new EspousalOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Adopter.getValue())){
            organization = new AdopterOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceOrganization.getValue())){
            organization = new FinanceOrganization(name);
            organizationList.add(organization);
        }
        return organization;
    
}
    
     public boolean isUnique(String name){
        for(Organization organization : organizationList){
            if(name.equalsIgnoreCase(organization.getName())){
                return false;
            }
        }
        return true;
    }
    
}
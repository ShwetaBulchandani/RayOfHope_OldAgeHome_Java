/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;



import Business.Role.FundingFinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class FinanceOrganization extends Organization {

    String name;
    public FinanceOrganization(String name) {
        super(name);
        this.name=name;
    }
    public FinanceOrganization() {
       super(Organization.Type.FinanceOrganization.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundingFinanceRole());
        return roles;
    }
    @Override
    public Type getType() {
        return  Organization.Type.FinanceOrganization;
    }
     
}
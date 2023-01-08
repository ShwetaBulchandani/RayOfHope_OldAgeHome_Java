/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;


import Business.Role.CriminalCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class VerificationOrganization extends Organization{
    String name;
    public VerificationOrganization(String name) {
        super(name);
        this.name=name;
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CriminalCheckRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return  Organization.Type.CriminalCheck;
    }
     
    
}
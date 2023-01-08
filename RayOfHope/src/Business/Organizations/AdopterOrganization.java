/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;


import Business.Role.AdopterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 * 
 */
public class AdopterOrganization extends Organization{
    String name;
    public AdopterOrganization(String name) {
        super(name);
        this.name=name;
    
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdopterRole());
        return roles;
    }
    @Override
    public Type getType() {
        return  Organization.Type.Adopter;
    }
}

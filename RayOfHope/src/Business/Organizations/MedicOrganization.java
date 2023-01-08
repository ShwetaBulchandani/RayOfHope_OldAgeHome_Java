/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.MedicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class MedicOrganization extends Organization{
    String name;
    public MedicOrganization(String name) {
        super(name);
        this.name=name;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicRole());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.Doctor;
    }
    
    
     
}
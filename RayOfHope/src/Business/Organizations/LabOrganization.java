/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class LabOrganization extends Organization{
    String name;
    public LabOrganization(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }

    @Override
    public Type getType() {
        return  Organization.Type.Lab;
    }
     
    
   
    
    
}

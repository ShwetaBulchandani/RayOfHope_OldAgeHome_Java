/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;



import Business.Role.PersonCareRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetabulchandani
 */
public class PersonCareOrganization extends Organization {

  String name;
    public PersonCareOrganization(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonCareRole());
        return roles;
    }
    
     @Override
    public Type getType() {
        return  Organization.Type.PersonCare;
    }
     
    
  
     
}

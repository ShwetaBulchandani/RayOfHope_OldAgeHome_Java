package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Role.MedicRole;
import Business.Role.PharmacistRole;
import Business.Role.RayOfHopeRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Role.MedicRole;
import java.util.ArrayList;

/**
 * configuring system
 * @author shwetabulchandani
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account

        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }
    
}

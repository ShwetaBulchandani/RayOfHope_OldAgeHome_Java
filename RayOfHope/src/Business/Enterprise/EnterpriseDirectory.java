/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Network.Network;
import java.util.ArrayList;

/**
 *CREATE AND ADD ENTERPRISE
 * @author parag
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.RayOfHope){
            enterprise=new RayOfHopeEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Adoption)
        {
            enterprise = new AdoptionEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Funding){
            enterprise = new FundingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public boolean isUnique(String name){
        for(Enterprise enterprise : enterpriseList){
            if(name.equalsIgnoreCase(enterprise.getName())){
                return false;
            }
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khyati
 */
public class AdopterDirectory {
    List<Adopter> adoptersList;
    private static AdopterDirectory adopterdirectory;
    
    public static AdopterDirectory getInstance(){
       
        if(adopterdirectory==null){
            adopterdirectory=new AdopterDirectory();
        }
        return adopterdirectory;  
    }

    public List<Adopter> getAdoptersList() {
        return adoptersList;
    }

    public void setAdoptersList(List<Adopter> adoptersList) {
        this.adoptersList = adoptersList;
    }
    
    
    public AdopterDirectory() {
        adoptersList = new ArrayList<Adopter>();
    }
    
    public Adopter addAdopter(){
     Adopter adopter = new Adopter();
        adoptersList.add(adopter);
      return adopter;
    }
        
}

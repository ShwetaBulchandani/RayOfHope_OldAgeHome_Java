/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author khyati
 */
public class PersonCareWorkRequest extends WorkRequest {
    
   
    
    private boolean AcquiredReqCheck;
     private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isIsAcquiredReq() {
        return AcquiredReqCheck;
    }

    public void setIsAcquiredReq(boolean AcquiredReqCheck) {
        this.AcquiredReqCheck = AcquiredReqCheck;
    }
    
}

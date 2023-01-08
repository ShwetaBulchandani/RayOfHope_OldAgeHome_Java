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
public class DonorWorkRequest extends WorkRequest {
    
    private String userName;
    private String amount;
    private String emailId;
    private String Remarks;
   

    public String getUserName() {
        return userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getAmount() {
        return amount;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    
    
}

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
public class EducationAssistWorkRequest extends WorkRequest {
     private String testResult;
     private String amount;

    

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAmt() {
        return amount;
    }
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
     private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setAmt(String amount) {
        this.amount = amount;
    }
    
    
}

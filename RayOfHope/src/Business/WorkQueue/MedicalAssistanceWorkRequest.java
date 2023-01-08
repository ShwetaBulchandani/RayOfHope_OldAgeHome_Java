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
public class MedicalAssistanceWorkRequest extends WorkRequest {
    
   
    private String remark;
     private String testResult;
    private String prescription;
   
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getRemark() {
        return remark;
    }
     public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getTestResult() {
        return testResult;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}

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
public class BackgroundCheckWorkRequest extends WorkRequest{
    private String comment;
    private String bgcStatus;
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
 
    }

    
     public void setBgcStatus(String bgcStatus) {
        this.bgcStatus = bgcStatus;
    } 
    
    

    public String getBgcStatus() {
        return bgcStatus;
    }

   
    
    
    
}

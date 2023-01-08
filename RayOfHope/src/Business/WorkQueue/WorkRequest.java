/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khyati
 */
public abstract class WorkRequest {
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int personId;
    private UserAccount receiver;
    private int userId;
    private String personName;
    private String name;
    private String message;
    private UserAccount sender;
    

    public String getName() {
        return name;
    }

    

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

    public int getUserId() {
        return userId;
    }

    public Date getRequestDate() {
        return requestDate;
    }
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId =personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName =personName;
    }
    
    @Override
    public String toString(){
        return message;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author aksha
 */
public class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String driverAcknowledgement;
    private Date requestDate;
    private Date resolveDate;
    private Organisation organisation;

    
    public WorkRequest()
    {
        requestDate= new Date();
        requestDate.getTime();
       
    }
    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Date getRequestDate() {
        return requestDate;
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
    

    public String getDriverAcknowledgement() {
        return driverAcknowledgement;
    }

    public void setDriverAcknowledgement(String driverAcknowledgement) {
        this.driverAcknowledgement = driverAcknowledgement;
    }

    @Override
    public String toString() {
        return message ;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.Date;


/**
 *      private String testResult;

 * @author aksha
 */
public class DriverApprovalWorkRequest extends WorkRequest{
    private String messageToDriver;
    private String sendTo;
    private String senderOfAlert;
    
    private Date request;
    private Date response;
    
    public DriverApprovalWorkRequest()
    {
        request = new Date();
        request.getTime();
    }
    
     public String getSenderOfAlert() {
        return senderOfAlert;
    }

    public void setSenderOfAlert(String senderOfAlert) {
        this.senderOfAlert = senderOfAlert;
    }
     public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getMessageToDriver() {
        return messageToDriver;
    }

    public void setMessageToDriver(String messageToDriver) {
        this.messageToDriver = messageToDriver;
    }

   

    public Date getRequest() {
        return request;
    }

    public void setRequest(Date request) {
        this.request = request;
    }

    public Date getResponse() {
        return response;
    }

    public void setResponse(Date response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return messageToDriver ;
    }

    
}

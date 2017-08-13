/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

/**
 *
 * @author aksha
 */
public class EmailDemo {
 
    public static void main(String args[])
{
   String[] to = {"akshaychoudhary15.ac@gmail.com","tejas.washindkar@gmail.com"};
   if(EmailSender.sendMail("javademo4@gmail.com", "javademo", "message to recipient",to))
       System.out.println("Email sent successfully");
   else
       System.out.println("Some Error");
   
   
   
}
   

    
}

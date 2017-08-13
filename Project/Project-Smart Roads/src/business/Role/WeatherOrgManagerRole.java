/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Ecosystem;
import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WeatherDeptManagerRole.WeatherDeptManagerJPanel;

/**
 *
 * @author aksha
 */
public class WeatherOrgManagerRole extends Role  {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Ecosystem business) {
        return new WeatherDeptManagerJPanel(userProcessContainer,account,organisation,enterprise);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

   
    
    
}

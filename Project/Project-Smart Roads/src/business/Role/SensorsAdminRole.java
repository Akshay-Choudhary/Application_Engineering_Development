/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Ecosystem;
import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import static business.Organisation.Organisation.OrganisationType.WeatherOrganisation;
import business.Organisation.SensorsOrganisation;
import business.Organisation.WeatherOrganisation;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SensorsAdmin.SensorAdminJPanel;

/**
 *
 * @author aksha
 */
public class SensorsAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Ecosystem system) {
        return new SensorAdminJPanel(userProcessContainer,account,(SensorsOrganisation)organisation, enterprise);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
     
}

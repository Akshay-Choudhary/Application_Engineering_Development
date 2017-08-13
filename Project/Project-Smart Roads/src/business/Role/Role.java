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

/**
 *
 * @author aksha
 */
public abstract class Role {
    
    public enum RoleType{
        WeatherOrgManagerRole("WeatherOrgManagerRole"),TransportationOrgManagerRole("TransportationOrgManagerRole"),ConstructionOrgManagerRole("ConstructionOrgManagerRole"),EnterpriseAdminRole("EnterpriseAdminRole"),PoliceOrgRole("PoliceOrgRole"),HospitalOrgRole("HospitalOrgRole"),DriverRole("Driver");
        private String value;
        private RoleType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
     public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise, 
            Ecosystem system);

   
    public String toString() {
        return this.getClass().getName();
    }
     
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;


import business.Role.Role;
import business.Role.SensorsAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class SensorsOrganisation extends Organisation {
    public SensorsOrganisation()
    {
        super(OrganisationType.SensorsOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new SensorsAdminRole());
       return roles;
    }
    
}

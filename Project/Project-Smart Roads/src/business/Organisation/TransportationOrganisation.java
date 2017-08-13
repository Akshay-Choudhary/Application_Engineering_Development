/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.Organisation.Organisation.OrganisationType;
import business.Role.Role;
import business.Role.TransportationOrgManagerRole;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class TransportationOrganisation extends Organisation {
    
    public TransportationOrganisation(){
        super(OrganisationType.TransportationOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TransportationOrgManagerRole());
        return roles;
    }
}

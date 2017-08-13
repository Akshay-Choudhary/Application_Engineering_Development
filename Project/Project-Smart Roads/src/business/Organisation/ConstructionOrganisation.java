/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.Role.ConstructionOrgManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class ConstructionOrganisation extends Organisation{
    
    public ConstructionOrganisation(){
        super(OrganisationType.ConstructionOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ConstructionOrgManagerRole());
        return roles;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.Enterprise.GovernmentEnterprise;
import business.Organisation.Organisation.OrganisationType;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organisationList;
    
    public OrganisationDirectory(){
        organisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void setOrganisationList(ArrayList<Organisation> organisationList) {
        this.organisationList = organisationList;
    }
    public Organisation createAndAddOrganisation(Organisation.OrganisationType type){
        Organisation org = null;
        if(type.getValue().equals(OrganisationType.WeatherOrganisation.getValue()))
        {
            org = new WeatherOrganisation();
            organisationList.add(org);
            return org;
        }else if(type.getValue().equals(OrganisationType.TransportationOrganisation.getValue()))
        {
            org = new TransportationOrganisation();
            organisationList.add(org);
            return org;
        }else if(type.getValue().equals(OrganisationType.ConstructionOrganisation.getValue()))
        {
            org = new ConstructionOrganisation();
            organisationList.add(org);
            return org;
        }else if(type.getValue().equals(OrganisationType.SensorsOrganisation.getValue()))
        {
            org = new SensorsOrganisation();
            organisationList.add(org);
            return org;
        }else if(type.getValue().equals(OrganisationType.DriverOrganisation.getValue()))
        {
            org = new DriverOrganisation();
            organisationList.add(org);
            return org;
        }
        return org;
        
        
    }
}

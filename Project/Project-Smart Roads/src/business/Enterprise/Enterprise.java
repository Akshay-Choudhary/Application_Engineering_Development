/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organisation.Organisation;
import business.Organisation.OrganisationDirectory;

/**
 *
 * @author aksha
 */
public abstract class Enterprise extends Organisation {
    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDir ;
    
     public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organisationDir = new OrganisationDirectory();
    }
     
    public enum EnterpriseType {
        Government("Government");
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
            
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return  value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganisationDirectory getOrganisationDir() {
        return organisationDir;
    }
        
    
}

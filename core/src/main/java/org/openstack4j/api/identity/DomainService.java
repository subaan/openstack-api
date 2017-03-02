package org.openstack4j.api.identity;

import java.util.List;
import org.openstack4j.common.RestService;
import org.openstack4j.model.identity.v3.Domain;

/**
 * Identity Domain based Operations
 * 
 * @author Abdul
 */
public interface DomainService extends RestService {
    
    /**
     * Lists all domains
     *
     * @return the list<? extends Domain>
     */
    List<? extends Domain> list();
    
    /**
     * Creates a new domain
     *
     * @param domain the Domain to create
     * @return the new domain
     */
    Domain create(Domain domain);
    
    
    /**
     * Creates a new domain
     *
     * @param name the name of the new domain
     * @param description the description of the new domain
     * @param enabled the enabled status of the new domain
     * @return the new domain
     */
    Domain create(String name, String description, boolean enabled);
    
    
    /**
     * Updates an existing domain
     *
     * @param domain the domain set to update
     * @return the updated domain
     */
    Domain update(Domain domain);
    
    /**
     * Get detailed information on a domain by id
     *
     * @param domainId the domain identifier
     * @return the domain
     */
    Domain get(String domainId);
}



package org.openstack4j.model.identity.v3;

import java.util.Map;
import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.identity.v3.builder.DomainBuilder;

/**
 * Represents an OpenStack Identity Version 3 Domain. Domains represent collections of users, groups, and projects. Each is owned by exactly one domain. Users, however, can be associated with multiple projects by granting roles to the user on a project, including projects owned by other domains. 
 * 
 * 
 * @author Abdul
 */
public interface Domain extends ModelEntity, Buildable<DomainBuilder> {
    
    /**
     * @return the unique identifier for this domain
     */
    String getId();

    /**
     * @return the name of the domain
     */
    String getName();
    
    /**
     * @return the description of the domain
     */
    String getDescription();
    
    /**
     * @return the Links of the domain
     */
    Map<String, String> getLinks();

    /**
     * @return if domain is enabled
     */
    boolean isEnabled();
}

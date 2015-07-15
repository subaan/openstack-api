package org.openstack4j.api.identity;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.Extension;
import org.openstack4j.model.identity.Endpoint;

/**
 * Identity Serivce Operations API
 * 
 * @author Jeremy Unruh
 */
public interface IdentityService extends RestService {

	/**
	 * Tenants Service API
	 *
	 * @return the tenant service
	 */
	TenantService tenants();
        
	/**
	 * Domains Service API
	 *
	 * @return the domain service
	 */
	DomainService domains();
        
        /**
	 * Projects Service API
	 *
	 * @return the project service
	 */
	ProjectService projects();
	
	/**
	 * Users Service API
	 *
	 * @return the user service
	 */
	UserService users();
	
	/**
	 * Role Service API
	 *
	 * @return the role service
	 */
	RoleService roles();
	
	/**
	 * Service Management API
	 *
	 * @return the service manager service
	 */
	ServiceManagerService services();
	
	/**
	 * List extensions currently available on the OpenStack instance
	 *
	 * @return List of extensions
	 */
	List<? extends Extension> listExtensions();
	
	/**
	 * Lists endpoints available for the current authenticated token
	 *
	 * @return List of endpoints
	 */
	List<? extends Endpoint> listTokenEndpoints();
	
}

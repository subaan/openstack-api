package org.openstack4j.model.network.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.network.ExternalGateway;
import org.openstack4j.model.network.ExternalGatewayInfo;
import org.openstack4j.model.network.Router;

/**
 * A Builder that creates a Router
 * 
 * @author Jeremy Unruh
 */
public interface RouterBuilder extends Builder<RouterBuilder, Router> {

	/**
	 * @see Router#getId()
	 */
	RouterBuilder id(String id);
	
	/**
	 * @see Router#getName()
	 */
	RouterBuilder name(String name);
	
	/**
	 * @see Router#getTenantId()
	 */
	RouterBuilder tenantId(String tenantId);
	
	/**
	 * @see Router#getTenantId()
	 */
	RouterBuilder tenant(Tenant tenant);
	
	/**
	 * @see Router#isAdminStateUp()()
	 */
	RouterBuilder adminStateUp(boolean isAdminStateUp);
	
	/**
	 * @see Router#getExternalGatewayInfo()
	 */
	RouterBuilder externalGateway(String networkId);
	
	/**
	 * @see Router#getExternalGatewayInfo()
	 */
	RouterBuilder externalGateway(ExternalGatewayInfo externalGateway);
	
	/**
	 * @see Router#getRoutes()
	 */
	RouterBuilder route(String destination, String nexthop);
}

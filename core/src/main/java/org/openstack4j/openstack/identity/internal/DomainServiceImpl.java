package org.openstack4j.openstack.identity.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.openstack4j.core.transport.ClientConstants.PATH_DOMAINS;
import java.util.List;
import org.openstack4j.api.identity.DomainService;
import org.openstack4j.model.identity.v3.Domain;
import org.openstack4j.openstack.identity.domain.KeystoneRole;
import org.openstack4j.openstack.identity.domain.v3.KeystoneDomain;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Identity Domain based Operations
 * 
 * @author Abdul
 */
public class DomainServiceImpl extends BaseOpenStackService implements DomainService {

    @Override
    public List<? extends Domain> list() {
        return get(KeystoneDomain.Domains.class, uri("/domains")).execute().getList();
    }

    @Override
    public Domain create(Domain domain) {
        checkNotNull(domain);
        return post(KeystoneDomain.class, PATH_DOMAINS).entity(domain).execute();
    }
    
    @Override
    public Domain create(String name, String description, boolean enabled) {
        
         checkNotNull(name);
        checkNotNull(description);
        checkNotNull(enabled);
        return create(KeystoneDomain.builder().name(name).description(description).enabled(enabled).build());
    }
    
    @Override
    public Domain update(Domain domain) {
        checkNotNull(domain);
        return patch(KeystoneDomain.class, PATH_DOMAINS, "/", domain.getId()).entity(domain).execute();
    }
    
     @Override
    public Domain get(String domainId) {
        checkNotNull(domainId);
        return get(KeystoneDomain.class, PATH_DOMAINS, "/", domainId).execute();
    }
    
}

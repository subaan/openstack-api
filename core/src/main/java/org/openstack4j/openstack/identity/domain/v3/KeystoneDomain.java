package org.openstack4j.openstack.identity.domain.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import org.openstack4j.model.identity.v3.Domain;
import org.openstack4j.model.identity.v3.builder.DomainBuilder;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.identity.domain.KeystoneRole;

/**
 * Represents an OpenStack Identity Version 3 Domain. Domains represent
 * collections of users, groups, and projects. Each is owned by exactly one
 * domain. Users, however, can be associated with multiple projects by granting
 * roles to the user on a project, including projects owned by other domains.
 *
 * @author Abdul
 */
@JsonRootName("domain")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeystoneDomain implements Domain {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    private Map<String, String> links;
    private boolean enabled; 

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public boolean isEnabled() {
        return enabled;
    }
    
     /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getLinks() {
        return links;
    }
    
    /**
     * set endpoint enabled
     *
     * @param enabled the new enabled status
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(getClass()).omitNullValues()
                .add("id", id).add("name", name).add("description", description).add("enabled", enabled).toString();
    }
    
    /**
     * @return the domain builder
     */
    public static DomainBuilder builder() {
        return new DomainConcreteBuilder();
    }

    @Override
    public DomainBuilder toBuilder() {
        return new DomainConcreteBuilder(this);
    }

    public static class Domains extends ListResult<KeystoneDomain> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("domains")
        private List<KeystoneDomain> list;

        @Override
        protected List<KeystoneDomain> value() {
            return list;
        }

    }
    public static class DomainConcreteBuilder implements DomainBuilder {

        KeystoneDomain model;

        public DomainConcreteBuilder() {
            this(new KeystoneDomain());
        }

        DomainConcreteBuilder(KeystoneDomain model) {
            this.model = model;
        }

        @Override
        public Domain build() {
            return model;
        }

        @Override
        public DomainBuilder from(Domain in) {
            if (in != null)
                this.model = (KeystoneDomain) in;
            return this;
        }

        @Override
        public DomainBuilder id(String id) {
            model.id = id;
            return this;
        }

        @Override
        public DomainBuilder description(String description) {
            model.description = description;
            return this;
        }

        @Override
        public DomainBuilder name(String name) {
            model.name = name;
            return this;
        }

        @Override
        public DomainBuilder links(Map<String, String> links) {
            model.links = links;
            return this;
        }

        @Override
        public DomainBuilder enabled(boolean enabled) {
            model.enabled = enabled;
            return this;
        }

    }

}

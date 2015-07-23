package org.treewalk.devops.data.model.component;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.treewalk.devops.data.model.ID;
import org.treewalk.devops.data.model.IdentifiableEntity;

import java.util.ArrayList;
import java.util.Collection;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * <p>Defines a complete {@link Component}.</p>
 *
 * <p></p>
 */
public final class Component extends IdentifiableEntity {

    private ComponentIdentifier identifier;
    private ComponentPackaging packaging;
    private Collection<ComponentDependency> dependencies;

    /**
     * <p>Default Constructor</p>
     */
    public Component() {
        this.dependencies = new ArrayList<>();
    }

    /**
     * <p>Construct a {@link Component} from the constituent parts.</p>
     *
     * @param id the internal identifier
     * @param identifier the {@link ComponentIdentifier}
     * @param packaging the {@link ComponentPackaging}
     * @param dependencies the {@link ComponentDependency}(s)
     */
    public Component(final ID id, final ComponentIdentifier identifier, final ComponentPackaging packaging,
                     final Collection<ComponentDependency> dependencies) {
        super(id);
        this.identifier = identifier;
        this.packaging = packaging;
        if (dependencies != null && dependencies.size() > 0) {
            this.dependencies = new ArrayList<>(dependencies);
        }
    }

    /**
     * <p>Construct a {@link Component} from the constituent parts.</p>
     *
     * @param id the internal identifier
     * @param groupId
     * @param artifactId
     * @param version
     * @param packaging the {@link ComponentPackaging}
     * @param dependencies the {@link ComponentDependency}(s)
     */
    public Component(final ID id, final String groupId, final String artifactId, final String version,
                     final ComponentPackaging packaging, final Collection<ComponentDependency> dependencies) {


        this(id, new ComponentIdentifier(new ComponentNamespace(groupId, artifactId), new ComponentVersion(version)),
                packaging, dependencies);
    }

    public ComponentIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ComponentIdentifier identifier) {
        this.identifier = identifier;
    }

    public ComponentPackaging getPackaging() {
        return packaging;
    }

    public void setPackaging(ComponentPackaging packaging) {
        this.packaging = packaging;
    }

    public Collection<ComponentDependency> getDependencies() {
        return ImmutableList.<ComponentDependency>builder().addAll(dependencies).build();
    }

    public void addDependency(ComponentDependency dependency) {
        this.dependencies.add(dependency);
    }

    public void addDependencies(Collection<ComponentDependency> dependencies) {
        this.dependencies.addAll(dependencies);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Component component = (Component) o;

        return new EqualsBuilder().append(this.identifier, ((Component) o).getIdentifier()).isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identifier).hashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this).append(identifier).append(packaging).toString();
    }
}

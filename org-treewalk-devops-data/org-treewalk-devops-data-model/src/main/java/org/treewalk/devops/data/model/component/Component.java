package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>Defines a specific version of a {@link Component}.</p>
 */
public class Component extends IdentifiableEntity {

    private ComponentIdentifier identifier;
    private ComponentVersion version;
    private ComponentPackaging packaging;
    private Collection<ComponentDependency> dependencies;

    public Component() {
        this.dependencies = new ArrayList<>();
    }

    public ComponentIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ComponentIdentifier identifier) {
        this.identifier = identifier;
    }

    public ComponentVersion getVersion() {
        return version;
    }

    public void setVersion(ComponentVersion version) {
        this.version = version;
    }

    public ComponentPackaging getPackaging() {
        return packaging;
    }

    public void setPackaging(ComponentPackaging packaging) {
        this.packaging = packaging;
    }

    public Collection<ComponentDependency> getDependencies() {
        return dependencies;
    }

    public void addDependency(ComponentDependency dependency) {
        this.dependencies.add(dependency);
    }

    /**
     * <p>Equality is based of the <code>GAV</code> co-ordinates</p>
     *
     * @param o the object to compare
     *
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Component component = (Component) o;

        if (identifier != null ? !identifier.equals(component.identifier) : component.identifier != null) return false;
        return !(version != null ? !version.equals(component.version) : component.version != null);

    }

    /**
     * <p>Hash is based on the <code>GAV</code> co-ordinates</p>
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        int result = identifier != null ? identifier.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}

package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>Defines an association between {@link Component}'s.</p>
 */
public class ComponentDependency extends IdentifiableEntity {

    private Component dependency;
    private Collection<ComponentIdentifier> exclusions;
    private ComponentDependencyScope scope;

    public ComponentDependency() {
        this.exclusions = new ArrayList<>();
    }

    public Component getDependency() {
        return dependency;
    }

    public void setDependency(Component dependency) {
        this.dependency = dependency;
    }

    public ComponentDependencyScope getScope() {
        return scope;
    }

    public void setScope(ComponentDependencyScope scope) {
        this.scope = scope;
    }

    public Collection<ComponentIdentifier> getExclusions() {
        return exclusions;
    }

    public void addExclusion(ComponentIdentifier identifier) {
        this.exclusions.add(identifier);
    }
}

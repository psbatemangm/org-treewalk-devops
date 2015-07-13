package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>Defines an association between {@link Component}'s.</p>
 */
public final class ComponentDependency {

    private Component dependency;
    private Collection<ComponentNamespace> exclusions;
    private ComponentDependencyScope scope;

    public ComponentDependency(Component dependency, Collection<ComponentNamespace> exclusions, ComponentDependencyScope scope) {
        this.dependency = dependency;
        this.exclusions = new ArrayList<>(exclusions);
        this.scope = scope;
    }

    public Component getDependency() {
        return dependency;
    }

    public void setDependency(Component dependency) {
        this.dependency = dependency;
    }

    public Collection<ComponentNamespace> getExclusions() {
        return this.exclusions;
    }

    public void addExclusion(ComponentNamespace exclusion) {
        this.exclusions.add(exclusion);
    }

    public ComponentDependencyScope getScope() {
        return scope;
    }

    public void setScope(ComponentDependencyScope scope) {
        this.scope = scope;
    }
}

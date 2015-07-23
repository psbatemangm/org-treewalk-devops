package org.treewalk.devops.data.model.component;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>Defines an association between {@link Component}'s.</p>
 *
 * <p>Modelled on <code>Maven</code> dependency structure. The list collection of exclusions act as a
 * mask when evaluating the transitive dependencies, but does not alter the actual graph of dependencies.
 * </p>
 */
public final class ComponentDependency {

    private Component dependency;
    private Collection<ComponentNamespace> exclusions;
    private ComponentDependencyScope scope;

    /**
     * <p>Construct a {@link ComponentDependency} graph using the dependency, exclusions and scope.</p>
     *
     * @param dependency the {@link Component} dependency
     * @param exclusions the collection of exclusions for transitive dependencies
     * @param scope the dependency scoping rule
     */
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
        return ImmutableList.<ComponentNamespace>builder().addAll(exclusions).build();
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

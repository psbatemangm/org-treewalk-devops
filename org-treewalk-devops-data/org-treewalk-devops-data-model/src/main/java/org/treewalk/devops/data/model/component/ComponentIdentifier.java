package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * <p>A {@link ComponentIdentifier} combines the {@link ComponentNamespace} and {@link ComponentVersion}.</p>
 */
public final class ComponentIdentifier {

    private ComponentNamespace namespace;
    private ComponentVersion version;

    public ComponentIdentifier() {
    }

    public ComponentIdentifier(ComponentNamespace namespace, ComponentVersion version) {
        this.namespace = namespace;
        this.version = version;
    }

    public ComponentNamespace getNamespace() {
        return namespace;
    }

    public void setNamespace(ComponentNamespace namespace) {
        this.namespace = namespace;
    }

    public ComponentVersion getVersion() {
        return version;
    }

    public void setVersion(ComponentVersion version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComponentIdentifier that = (ComponentIdentifier) o;

        if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null) return false;
        return !(version != null ? !version.equals(that.version) : that.version != null);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (namespace != null ? namespace.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return toStringHelper(this).add("namespace", namespace).add("version", version).toString();
    }
}

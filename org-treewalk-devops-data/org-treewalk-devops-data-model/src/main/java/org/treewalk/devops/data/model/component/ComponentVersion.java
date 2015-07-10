package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

/**
 * <p>The version of a {@link Component}.</p>.
 */
public class ComponentVersion extends IdentifiableEntity {
    private String version;

    public ComponentVersion() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ComponentVersion that = (ComponentVersion) o;

        return !(version != null ? !version.equals(that.version) : that.version != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}

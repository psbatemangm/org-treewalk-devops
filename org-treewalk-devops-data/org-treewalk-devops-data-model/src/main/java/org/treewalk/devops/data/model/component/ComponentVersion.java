package org.treewalk.devops.data.model.component;

import com.google.common.base.MoreObjects;
import org.treewalk.devops.data.model.IdentifiableEntity;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * <p>The version of a {@link Component}.</p>.
 */
public final class ComponentVersion {
    private String version;

    public ComponentVersion() {
    }

    public ComponentVersion(String version) {
        this.version = version;
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

        ComponentVersion that = (ComponentVersion) o;

        return !(version != null ? !version.equals(that.version) : that.version != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("version", version).toString();
    }
}

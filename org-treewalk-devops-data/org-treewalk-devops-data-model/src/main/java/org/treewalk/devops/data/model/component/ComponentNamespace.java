package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

/**
 * <p>Identifies the <code>Group</code> and the <code>Artifact</code> of a {@link Component}.</p>
 */
public final class ComponentNamespace {

    private String groupId;
    private String artifactId;

    /**
     * <p>Default Constructor</p>
     */
    public ComponentNamespace() {
    }

    public ComponentNamespace(String groupId, String artifactId) {
        this.groupId = groupId;
        this.artifactId = artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComponentNamespace that = (ComponentNamespace) o;

        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        return !(artifactId != null ? !artifactId.equals(that.artifactId) : that.artifactId != null);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (artifactId != null ? artifactId.hashCode() : 0);
        return result;
    }
}

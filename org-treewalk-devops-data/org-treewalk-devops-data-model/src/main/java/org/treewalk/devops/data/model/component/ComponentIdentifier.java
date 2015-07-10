package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.IdentifiableEntity;

/**
 * <p></p>
 */
public final class ComponentIdentifier extends IdentifiableEntity {

    private String groupId;
    private String artefactId;

    public ComponentIdentifier() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtefactId() {
        return artefactId;
    }

    public void setArtefactId(String artefactId) {
        this.artefactId = artefactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComponentIdentifier that = (ComponentIdentifier) o;


        if (groupId != null ? !groupId.equals(that.getGroupId()) : that.getGroupId() != null) return false;
        return !(artefactId != null ? !artefactId.equals(that.artefactId) : that.artefactId != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + groupId.hashCode();
        result = 31 * result + artefactId.hashCode();
        return result;
    }
}

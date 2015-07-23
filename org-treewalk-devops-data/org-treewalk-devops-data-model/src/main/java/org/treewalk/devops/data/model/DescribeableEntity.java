package org.treewalk.devops.data.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * <p>Defines an <code>Entity</code> that has descriptive narrative associated with it.</p>
 */
public abstract class DescribeableEntity extends IdentifiableEntity {

    private ID nameResourceId;
    private ID narrativeResourceId;
    private String internalName;

    public DescribeableEntity(ID id, ID nameResourceId, ID narrativeResourceId, String internalName) {
        super(id);
        this.nameResourceId = nameResourceId;
        this.narrativeResourceId = narrativeResourceId;
        this.internalName = internalName;
    }

    public ID getNameResourceId() {
        return nameResourceId;
    }

    public ID getNarrativeResourceId() {
        return narrativeResourceId;
    }

    public String getInternalName() {
        return internalName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(nameResourceId).
                append(narrativeResourceId).append(internalName).toString();
    }
}

package org.treewalk.devops.data.model;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * <p>Base class for all data model entities.</p>
 */
public abstract class IdentifiableEntity {

    private ID id;

    /**
     * <p>Default constructor</p>
     */
    protected IdentifiableEntity() {
    }

    /**
     * <p>Construct an {@link IdentifiableEntity} using an {@link ID};</p>
     * @param id
     */
    public IdentifiableEntity(ID id) {
        this.id = id;
    }

    public final ID getId() {
        return id;
    }

    public final void setId(ID id) {
        this.id = id;
    }

    /**
     * <p>Equality is based on the value of the {@link ID}.</p>
     *
     * @param o the object to compare
     *
     * @return <code>true</code> if equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentifiableEntity that = (IdentifiableEntity) o;

        return id.equals(that.id);

    }

    /**
     * <p>Hash based on the value of the {@link ID}.</p>
     *
     * @return the hash value of the {@link ID}.
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return toStringHelper("ID").addValue(id).toString();
    }

}

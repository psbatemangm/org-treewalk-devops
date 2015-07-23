package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.DescribeableEntity;
import org.treewalk.devops.data.model.ID;
import org.treewalk.devops.data.model.IdProvider;

/**
 * <p>Defines the packaging type of the {@link Component}.</p>
 *
 * @version 0.1
 */
public final class ComponentPackaging extends DescribeableEntity {

    /**
     * <p>Construct a {@link ComponentPackaging}.</p>
     * @param id
     * @param nameResourceId
     * @param narrativeResourceId
     * @param internalName
     */
    public ComponentPackaging(ID id, ID nameResourceId, ID narrativeResourceId, String internalName) {
        super(id, nameResourceId, narrativeResourceId, internalName);
    }

    /**
     * <p>Identifies the well-known packaging identifiers</p>
     */
    enum WelknownId {

        // Maven Style Packaging
        JAR(10),
        WAR(20),
        EAR(30),
        POM(40),

        // Docker Style Packaging
        DOCKER(50);

        // the internal identifier
        private int id;

        /**
         * Construct the {@link WelknownId}
         * with the hard coded identifiers.
         * @param id
         */
        WelknownId(int id) {
            this.id = id;
        }

        /**
         * <p>Return a {@link ID} representation of this enumeration.</p>
         */
        public ID getId() {
            return new ID() {
                @Override
                public String toString() {
                    return Integer.toString(id);
                }
            };
        }
    }
}


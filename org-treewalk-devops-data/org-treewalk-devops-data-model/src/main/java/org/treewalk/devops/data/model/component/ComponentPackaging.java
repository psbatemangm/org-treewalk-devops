package org.treewalk.devops.data.model.component;

import org.treewalk.devops.data.model.ID;
import org.treewalk.devops.data.model.IdentifiableEntity;

/**
 * <p>Defines the packaging type of the {@link Component}.</p>
 */
public final class ComponentPackaging extends IdentifiableEntity {

    /**
     * <p>Identifies the well-known packaging identifiers</p>
     */
    enum Type {
        JAR(10),
        WAR(20),
        EAR(30),
        POM(40);
        private int id;

        Type(int id) {
            this.id = id;
        }
    }
}

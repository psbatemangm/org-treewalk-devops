package org.treewalk.devops.data.model;

/**
 * <p>The {@link IdProvider} is used to generate an {@link ID}.</p>
 */
public interface IdProvider {

    /**
     * <p>Generate an {@link ID} from scratch.</p>
     *
     * @return the generated {@link ID}
     */
    ID generate();

    /**
     * <p>Generate an {@link ID} based on the provided representation.</p>
     *
     * @param id the provided identifier representation.
     *
     * @return the generated {@link ID}
     */
    ID generate(String id);
}

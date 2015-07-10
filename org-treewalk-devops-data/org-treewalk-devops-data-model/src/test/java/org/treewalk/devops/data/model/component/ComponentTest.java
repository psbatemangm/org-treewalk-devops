package org.treewalk.devops.data.model.component;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ComponentTest {

    @Test
    public void testComponentCoordinateEqualityWithSameObject() {
        // given
        Component component1 = new Component();

        // then
        assertThat(component1.equals(component1), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithNullObject() {
        // given
        Component component1 = new Component();

        // then
        assertThat(component1.equals(null), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithDifferentType() {
        // given
        Component component1 = new Component();

        // then
        assertThat(component1.equals("boo"), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithNoValues() {
        // given
        Component component1 = new Component();
        Component component2 = new Component();

        // then
        assertThat(component1.equals(component2), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithGroupIdTheSame() {
        // given
        Component component1 = new Component();
        ComponentIdentifier componentIdentifier1 = new ComponentIdentifier();
        component1.setIdentifier(componentIdentifier1);
        componentIdentifier1.setGroupId("bar");

        Component component2 = new Component();
        ComponentIdentifier componentIdentifier2 = new ComponentIdentifier();
        component2.setIdentifier(componentIdentifier2);
        componentIdentifier2.setGroupId("bar");

        // then
        assertThat(component1.equals(component2), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithGroupIdTheNotSame() {
        // given
        Component component1 = new Component();
        ComponentIdentifier componentIdentifier1 = new ComponentIdentifier();
        component1.setIdentifier(componentIdentifier1);
        componentIdentifier1.setGroupId("foo");

        Component component2 = new Component();
        ComponentIdentifier componentIdentifier2 = new ComponentIdentifier();
        component2.setIdentifier(componentIdentifier2);
        componentIdentifier2.setGroupId("bar");

        // then
        assertThat(component1.equals(component2), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithArtefactIdTheSame() {
        // given
        Component component1 = new Component();
        ComponentIdentifier componentIdentifier1 = new ComponentIdentifier();
        component1.setIdentifier(componentIdentifier1);
        componentIdentifier1.setArtefactId("bar");

        Component component2 = new Component();
        ComponentIdentifier componentIdentifier2 = new ComponentIdentifier();
        component2.setIdentifier(componentIdentifier2);
        componentIdentifier2.setArtefactId("bar");

        // then
        assertThat(component1.equals(component2), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithArtefactIdNotSame() {
        // given
        Component component1 = new Component();
        ComponentIdentifier componentIdentifier1 = new ComponentIdentifier();
        component1.setIdentifier(componentIdentifier1);
        componentIdentifier1.setArtefactId("foo");

        Component component2 = new Component();
        ComponentIdentifier componentIdentifier2 = new ComponentIdentifier();
        component2.setIdentifier(componentIdentifier2);
        componentIdentifier2.setArtefactId("bar");

        // then
        assertThat(component1.equals(component2), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithAllValuesEqual() {
        // given
        Component component1 = new Component();
        ComponentIdentifier componentIdentifier1 = new ComponentIdentifier();
        ComponentVersion componentVersion1 = new ComponentVersion();
        component1.setIdentifier(componentIdentifier1);
        component1.setVersion(componentVersion1);
        componentIdentifier1.setArtefactId("foo");
        componentIdentifier1.setGroupId("bar");
        componentVersion1.setVersion("1");

        Component component2 = new Component();
        ComponentIdentifier componentIdentifier2 = new ComponentIdentifier();
        ComponentVersion componentVersion2 = new ComponentVersion();
        component2.setIdentifier(componentIdentifier1);
        component2.setVersion(componentVersion1);
        componentIdentifier2.setArtefactId("foo");
        componentIdentifier2.setGroupId("bar");
        componentVersion2.setVersion("1");

        // then
        assertThat(component1.equals(component2), is(true));
    }
}

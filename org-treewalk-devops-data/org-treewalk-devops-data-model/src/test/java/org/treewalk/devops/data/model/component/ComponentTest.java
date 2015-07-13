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
        Component component1 = new Component(null, "foo", null ,null, null, null);

        Component component2 = new Component(null, "foo", null ,null, null, null);

        // then
        assertThat(component1.equals(component2), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithGroupIdTheNotSame() {
        // given
        Component component1 = new Component(null, "foo", null ,null, null, null);

        Component component2 = new Component(null, "bar", null ,null, null, null);

        // then
        assertThat(component1.equals(component2), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithArtefactIdTheSame() {
        // given
        Component component1 = new Component(null, null, "bar" ,null, null, null);

        Component component2 = new Component(null, null, "bar" ,null, null, null);

        // then
        assertThat(component1.equals(component2), is(true));
    }

    @Test
    public void testComponentCoordinateEqualityWithArtefactIdNotSame() {
        // given
        Component component1 = new Component(null, null, "foo" ,null, null, null);

        Component component2 = new Component(null, null, "bar" ,null, null, null);

        // then
        assertThat(component1.equals(component2), is(false));
    }

    @Test
    public void testComponentCoordinateEqualityWithAllValuesEqual() {
        // given
        Component component1 = new Component(null, "foo", "bar" ,"1", null, null);

        Component component2 = new Component(null, "foo", "bar" ,"1", null, null);

        // then
        assertThat(component1.equals(component2), is(true));
    }
}

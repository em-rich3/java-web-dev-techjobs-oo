package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;

    @Before
    public void createJobObject() {
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        testJob3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId(), .001);
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

//    @Test
//    public void testConstructorAssigningID() {
//        assertEquals(1, testJob1.getId(), .001);
//    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(1, testJob1.getId(), .001);
        assertEquals("Name: Product tester", testJob1.getName());
        assertEquals("Employer: ACME", testJob1.getEmployer().getValue());
        assertEquals("Location: Desert", testJob1.getLocation().getValue());
        assertEquals("Position Type: Quality control", testJob1.getPositionType().getValue());
        assertEquals("Core Competency: Persistence", testJob1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(testJob2, testJob3);
    }

    @Test
    public void toStringTest() {
        assertEquals("/n" +
                testJob1.getId() + "/n" +
                testJob1.getName() + "/n" +
                testJob1.getEmployer() + "/n" +
                testJob1.getLocation() + "/n" +
                testJob1.getPositionType() + "/n" +
                testJob1.getCoreCompetency() + "/n" +
                "/n", testJob1.toString());
    }

    @Test
    public void toStringEmptyField() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location(null), new PositionType(""), new CoreCompetency(null));
        assertEquals("Location: Data Not Available", testJob4.getLocation().getValue());
        assertEquals("Position Type: Data Not Available", testJob4.getPositionType().getValue());

    }
}

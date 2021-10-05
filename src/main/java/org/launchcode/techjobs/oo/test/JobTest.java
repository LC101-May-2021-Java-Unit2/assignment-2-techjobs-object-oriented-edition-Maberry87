package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }
    @Test
    public void  testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals("Product tester", job1.getName());
        Assert.assertEquals("ACME", job1.getEmployer().getValue());
        Assert.assertEquals("Desert",job1.getLocation().getValue());
        Assert.assertEquals("Quality control", job1.getPositionType().getValue());
        Assert.assertEquals("Persistence",job1.getCoreCompetency().getValue());
        Assert.assertTrue(job1.getEmployer() instanceof Employer);
        Assert.assertTrue(job1.getLocation() instanceof Location);
        Assert.assertTrue(job1.getPositionType() instanceof PositionType);
        Assert.assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertTrue(job1 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.getId() != job2.getId());
    }

}

package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job testClass = new Job();
        Job testClass2 = new Job();
        assertFalse(testClass.getId() == testClass2.getId());
    }
    @Test
    public void testJobIdByOne() {
        Job testClass = new Job();
        Job testClass2 = new Job();
        assertTrue(testClass.getId() == testClass2.getId() - 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testClass = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testClass.getName(), "Product tester");
        assertEquals(testClass.getEmployer().toString(), "ACME");
        assertEquals(testClass.getLocation().toString(), "Desert");
        assertEquals(testClass.getPositionType().toString(), "Quality control");
        assertEquals(testClass.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        Job testClass = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testClass2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testClass.equals(testClass2));
    }
    @Test
    public void testBlankLine(){
        Job testClass = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testClass2 = testClass;
        assertFalse(testClass.toString() == testClass2.toString().trim());
    }
    @Test
    public void testFieldAndLabel(){
        Job testClass = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testEmployer = "Employer: " + testClass.getEmployer();
        assertEquals("Employer: ACME", testEmployer);
    }
    @Test
    public void testIfEmpty(){
        Job testClass = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Data not available", testClass.getEmployer().toString());
    }
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
}

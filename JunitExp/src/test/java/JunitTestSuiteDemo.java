import junit.framework.*;

public class JunitTestSuiteDemo {
    public static TestSuite suite(){
        // Create TestSuite Class testSuite
        TestSuite testSuite = new TestSuite("First Try TestSuite");

        // Add test set to testSuite
        testSuite.addTestSuite(JunitTestCaseDemo.class);

        // Add single test to testSuite
        Test singleTest = TestSuite.createTest(JunitTestCaseDemo.class,"testFindday_13");
        testSuite.addTest(singleTest);

        return testSuite;
    }
}

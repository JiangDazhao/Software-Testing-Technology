import org.testng.annotations.Test;
public class DemoTest_2 {
    @Test(dependsOnMethods = {"testCase_2"})
    public void testCase_1() {
        System.out.println("testCase_2 �������");
    }
    @Test()
    public void testCase_2() {
        System.out.println("testCase_2 ��������");
    }
}

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class DemoTest_1 {
    @Test(priority = 2)
    public void testCase_2() {
        System.out.println("我是第 2 个");
    }
    @Test(priority = 1)
    public void testCase_1() {
        System.out.println("我是第 1 个");
    }
    @Test(priority = 0)
    public void testCase_0() {
        System.out.println("我是第 0 个");
    }
    @Test(priority = 3)
    public void testCase_3() {
        System.out.println("我是第 3 个");
    }
}

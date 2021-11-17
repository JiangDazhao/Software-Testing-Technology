import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class DemoTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("在每个测试方法开始运行前执行");
    }

    @Test(groups = "分组一")
    public void testCase(){
        System.out.println("执行测试 2-2");
    }
    @Test(groups = "分组二")
    public void testCase2_1(){
        System.out.println("执行测试 2_1");
    }
    @Test(groups = "分组二")
    @Parameters({"a"})
    public void testCase2_2(String a){
        System.out.println("执行测试 2_2" + a);
    }
    @AfterClass
    public void afterClass(){
        System.out.println("在当前测试类的最后一个测试方法结束运行后执行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("在当前测试类的第一个测试方法开始调用前执行");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("在测试类中的 Test 开始运行前执行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("在测试类中的 Test 结束运行后执行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("在当前测试集合中的所有测试程序开始运行前执行");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("在所有测试方法运行结束后执行");
    }
//    @Test(groups = "分组一")
//    public void testCounting() {
//        Demo demo = new Demo();
//        assertEquals(demo.Counting(2,3,8),0);
//        System.out.println("Hello Test");
//    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("在当前测试集合中的所有测试程序结束运行后开始执 行");
    }
}

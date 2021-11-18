import org.testng.annotations.*;

import static org.testng.Assert.*;

public class demoTest {
    demo cal = new demo();
    @BeforeMethod
    public void setUp() {
        System.out.println("在每个测试方法开始运行前执行");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("在每个测试方法结束运行后执行");

    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("在Test方法开始运行后前执行");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("在Test方法结束运行后执行");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("在类开始运行前执行");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("在类开始结束后执行");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("在套件开始运行前执行");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("在套件开始结束后执行");
    }

    @Test(groups = "分组一")
    @Parameters({"operand1","operand2"})
    public void testAdd(int operand1,int operand2) {
        cal.add(operand1,operand2);
        System.out.println(cal.getResult());
    }

    @Test
    @Parameters({"operand1","operand2"})
    public void testSubtract(int operand1,int operand2) {
        cal.subtract(operand1,operand2);
        System.out.println(cal.getResult());
    }

    @Test
    public void testMultiple() {
    }

    @Test
    public void testDivide() {
    }

    @Test
    public void testGetResult() {
    }
}
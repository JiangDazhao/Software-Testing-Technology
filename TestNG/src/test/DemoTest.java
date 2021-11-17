import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class DemoTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("��ÿ�����Է�����ʼ����ǰִ��");
    }

    @Test(groups = "����һ")
    public void testCase(){
        System.out.println("ִ�в��� 2-2");
    }
    @Test(groups = "�����")
    public void testCase2_1(){
        System.out.println("ִ�в��� 2_1");
    }
    @Test(groups = "�����")
    @Parameters({"a"})
    public void testCase2_2(String a){
        System.out.println("ִ�в��� 2_2" + a);
    }
    @AfterClass
    public void afterClass(){
        System.out.println("�ڵ�ǰ����������һ�����Է����������к�ִ��");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("�ڵ�ǰ������ĵ�һ�����Է�����ʼ����ǰִ��");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("�ڲ������е� Test ��ʼ����ǰִ��");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("�ڲ������е� Test �������к�ִ��");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("�ڵ�ǰ���Լ����е����в��Գ���ʼ����ǰִ��");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("�����в��Է������н�����ִ��");
    }
//    @Test(groups = "����һ")
//    public void testCounting() {
//        Demo demo = new Demo();
//        assertEquals(demo.Counting(2,3,8),0);
//        System.out.println("Hello Test");
//    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("�ڵ�ǰ���Լ����е����в��Գ���������к�ʼִ ��");
    }
}

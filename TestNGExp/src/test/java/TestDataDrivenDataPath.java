import org.testng.annotations.*;
        import util.CsvUtil;
        import java.io.IOException;
        import static org.junit.Assert.*;
public class TestDataDrivenDataPath {
    public static String filePath = "src/main/resources/DataTest.csv";//文件相对路径

    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException{
        return CsvUtil.getTestData(filePath);
    }

    @Test(dataProvider = "testData")
    public void test(String year, String month, String day, String findDay)
    {
        CalculateDate2 calDate = new CalculateDate2();
        int result= calDate.findDay(Double.parseDouble(year.trim()),Double.parseDouble(month.trim()),Double.parseDouble(day.trim()));
        int a =Integer.parseInt(findDay.trim());
        assertEquals(a,result);
    }

    @BeforeTest
    public void start() throws Exception {
        System.out.println("TestNG开始");
    }
    @AfterTest
    public void end() throws Exception {
        System.out.println("TestNG结束");
    }
    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("该测试用例开始");
    }
    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("该测试用例结束");
    }
}

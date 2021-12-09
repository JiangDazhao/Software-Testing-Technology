import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.CsvUtil;

import javax.naming.directory.SearchResult;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestDataDrivenJiPath {
    public static String filePath = "src/main/resources/JiTest.csv";//文件相对路径

    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException{
        return CsvUtil.getTestData(filePath);
    }
    @Test(dataProvider = "testData")
    public void test(String year, String month, String day)
    {
        CalculateDate2 calDate = new CalculateDate2();
        int out= calDate.findDay(Double.valueOf(year),Double.valueOf(month),Double.valueOf(day));
        System.out.println(out);
//        assertEquals(-1,result);
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("数据驱动基路径测试开始...");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("数据驱动基路径测试结束...");
    }
}
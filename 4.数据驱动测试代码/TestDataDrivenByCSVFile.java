import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;



public class TestDataDrivenByCSVFile {
    public WebDriver driver;
    String url = "http://www.baidu.com";
    public static String filePath = "src/main/resources/dataProvider.csv";

    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException{
        return util.CsvUtil.getTestData(filePath);
    }
    @Test(dataProvider = "testData")
    public void test(String searchWord1, String searchWord2, String SearchResult){

        driver.get(url); //打开百度首页
        driver.findElement(By.id("kw")).sendKeys(searchWord1+" "+searchWord2); //在搜索框中输入"JUnit"
        driver.findElement(By.id("su")).click(); //点击”百度一下”按钮
        //强制等待3S
        /*try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
        //显示等待，等待元素加载完毕再进行下一步
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d){
                return d.findElement(By.id("help")).getText().contains("用户反馈");
            }
        });
        Assert.assertTrue(driver.getPageSource().contains(SearchResult));
//        driver.quit();
    }
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");// chromedriver服务地址
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void AfterMethod(){
        driver.quit();
    }
}
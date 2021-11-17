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
import util.CsvUtil;

import java.io.IOException;

public class TestDataProviderByCSVFile {
    public WebDriver driver;
    String url = "http://www.baidu.com";
    public static String filePath = "src/main/resources/dataProvider.csv";//文件相对路径

    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException{
        return CsvUtil.getTestData(filePath);
    }
    @Test(dataProvider = "testData")
    public void test(String searchWord1, String searchWord2, String SearchResult)
    {
        driver.get(url); //打开百度首页
        driver.findElement(By.id("kw")).sendKeys(searchWord1+" "+searchWord2);//在搜索框中输入searchWord1+" "+searchWord2
        driver.findElement(By.id("su")).click(); //点击”百度一下”按钮
        //强制等待3S
        /*try {
        Thread.sleep(3000);
        }catch (InterruptedException e){e.printStackTrace();
        }*/
        //显式等待，等待元素加载完毕再进行下一步
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d){
                //通过用户反馈这个信息，判断网页是否加载完毕
                return d.findElement(By.id("help")).getText().contains("用户反馈");
            }
        });
//        String temp = driver.findElement(By.xpath("//* [@id=\"1\"]/div/div/div/div[2]/div[2]/a")).getText();
//        System.out.println(temp);
//        Assert.assertTrue(temp.equals(SearchResult));
        Assert.assertTrue(driver.getPageSource().contains(SearchResult));//断言，检查页面中的所有信息是否包含SearchResult元素
        // driver.quit();
    }
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");// chromedriver 服务地址
        driver = new ChromeDriver(); // 新建一个 WebDriver 的对象，但是 new 的是谷歌的驱动
    }
    @AfterMethod
    public void AfterMethod(){
        driver.quit();
    }
}
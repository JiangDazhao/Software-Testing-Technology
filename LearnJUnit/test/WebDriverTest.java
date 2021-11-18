import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

public class WebDriverTest {
    public WebDriver driver;
    String url = "http://www.baidu.com";
    @Before
    public void setUp() throws Exception{
        System.out.println("测试开始");
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");// chromedriver 服务地址
        driver = new ChromeDriver(); // 新建一个 WebDriver 的对象，但是 new 的是谷歌的驱动
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("测试结束");
        Thread.sleep(2000); //等待两秒后再执行
        driver.quit(); // 关闭打开的浏览器
    }
    @Test
    public void test(){
        driver.get(url+"/"); //打开百度首页
        driver.findElement(By.id("kw")).sendKeys("JUnit"); //在搜索框中输入"JUnit"
        driver.findElement(By.id("su")).click(); //点击”百度一下”按钮
    }

}

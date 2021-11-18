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
        System.out.println("���Կ�ʼ");
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");// chromedriver �����ַ
        driver = new ChromeDriver(); // �½�һ�� WebDriver �Ķ��󣬵��� new ���ǹȸ������
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("���Խ���");
        Thread.sleep(2000); //�ȴ��������ִ��
        driver.quit(); // �رմ򿪵������
    }
    @Test
    public void test(){
        driver.get(url+"/"); //�򿪰ٶ���ҳ
        driver.findElement(By.id("kw")).sendKeys("JUnit"); //��������������"JUnit"
        driver.findElement(By.id("su")).click(); //������ٶ�һ�¡���ť
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe"); // chromedriver�����ַWebDriver driver = new ChromeDriver(); // �½�һ��WebDriver �Ķ��󣬵���new���ǹȸ������
        String url = "http://www.baidu.com";
        driver = new ChromeDriver(); // �½�һ�� WebDriver �Ķ��󣬵��� new ���ǹȸ������

        driver.get(url); // ��ָ������վ
        driver.navigate().to(url); // ��ָ������վ
        //����id��ѯ
        WebElement e1 = driver.findElement(By.id("s-top-left"));
        System.out.println(e1.getText());
        //����name��ѯ
        WebElement e2 = driver.findElement(By.name("wd"));
        System.out.println(e2.getTagName());
        //����link�����ֲ�ѯ
        WebElement e3 = driver.findElement(By.linkText("��ͼ"));
        System.out.println(e3.getText());
        List<WebElement> e4 = driver.findElements(By.partialLinkText("��"));
        for(WebElement e: e4){
            System.out.println(e.getText());
        }
        //���ݱ�ǩ��ѯ
        List<WebElement> e5 = driver.findElements(By.tagName("ul"));
        for(WebElement e: e5){
            System.out.println(e.getText());
        }
        //����class��ѯ
        System.out.println();
        List<WebElement> e6 = driver.findElements(By.className("hotsearch-item"));
        for(WebElement e: e6){
            System.out.println(e.getText());
        }

        //����xpath��ѯ
        WebElement e7 = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));

        System.out.println(e7.getText());
        WebElement e8 =
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[2]/input"));
        System.out.println(e8.getTagName());
        WebElement e9 =
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[2]/input/parent::*"));
        System.out.println(e9.getTagName());
        WebElement e10 = driver.findElement(By.xpath("//a[contains(text(), \'ѧ\')]"));
        System.out.println(e10.getText());
        //����css��ѯ
        WebElement e11 = driver.findElement(By.cssSelector("#s-top-left > a:nth-child(5)"));
        System.out.println(e11.getText());
        WebElement e12 = driver.findElement(By.cssSelector("#hotsearch-refresh-btn > span"));
        System.out.println(e12.getText());
    }
}


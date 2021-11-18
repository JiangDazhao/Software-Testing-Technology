import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe"); // chromedriver服务地址WebDriver driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new的是谷歌的驱动
        String url = "http://www.baidu.com";
        driver = new ChromeDriver(); // 新建一个 WebDriver 的对象，但是 new 的是谷歌的驱动

        driver.get(url); // 打开指定的网站
        driver.navigate().to(url); // 打开指定的网站
        //根据id查询
        WebElement e1 = driver.findElement(By.id("s-top-left"));
        System.out.println(e1.getText());
        //根据name查询
        WebElement e2 = driver.findElement(By.name("wd"));
        System.out.println(e2.getTagName());
        //根据link的文字查询
        WebElement e3 = driver.findElement(By.linkText("地图"));
        System.out.println(e3.getText());
        List<WebElement> e4 = driver.findElements(By.partialLinkText("地"));
        for(WebElement e: e4){
            System.out.println(e.getText());
        }
        //根据标签查询
        List<WebElement> e5 = driver.findElements(By.tagName("ul"));
        for(WebElement e: e5){
            System.out.println(e.getText());
        }
        //根据class查询
        System.out.println();
        List<WebElement> e6 = driver.findElements(By.className("hotsearch-item"));
        for(WebElement e: e6){
            System.out.println(e.getText());
        }

        //根据xpath查询
        WebElement e7 = driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));

        System.out.println(e7.getText());
        WebElement e8 =
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[2]/input"));
        System.out.println(e8.getTagName());
        WebElement e9 =
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div/form/span[2]/input/parent::*"));
        System.out.println(e9.getTagName());
        WebElement e10 = driver.findElement(By.xpath("//a[contains(text(), \'学\')]"));
        System.out.println(e10.getText());
        //根据css查询
        WebElement e11 = driver.findElement(By.cssSelector("#s-top-left > a:nth-child(5)"));
        System.out.println(e11.getText());
        WebElement e12 = driver.findElement(By.cssSelector("#hotsearch-refresh-btn > span"));
        System.out.println(e12.getText());
    }
}


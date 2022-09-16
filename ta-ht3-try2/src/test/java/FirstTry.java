import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTry {
    @Test
    public void test1(){
     WebDriverManager.chromedriver().setup();
    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-notifications");
    WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("https://avic.ua/");
    String s1 = "test";
            driver.findElement(By.xpath("//div[@class='header-bottom__right-icon']//i[@class='icon icon-cart-new']")).click();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
        Thread.sleep(15);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String s2 =driver.findElement(By.xpath("//div[@data-cart-name='modal']//b[contains(text(),'Кошик порожній!')]")).getText();
        System.out.println(s2 + "   s2");
        System.out.println(driver.getTitle());
        Assert.assertEquals(s2,"Кошик порожній!");
            driver.close();
            driver.quit();

}
}
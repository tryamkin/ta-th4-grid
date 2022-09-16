import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class TestOne {

    @Ignore
   public void Test1 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Java/project/GIT/testTA/src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver;
        //driver = new ChromeDriver(options);
       driver = new ChromeDriver();
        driver.get("http://google.com.ua");
        String title = driver.getTitle();
        driver.wait(50);
        driver.quit();
        System.out.println(title);

    }
}

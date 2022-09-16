package pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
               this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void implisityWait(long time){
       driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }
    public int getRandomItems() {
        int out = (int) (Math.random() * 10)-1 ;
        return out;
    }

}

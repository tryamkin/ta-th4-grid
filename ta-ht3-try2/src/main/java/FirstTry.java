import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTry {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://avic.ua");
        cartCounter(driver);
        driver.close();
        driver.quit();
    }

    private static void cartCounter(WebDriver driver) throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("//div[@class='active-cart-item js_cart_count']")).getAttribute("innerHTML")+ "  Empty Cart");
        driver.get("https://avic.ua/ua/naushniki-apple-airpods-with-charging-case-mv7n2-244460-item#");
        driver.findElement(By.xpath("//a[@class='main-btn main-btn--green main-btn--large']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='main-btn main-btn--orange']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='active-cart-item js_cart_count']")).getAttribute("innerHTML") + " 1 Item");
        driver.get("https://avic.ua/ua/naushniki-apple-airpods-with-charging-case-mv7n2-244460-item#");
        driver.findElement(By.xpath("//a[@class='main-btn main-btn--green main-btn--large']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='main-btn main-btn--orange']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='active-cart-item js_cart_count']")).getAttribute("innerHTML") + " 2 Item");
    }
}

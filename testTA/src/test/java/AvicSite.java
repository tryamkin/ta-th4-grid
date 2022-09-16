import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AvicSite {


    String menuFirstElements = "//div[@class='menu-lvl second-level next-level js_next-level']";
    String menuItems = "//*[@class='sidebar-item']";
    String pathShort = "src/main/resources/chromedriver.exe";
    String path = "C:/Java/WebDriver/chromedriver.exe";
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menuItems)));


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", pathShort);
    }

    @BeforeMethod
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

 //   @Test
    public void checkUrlForSeachWord() {
        WebElement webElement = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("input_search")));
        driver.findElement(By.id("input_search")).sendKeys("Xiaomi");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Xiaomi"));

    }

  // @Test
    public void checkSearchElements() {
        driver.findElement(By.id("input_search")).sendKeys("Xiaomi");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='prod-cart__descr']"));
        System.out.println(Arrays.toString(webElementList.toArray()));
        int elementsSearch = webElementList.size();
        List<WebElement> products;
        products = driver.findElements(By.xpath("//div[@class='prod-cart__descr']"));
        for (int i = 0; i <products.size() ; i++) {
            System.out.println(products.get(i).getText());
        }
        System.out.println(elementsSearch);
        Assert.assertEquals(webElementList.size(), 12);
    }


   // @Test
    public void checkMenuMainElements() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> webElementList = driver.findElements(By.xpath(menuFirstElements));
        List<WebElement> webElementListItems = driver.findElements(By.xpath(menuItems));
        int elementsSearch = webElementList.size();
        System.out.println(Arrays.toString(webElementListItems.toArray()));
        for (int i = 0; i < webElementListItems.size() ; i++) {
            System.out.println(webElementListItems.get(i).getText());
        }
        Assert.assertEquals(webElementList.size(), 13);
    }

    @Test
    public void checkTitle() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getTitle().contains("AVIC"));
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.CartPage;
import pages.HomePage;
import pages.BasePage;
import pages.SearchResultPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private final String url = "https://avic.ua";

    @BeforeTest
    public void setupProfile() {
        chromedriver().setup();
    }
    @BeforeMethod
    public void setupTest()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }
    @AfterMethod
    public void quit() {
        driver.quit();
    }


    public WebDriver getDriver() {
        return driver;
    }
    public BasePage getMainPage (){
        return new HomePage(getDriver());
    }
    public HomePage getHomePage (){
        return new HomePage(getDriver());
    }
    public SearchResultPage getSearchResultPage(){
        return new SearchResultPage(getDriver());
    }
    public CartPage getCartPage(){ return new CartPage(getDriver());
    }




}

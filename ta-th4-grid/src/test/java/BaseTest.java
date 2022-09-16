import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.SearchPage;
import utils.CapabilitiesTA;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static ThreadLocal <RemoteWebDriver> driver = new ThreadLocal<>();
    private final String URL = "https://google.com.ua";
    private CapabilitiesTA capabilitiesTA = new CapabilitiesTA();

    @BeforeMethod
    @Parameters (value =  {"browserName "})
    public void setup(@Optional("chrome") String browserName) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.0.80:4444/wd/hub"),capabilitiesTA.getCapabilities(browserName)));
        getDriver().manage().window().maximize();
        getDriver().get(URL);

    }
    @AfterMethod
    public void quit() {
        getDriver().close();
    }

    @AfterClass
    public void terminate(){driver.remove();}
    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage (){ return new HomePage(getDriver()); }
    public SearchPage getSearchPage (){ return new SearchPage(getDriver());}

}

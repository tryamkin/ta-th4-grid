package utils;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CapabilitiesTA {

    private Capabilities capabilities;

    public Capabilities getCapabilities (String browserName){
        if (browserName.equals("chrome")) {
            capabilities = getChromeOptions();
        } else if (browserName.equals("firefox")) {
            capabilities = getFirefoxOptions();
        }
        return capabilities;
    }


    public static ChromeOptions getChromeOptions (){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-notifications");
        return chromeOptions;
    }

    public static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        FirefoxProfile profile=new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        firefoxOptions.setCapability(FirefoxDriver.PROFILE,profile);

        return firefoxOptions;
    }



}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//button[@id='W0wltc']")
    private WebElement close_aggriment ;



    public void closeAgriment (){
        close_aggriment.click();
    }
}

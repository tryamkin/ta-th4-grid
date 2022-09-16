package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy (xpath = "//input[@id='input_search']")
    private WebElement searchField;
    @FindBy( xpath ="//button[@type='submit']//i[@class='icon icon-search']" )
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchItems (String stringForSearch){
      searchField.sendKeys(stringForSearch);
      searchButton.click();
    }

}

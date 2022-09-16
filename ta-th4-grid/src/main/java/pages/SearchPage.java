package pages;

import com.google.common.base.CharMatcher;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@name='q']")
   private WebElement search_field;
    @FindBy (xpath = "//div[@id='result-stats']")
   private WebElement resultStats;



    public void search (String str){
        search_field.sendKeys(str);
        search_field.sendKeys(Keys.ENTER);
    }

    public String setResultStats() {
        String result = resultStats.getText();
       return result;
    }

    public long getCountResult(){
     String getResultStats = setResultStats();
      String strToLong = CharMatcher.DIGIT.retainFrom(getResultStats);
        long total = Long.parseLong(strToLong);
     return total;
    }
}

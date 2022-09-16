package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchResultPage extends BasePage {
   // private static final String searchResult = "//div[@class='prod-cart__descr']";

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResult;
    @FindBy (xpath = "//label[@for='fltr-1']")
    private WebElement filterActualItems;
    @FindBy(xpath = "//a[normalize-space()>'49']")
    private WebElement amountOfItemFiltered;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public  List<WebElement>  searcResultList (){
        return searchResult;
    }

    public int sizeOfsearcResultList(){
       return searcResultList().size();
    }

    public int  amountOfItemsTry( ){
        return Integer.parseInt(amountOfItemFiltered.getText());

    }

    public void checkActualsItems(){
        filterActualItems.click();
    }
}

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    private static final String stringForSearch = "Xiaomi";
    private static final String expectdText = "Xiaomi";
    private static final int totalFoundElemets = 12;

    @Test
    public void searchResultTest (){
        getHomePage().searchItems(stringForSearch);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(expectdText));
    }

    @Test
    public void searchResultElemetsCount (){
        getHomePage().searchItems(stringForSearch);
        getHomePage().implisityWait(5);
        Assert.assertEquals(getSearchResultPage().sizeOfsearcResultList(),totalFoundElemets);
    }
    @Test
    public void verifySearchResult(){
        getHomePage().searchItems(stringForSearch);
       getHomePage().implisityWait(5);
        for (WebElement webElement: getSearchResultPage().searcResultList()) {
           System.out.println(webElement.getText());
            Reporter.log(webElement.getText());
            Assert.assertTrue(webElement.getText().contains(expectdText),stringForSearch);
        }
    }

}

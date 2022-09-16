import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SingleTest extends BaseTest{

    private static final String stringForSearch = "Xiaomi";
    private static final String expectdText = "Xiaomi";
    private static final int  amountOfItemsExpected = 434;
    private static final int  amountOfItemsFilteredExpected = 99;


    @Test
    public void searchResultTest () throws IOException {
        getHomePage().searchItems(stringForSearch);
        for (int i = 0; i < getSearchResultPage().searcResultList().size() ; i++) {
            System.out.println(getSearchResultPage().searcResultList().get(i).getText());
            getMainPage().takeScreenshotAtEndOfTest();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(expectdText),stringForSearch);

    }
    }

    //todo Test filter for actual products
    @Test
    public void searcAmountItes (){
        getHomePage().searchItems(stringForSearch);
        getSearchResultPage().amountOfItemsTry();
        System.out.println(getSearchResultPage().amountOfItemsTry());
        Assert.assertEquals(getSearchResultPage().amountOfItemsTry(),amountOfItemsExpected);
        getSearchResultPage().checkActualsItems();
        System.out.println(getSearchResultPage().amountOfItemsTry());
        Assert.assertEquals(getSearchResultPage().amountOfItemsTry(), (amountOfItemsFilteredExpected));
        Assert.assertTrue(amountOfItemsExpected > getSearchResultPage().amountOfItemsTry());
        System.out.println(amountOfItemsExpected > getSearchResultPage().amountOfItemsTry());
    }

}

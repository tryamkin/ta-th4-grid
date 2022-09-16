import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {
    private static final String REQUEST = "Hello javva";
    private static final String SEARCH_RESULT_STATS = "Результатов: примерно ";

    @Test
    public void isSearch (){
        getHomePage().closeAgriment();
        getSearchPage().search(REQUEST);
        Assert.assertTrue(getSearchPage().setResultStats().contains(SEARCH_RESULT_STATS));
    }
    @Test
    public void searchNotEmpty () {
        isSearch();
        Assert.assertTrue(getSearchPage().getCountResult()>100000);


    }
}

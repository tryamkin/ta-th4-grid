
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest{

    private static final String TITLE = "Google";
    private static final String PAGE_URL = "https://www.google.com.ua/";


    @Test
    public void checkTitle (){
        getHomePage().closeAgriment();
        Assert.assertEquals( getDriver().getTitle(),TITLE);
    }


    @Test
    public void open() throws InterruptedException {
        getHomePage().closeAgriment();
        Assert.assertEquals(getDriver().getCurrentUrl(),PAGE_URL);

    }
}

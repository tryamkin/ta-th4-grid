
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    private static final String stringForSearch = "Xiaomi";
    private static final String cartExepted = "Кошик порожній!";
    private static int counter ;

    @Test
    public void addToCart() throws InterruptedException {
        counter = getMainPage().getRandomItems();
        getCartPage().mainCounCrt();
        getHomePage().searchItems(stringForSearch);
        getCartPage().addToCart();
        getCartPage().addAmountOfItemsInCart(counter);
        System.out.println(getCartPage().amountCounter());
        System.out.println(counter + "  counter");
        Assert.assertEquals(getCartPage().amountCounter(), counter);

    }

    @Test
    public void cartIsEmpty() throws InterruptedException {
        getCartPage().openCart();
        Thread.sleep(2000);
        System.out.println(getCartPage().emptyCart());
        Assert.assertEquals(getCartPage().emptyCart(), cartExepted);
    }

    @Test
    public void priceVStotalPrice() throws InterruptedException {
        addToCart();
        Thread.sleep(5000);
        getCartPage().itemPrice();
        getCartPage().totalPrice();
        System.out.println(getCartPage().itemPrice() + " item");
        System.out.println(getCartPage().totalPrice() + "  total");
        Assert.assertEquals(getCartPage().totalPrice(), getCartPage().itemPrice() * counter);
    }

}

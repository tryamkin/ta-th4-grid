package pages;

import com.google.common.base.CharMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//*[@class='active-cart-item js_cart_count']")
    private WebElement cartCount;
    @FindBy(xpath = "//div[@class='header-bottom__right-icon']//i[@class='icon icon-cart-new']")
    private WebElement openCart;
    @FindBy(xpath = "//input[@class='js-changeAmount count']")
    private WebElement amountCounter;
    @FindBy(xpath = "//*[@class='js_plus btn-count btn-count--plus ']")
    private  WebElement addBtnInCart;
    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement btnCloseCart;
    @FindBy(xpath = "//div[@data-cart-name='modal']//b[contains(text(),'Кошик порожній!')]")
    private WebElement emptyCart;
    @FindBy(xpath = "//span[contains(text(),'Код товару: 3 253440')]")
    private WebElement phone;
    @FindBy(xpath = "//*[@class='main-btn main-btn--green main-btn--large']")
    private WebElement buyButton;
    @FindBy(xpath = "//div[@class='total-h']//span[@class='prise']")
    private WebElement itemPrice;
    @FindBy(xpath = "//div[@class='item-total']//span[@class='prise']")
    private WebElement totalPrice;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public  void openCart() {
        implisityWait(2000);
        openCart.click();
        System.out.println(emptyCart.getText());
    }
    public String emptyCart () {
        String empty = emptyCart.getText();
        return empty ;
    }

    public String mainCounCrt(){
        String txt =  cartCount.getAttribute("value");
        return txt;
    }
    public void closeCart (){
        implisityWait(5);
        System.out.println("in cart");
      btnCloseCart.click();
    }

    public void addToCart (){
        phone.click();
        implisityWait(5000);
        buyButton.click();
    }

    public int amountCounter (){
        int s = Integer.parseInt(amountCounter.getAttribute("value"));
        return s;
    }

   public void  addAmountOfItemsInCart(int counter ) throws InterruptedException {
      int i =1;
      while (i != counter) {
          Thread.sleep(1000);
          addAmountOfItemsInCartClick();
          i++;
      }
   }

    public void  addAmountOfItemsInCartClick( ) {
        implisityWait(155);
        addBtnInCart.click();
    }

    public int itemPrice(){
        String itemstr = CharMatcher.DIGIT.retainFrom(itemPrice.getText());
        int item = Integer.parseInt(itemstr) ;
        return  item;
    }
    public int totalPrice(){
        String itemstr = CharMatcher.DIGIT.retainFrom(totalPrice.getText());
        int total = Integer.parseInt(itemstr) ;
        return  total;
    }

}



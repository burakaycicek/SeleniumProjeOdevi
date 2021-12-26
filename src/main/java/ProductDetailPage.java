import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.cssSelector("button[id='addBasket']"); //Sepete ekle
    By panthSizeLocator = By.xpath("//*[@class='m-variation__item'] [2]"); //beden numarası
    By cartLocator = By.xpath("//*[@title='Sepetim']");
    By productDetailPriceLocator = By.xpath("//*[@class='m-price__new']");
    String productPrice;


    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public void selectPanthSize() {
        click(panthSizeLocator);
    }


    public void addToCart() {
        //bedeni sec sonra sepete ekleye bas

        click(addToCartButtonLocator);
    }

    public void goToCart() {
        click(cartLocator);
    }

    public String productDetailPrice() {
        productPrice = find(productDetailPriceLocator).getText();
        return productPrice;
    }
}

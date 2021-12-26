import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {

    static String increasedComboBoxSelectedValue = "2 adet";

    By selectClassLocator = By.id("quantitySelect0");
    By deleteButtonLocator = By.cssSelector("button[id='removeCartItemBtn0']");
    By productCardPriceLocator = By.cssSelector("span[class='m-productPrice__salePrice']");
    By checkCardLocator = By.xpath("//*[@class='m-empty__messageTitle']");
    By selectedValueLocator = By.id("quantitySelect0");
    String productPriceLocator;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void selectAdded() {

        Select slc = new Select(driver.findElement(selectClassLocator));
        slc.selectByVisibleText(increasedComboBoxSelectedValue);
    }

    public String cardProductPrice() {
        productPriceLocator = find(productCardPriceLocator).getText();
        return productPriceLocator;
    }


    public void delete() {
        click(deleteButtonLocator);
    }

    public boolean isOnCartCheck() {
        return isDisplayed(checkCardLocator);
    }

    public String getSelectedComboBoxValue() {
        Select select = new Select(driver.findElement(selectedValueLocator));
        String wantedText = select.getFirstSelectedOption().getText();
        return wantedText;
    }


}

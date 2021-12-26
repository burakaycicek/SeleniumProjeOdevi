import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By buttonFilterLocator = By.id("productFilterOpenButton"); // pantolonu aradiktan sonra karsimiza cikan filtre butonu
    By productSizeLocator = By.className("m-productImageList__item");  //
    By down = By.cssSelector("svg[class='icon icon-cc']");
    By showMoreLocator = By.cssSelector("button[id='moreContentButton']");
   

    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public void pageDown(){
        scrollDown(down);
    }

    public void selectMore(){

        click(showMoreLocator);
    }


    public void selectProduct(int i) {
        //sectigim pantolonu sec
        getAllProducts().get(i).click();
    }

    public boolean isOnProductPage() {                //filtreler bu sayfadamiyiz kontrol et

        return isDisplayed(buttonFilterLocator);
    }

    private List<WebElement> getAllProducts(){  //bütün elementleri ara

        return findAll(productSizeLocator);
    }
}

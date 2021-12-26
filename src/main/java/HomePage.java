import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By homePageLocator = By.cssSelector("span[class='cap']");
    By accountLocator = By.xpath("//*[@title='Hesabım']");
    By loginButtonLocator = By.cssSelector("button[id='loginBtn']");
    By myFavoritesLocator = By.xpath("//*[@title='Favorilerim']");
    By myCartLocator = By.xpath("//*[@title='Sepetim']");
    By svgFavoritesLocator = By.cssSelector("svg[class='icon icon-favorite-no-result']");
    By keepShoppingLocator = By.cssSelector("a[title='Alışverişe Devam Et']");
    By goToHomeLocator = By.cssSelector("img[class='o-header__logo--img']");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public void goMyAccount() {
        click(accountLocator);
    }

    public void goMyFavorites() {
        click(myFavoritesLocator);
    }

    public void goMyCart() {
        click(myCartLocator);
    }

    public void homeGo() {
        click(goToHomeLocator);
    }

    public boolean isOnProductMyAccount() {
        return isDisplayed(loginButtonLocator);
    }

    public boolean isOnProductMyFavorites() {
        return isDisplayed(svgFavoritesLocator);
    }

    public boolean isOnProductMyCart() {
        return isDisplayed(keepShoppingLocator);
    }

    public boolean isOnHomeBeymen() {
        return isDisplayed(homePageLocator);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {   // Diğer sayfalar basepage extends edecek buranın methodlarını kullanabiliriz kod tekrarını engelliyor

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    public void click(By locator) {    //tiklama

        find(locator).click();
    }

    public void type(By locator, String text) {   //elementi bulduktan sonra oraya bir sey yazsın

        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator) {     //görünüp görünmedigi ?

        return find(locator).isDisplayed();
    }

    public void scrollDown(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", find(locator));

    }


}

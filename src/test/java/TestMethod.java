import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMethod extends BaseTest {

    static int defaultSleepTime = 1000;


    @Test
    public void completeTest() throws InterruptedException {
        homePage.goMyAccount();
        Assertions.assertTrue(homePage.isOnProductMyAccount(),
                "Not on Product My Account");
        Thread.sleep(defaultSleepTime);

        homePage.goMyFavorites();
        Assertions.assertTrue(homePage.isOnProductMyFavorites(),
                "Not Product My Favorites");
        Thread.sleep(defaultSleepTime);

        homePage.goMyCart();
        Assertions.assertTrue(homePage.isOnProductMyCart(),
                "Not Product My Cart");
        Thread.sleep(defaultSleepTime);

        homePage.homeGo();
        Thread.sleep(defaultSleepTime);

        homePage.searchBox().search("Pantolon");
        Thread.sleep(defaultSleepTime);
        productsPage.pageDown();
        Thread.sleep(defaultSleepTime);
        productsPage.selectMore();
        Thread.sleep(defaultSleepTime);
        productsPage.selectProduct(25);
        Thread.sleep(defaultSleepTime);

        productDetailPage.selectPanthSize();
        Thread.sleep(defaultSleepTime);
        productDetailPage.addToCart();
        Thread.sleep(defaultSleepTime);
        productDetailPage.productDetailPrice();
        productDetailPage.goToCart();
        Thread.sleep(defaultSleepTime);

        cartPage.cardProductPrice();
        Assertions.assertEquals(productDetailPage.productPrice, cartPage.productPriceLocator, "product's price is not equal in page and cart");
        cartPage.selectAdded();
        Thread.sleep(defaultSleepTime);
        Assertions.assertEquals(cartPage.getSelectedComboBoxValue(), CartPage.increasedComboBoxSelectedValue);
        cartPage.delete();
        Assertions.assertTrue(cartPage.isOnCartCheck(),
                "Card is Not Empty");
        Thread.sleep(defaultSleepTime);

    }

}

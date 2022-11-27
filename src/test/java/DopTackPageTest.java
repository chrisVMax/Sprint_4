import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DopTackPageTest {
    private WebDriver driver;

    @Test
    public void DopTackScooter() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        DopTackPage dopTackPage = new DopTackPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        dopTackPage.scooterClick();
        assertEquals(mainPage.site, orderPage.currentUrl());
    }


    @Test
    public void DopTackYandex() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        DopTackPage dopTackPage = new DopTackPage(driver);
        mainPage.openSite();
        orderPage.clickOrderButton();
        dopTackPage.yandexClick();
        assertNotEquals(mainPage.site, orderPage.currentUrl());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

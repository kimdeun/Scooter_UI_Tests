import org.openqa.selenium.JavascriptExecutor;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.scooter.pageobject.HomePageScooter;

import static org.junit.Assert.assertEquals;

public class FrequentlyAskedQuestionsTests extends BaseTest {
    HomePageScooter homePage;

    @Override
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/WebDriver/bin/chromedriver.exe");
        driver.get("https://qa-scooter.praktikum-services.ru/");

        homePage = new HomePageScooter(driver);
        WebElement element = driver.findElement(homePage.getNameOfDropDownListNum1());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        new WebDriverWait(driver, 5);
    }

    @Test
    public void test1() {
        String actual = homePage.checkContentOfDropDownListNum1();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String actual = homePage.checkContentOfDropDownListNum2();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String actual = homePage.checkContentOfDropDownListNum3();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String actual = homePage.checkContentOfDropDownListNum4();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String actual = homePage.checkContentOfDropDownListNum5();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String actual = homePage.checkContentOfDropDownListNum6();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String actual = homePage.checkContentOfDropDownListNum7();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String actual = homePage.checkContentOfDropDownListNum8();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, actual);
    }

}

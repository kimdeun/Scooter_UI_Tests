import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.scooter.pageobject.HomePageScooter;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FrequentlyAskedQuestionsTests extends BaseTest{
    HomePageScooter homePage;
    String answer;
    public  FrequentlyAskedQuestionsTests(String answer) {
        this.answer = answer;
    }
    @Parameterized.Parameters
    public static Object[][] allAnswers() {
        return new Object[][] {
                {"Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"Да, обязательно. Всем самокатов! И Москве, и Московской области."}
        };
    }

    @Override
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","D:/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        homePage = new HomePageScooter(driver);
        WebElement element = driver.findElement(homePage.getNameOfDropDownListNum1());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void test1() {
       if (answer == "Сутки — 400 рублей. Оплата курьеру — наличными или картой.") {
           assertEquals(homePage.checkContentOfDropDownListNum1(), answer);
       } else if (answer == "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.") {
           assertEquals(homePage.checkContentOfDropDownListNum2(), answer);
       } else if (answer == "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.") {
           assertEquals(homePage.checkContentOfDropDownListNum3(), answer);
       } else if (answer == "Только начиная с завтрашнего дня. Но скоро станем расторопнее.") {
           assertEquals(homePage.checkContentOfDropDownListNum4(), answer);
       } else if (answer == "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.") {
           assertEquals(homePage.checkContentOfDropDownListNum5(), answer);
       } else if (answer == "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.") {
           assertEquals(homePage.checkContentOfDropDownListNum6(), answer);
       } else if (answer == "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.") {
           assertEquals(homePage.checkContentOfDropDownListNum7(), answer);
       } else if (answer == "Да, обязательно. Всем самокатов! И Москве, и Московской области.") {
           assertEquals(homePage.checkContentOfDropDownListNum8(), answer);
       }
    }
}

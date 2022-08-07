import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver = new ChromeDriver();;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","D:/WebDriver/bin/chromedriver.exe");
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

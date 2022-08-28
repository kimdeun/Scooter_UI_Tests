import org.openqa.selenium.JavascriptExecutor;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import ru.yandex.scooter.pageobject.OrderPageScooter;
import static org.junit.Assert.*;


public class OrderPageTests extends BaseTest{
    OrderPageScooter orderPage = new OrderPageScooter(driver);

    @Test
    public void test9() {
        String actual = orderPage.positiveTesting1();
        String expected = "Заказ оформлен";
        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        WebElement element = driver.findElement(orderPage.getOrderButtonOnBot());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        String actual = orderPage.positiveTesting2();
        String expected = "Заказ оформлен";
        assertEquals(expected, actual);
    }
}

package ru.yandex.scooter.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageScooter {
    private WebDriver driver;
//    Нужно написать тесты с разными данными: минимум два набора.
    //1 сценарий. Кнопка заказа сверху
    //Кнопка "Заказать" наверху
    private final By orderButtonOnTop = By.className("Button_Button__ra12g");
    //Кнопка "Заказать" внизу
//    private final By orderButtonOnBot = By.className("Button_Button__ra12g Button_UltraBig__UU3Lp");
//    private final By orderButtonOnBot = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    private final By orderButtonOnBot = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    //Поле "Имя"
    private final By nameField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Имя']");
    //Поле "Фамилия"
    private final By surnameField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Фамилия']");
    //Поле "Адрес"
    private final By addressField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Адрес: куда привезти заказ']");
    //Выпадающий список "Станция метро"
    private final By metroStationField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Станция метро']");
    private final By sokolnikiMetroStation = By.xpath(".//div[text()='Сокольники']/parent::button");
    private final By cherkizovskayaMetroStation = By.xpath(".//div[text()='Черкизовская']/parent::button");
    //Поле "Телефон"
    private final By phoneNumberField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private final By nextButton = By.xpath(".//div[@class='Order_Content__bmtHS']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Поле "Когда"
    private final By deliveryDateField = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='* Когда привезти самокат']");
    private final By deliveryDatePopoverNextMonthButton = By.xpath(".//div[@class='react-datepicker']/button[@aria-label='Next Month']");
    private final By deliveryDatePopoverCurrentDayOfTheMonthButton = By.xpath(".//div[@class='react-datepicker__week']/div[@tabindex='0']");
    private final By deliveryDatePopoverFirstDayOfTheMonthButton = By.xpath("(.//div[@class='react-datepicker__week'])[1]/div[text()='1']");
    //Поле "Срок"
    private final By rentalPeriod = By.xpath(".//div[@class='Dropdown-root']//div[@class='Dropdown-placeholder']");
    private final By rentalPeriodIs1Day = By.xpath(".//div[@class='Dropdown-root is-open']//div[text()='сутки']");
    private final By rentalPeriodIs2Days = By.xpath(".//div[@class='Dropdown-root is-open']//div[text()='двое суток']");
    //Поле "Цвет"
    private final By blackScooter = By.id("black");
    private final By greyScooter = By.id("grey");
    //Поле "Комментарий"
    private final By commentForCourier = By.xpath(".//div[@class='Order_Form__17u6u']//input[@placeholder='Комментарий для курьера']");
    //Кнопка "Заказать"
    private final By orderButtonInOrderForm = By.xpath(".//div[@class='Order_Content__bmtHS']//button[text()='Заказать']");
    //Кнопка "Да"
    private final By orderConfirmationButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[text()='Да']");
    //Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа. (в модалке - "Заказ оформлен")
    private final By checkStatusButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']//div[text()='Заказ оформлен']");


    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }


    public By getOrderButtonOnBot() {
        return orderButtonOnBot;
    }


    public void clickOrderButtonOnTop() {
        driver.findElement(orderButtonOnTop).click();
    }
    public void clickOrderButtonOnBot() {
        driver.findElement(orderButtonOnBot).click();
    }

    public void setName1() {
        driver.findElement(nameField).sendKeys("Дмитрий");
    }
    public void setName2() {
        driver.findElement(nameField).sendKeys("Шакира");
    }

    public void setSurname1() {
        driver.findElement(surnameField).sendKeys("Ким");
    }
    public void setSurname2() {
        driver.findElement(surnameField).sendKeys("Риполь");
    }

    public void setAddress1() {
        driver.findElement(addressField).sendKeys("Пр Мира 195");
    }
    public void setAddress2() {
        driver.findElement(addressField).sendKeys("Ленина 312");
    }

    public void setMetroStation1() {
        driver.findElement(metroStationField).click();
        driver.findElement(sokolnikiMetroStation).click();
    }
    public void setMetroStation2() {
        driver.findElement(metroStationField).click();
        driver.findElement(cherkizovskayaMetroStation).click();
    }

    public void setPhoneNumber1() {
        driver.findElement(phoneNumberField).sendKeys("89991232323");
    }
    public void setPhoneNumber2() {
        driver.findElement(phoneNumberField).sendKeys("89999878787");
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void selectingTheCurrentDay() {
        driver.findElement(deliveryDateField).click();
        driver.findElement(deliveryDatePopoverCurrentDayOfTheMonthButton).click();
    }
    public void selectingTheFirstDayOfNextMonth() {
        driver.findElement(deliveryDateField).click();
        driver.findElement(deliveryDatePopoverNextMonthButton).click();
        driver.findElement(deliveryDatePopoverFirstDayOfTheMonthButton).click();
    }

    public void set1DayRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodIs1Day).click();
    }
    public void set2DaysRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodIs2Days).click();
    }

    public void selectingBlackScooter() {
        driver.findElement(blackScooter).click();
    }
    public void selectingGreyScooter() {
        driver.findElement(greyScooter).click();
    }

    public void commentForCourier1() {
        driver.findElement(commentForCourier).sendKeys("Позвонить по приезду");
    }
    public void commentForCourier2() {
        driver.findElement(commentForCourier).sendKeys("Оставьте ближе к подъезду");
    }

    public void clickOrderButtonInForm() {
        driver.findElement(orderButtonInOrderForm).click();
    }

    public void clickConfirmationButton() {
        driver.findElement(orderConfirmationButton).click();
    }

    public String getConfirmationText() {
        return driver.findElement(checkStatusButton).getText();
    }


    //Позитивный сценарий №1
    public String positiveTesting1() {
        clickOrderButtonOnTop();
        setName1();
        setSurname1();
        setAddress1();
        setMetroStation1();
        setPhoneNumber1();
        clickNextButton();
        selectingTheCurrentDay();
        set1DayRentalPeriod();
        selectingBlackScooter();
        commentForCourier1();
        clickOrderButtonInForm();
        clickConfirmationButton();
        return getConfirmationText();
    }
    //Позитивный сценарий №2
    public String positiveTesting2() {
        clickOrderButtonOnBot();
        setName2();
        setSurname2();
        setAddress2();
        setMetroStation2();
        setPhoneNumber2();
        clickNextButton();
        selectingTheFirstDayOfNextMonth();
        set2DaysRentalPeriod();
        selectingGreyScooter();
        commentForCourier2();
        clickOrderButtonInForm();
        clickConfirmationButton();
        return getConfirmationText();
    }
}

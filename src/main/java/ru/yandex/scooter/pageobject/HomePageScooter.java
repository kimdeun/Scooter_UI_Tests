package ru.yandex.scooter.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HomePageScooter {
    private WebDriver driver;

    //кнопка каждого выпадающего списка
    private final By dropDownListNum1 = By.id("accordion__heading-0");
    private final By dropDownListNum2 = By.id("accordion__heading-1");
    private final By dropDownListNum3 = By.id("accordion__heading-2");
    private final By dropDownListNum4 = By.id("accordion__heading-3");
    private final By dropDownListNum5 = By.id("accordion__heading-4");
    private final By dropDownListNum6 = By.id("accordion__heading-5");
    private final By dropDownListNum7 = By.id("accordion__heading-6");
    private final By dropDownListNum8 = By.id("accordion__heading-7");
    private final By linkImgScooterPage = By.xpath(".//img[@src='/assets/scooter.svg']/parent::a");
    private final By linkImgYandexPage = By.xpath(".//div[@class='Header_Logo__23yGT']/a[@href='//yandex.ru']");


    private final By contentOfDropDownNum1 = By.xpath(".//div[@id='accordion__panel-0']/p");
    private final By contentOfDropDownNum2 = By.xpath(".//div[@id='accordion__panel-1']/p");
    private final By contentOfDropDownNum3 = By.xpath(".//div[@id='accordion__panel-2']/p");
    private final By contentOfDropDownNum4 = By.xpath(".//div[@id='accordion__panel-3']/p");
    private final By contentOfDropDownNum5 = By.xpath(".//div[@id='accordion__panel-4']/p");
    private final By contentOfDropDownNum6 = By.xpath(".//div[@id='accordion__panel-5']/p");
    private final By contentOfDropDownNum7 = By.xpath(".//div[@id='accordion__panel-6']/p");
    private final By contentOfDropDownNum8 = By.xpath(".//div[@id='accordion__panel-7']/p");


    //Метод для скролла до выпадающих списков
    public By getNameOfDropDownListNum1() {
        return dropDownListNum1;
    }


    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }


    //Методы для клика на выпадающий список
    public void clickDropDownListNum1() {
        driver.findElement(dropDownListNum1).click();
    }

    public void clickDropDownListNum2() {
        driver.findElement(dropDownListNum2).click();
    }

    public void clickDropDownListNum3() {
        driver.findElement(dropDownListNum3).click();
    }

    public void clickDropDownListNum4() {
        driver.findElement(dropDownListNum4).click();
    }

    public void clickDropDownListNum5() {
        driver.findElement(dropDownListNum5).click();
    }

    public void clickDropDownListNum6() {
        driver.findElement(dropDownListNum6).click();
    }

    public void clickDropDownListNum7() {
        driver.findElement(dropDownListNum7).click();
    }

    public void clickDropDownListNum8() {
        driver.findElement(dropDownListNum8).click();
    }

    //Клик на логотип Яндекс и Самоката
    public void clickScooterLogo() {
        driver.findElement(linkImgScooterPage).click();
    }

    public void clickYandexLogo() {
        driver.findElement(linkImgYandexPage).click();
    }


    //Методы для получения содержимого выпадающих списков
    public String getContentOfDropDownListNum1() {
        return driver.findElement(contentOfDropDownNum1).getText();
    }

    public String getContentOfDropDownListNum2() {
        return driver.findElement(contentOfDropDownNum2).getText();
    }

    public String getContentOfDropDownListNum3() {
        return driver.findElement(contentOfDropDownNum3).getText();
    }

    public String getContentOfDropDownListNum4() {
        return driver.findElement(contentOfDropDownNum4).getText();
    }

    public String getContentOfDropDownListNum5() {
        return driver.findElement(contentOfDropDownNum5).getText();
    }

    public String getContentOfDropDownListNum6() {
        return driver.findElement(contentOfDropDownNum6).getText();
    }

    public String getContentOfDropDownListNum7() {
        return driver.findElement(contentOfDropDownNum7).getText();
    }

    public String getContentOfDropDownListNum8() {
        return driver.findElement(contentOfDropDownNum8).getText();
    }

    //Метод для получения текста ссылки текущей страницы
    public String getLink() {
        return driver.getCurrentUrl();
    }


    //Методы для клика по списку + получения текста
    public String checkContentOfDropDownListNum1() {
        clickDropDownListNum1();
        return getContentOfDropDownListNum1();
    }

    public String checkContentOfDropDownListNum2() {
        clickDropDownListNum2();
        return getContentOfDropDownListNum2();
    }

    public String checkContentOfDropDownListNum3() {
        clickDropDownListNum3();
        return getContentOfDropDownListNum3();
    }

    public String checkContentOfDropDownListNum4() {
        clickDropDownListNum4();
        return getContentOfDropDownListNum4();
    }

    public String checkContentOfDropDownListNum5() {
        clickDropDownListNum5();
        return getContentOfDropDownListNum5();
    }

    public String checkContentOfDropDownListNum6() {
        clickDropDownListNum6();
        return getContentOfDropDownListNum6();
    }

    public String checkContentOfDropDownListNum7() {
        clickDropDownListNum7();
        return getContentOfDropDownListNum7();
    }

    public String checkContentOfDropDownListNum8() {
        clickDropDownListNum8();
        return getContentOfDropDownListNum8();
    }

    public void switchTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    //Методы для проверки ссылки на страницу Яндекса и Скутер на главной странице
    public String getScooterLink() {
        clickScooterLogo();
        return getLink();
    }

    public String getYandexLink() {
        clickYandexLogo();
        switchTab();
        return getLink();
    }
}

package by.itacademy.piotr.ropot.demomobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MobileTest {

    //@BeforeEach

    @Test
    public void testMobile() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(MobilePage.URL);

        WebElement BTN_ADD_CONSENT_ELEMENT = driver.findElement(By.xpath(MobilePage.BTN_ADD_CONSENT));
        BTN_ADD_CONSENT_ELEMENT.click();

        WebElement BTN_ACCAUNT_OPEN = driver.findElement(By.xpath(MobilePage.BTN_ACCAUNT));
        BTN_ACCAUNT_OPEN.click();

        WebElement INPUT_EMAIL_ID = driver.findElement(By.xpath(MobilePage.INPUT_EMAIL));
        INPUT_EMAIL_ID.sendKeys("Ropot.piotr@gmail.com");

        WebElement INPUT_PASSWORD_ID = driver.findElement(By.xpath(MobilePage.INPUT_PASSWORD));
        INPUT_PASSWORD_ID.sendKeys("MinskBelarus123");

        WebElement BTN_REGISTER_ADD = driver.findElement(By.xpath(MobilePage.BTN_REGISTER));
        BTN_REGISTER_ADD.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement INPUT_PASSWORD_ID_NEW = driver.findElement(By.xpath(MobilePage.INPUT_PASSWORD));
        INPUT_PASSWORD_ID_NEW.sendKeys("MinskBelarus123");

        WebElement BTN_REGISTER_ADD_NEW = driver.findElement(By.xpath(MobilePage.BTN_REGISTER));
        BTN_REGISTER_ADD_NEW.click();

        WebElement BTN_MAIN_ELEMENT = driver.findElement(By.xpath(MobilePage.BTN_MEIN));

        BTN_MAIN_ELEMENT.click();

        WebElement BTN_MY_MAIN_ELEMENT = driver.findElement(By.xpath(MobilePage.BTN_MY_MAIN));
        BTN_MY_MAIN_ELEMENT.click();

        WebElement TXT_MY_ACCAUNT_ELEMENT = driver.findElement(By.xpath(MobilePage.TXT_MY_ACCAUNT));
        Assertions.assertEquals(TXT_MY_ACCAUNT_ELEMENT.getText(), "Ropot.piotr");

        WebElement LOGO_LANGUAGE_ELEMENT = driver.findElement(By.xpath(MobilePage.LOGO_LANGUAGE));
        LOGO_LANGUAGE_ELEMENT.click();

        WebElement LOGO_LANGUAGE_RUS_ELEMENT = driver.findElement(By.xpath(MobilePage.LOGO_LANGUAGE_RUS));
        LOGO_LANGUAGE_RUS_ELEMENT.click();

        WebElement BTN_BRAND_ADD = driver.findElement(By.xpath(MobilePage.BTN_BRAND));
        BTN_BRAND_ADD.click();

        WebElement BTN_BRAND_BMW_ADD = driver.findElement(By.xpath(MobilePage.BTN_BRAND_BMW));
        BTN_BRAND_BMW_ADD.click();

        WebElement BTN_MODEL_ADD = driver.findElement(By.xpath(MobilePage.BTN_MODEL));
        BTN_MODEL_ADD.click();

        WebElement BTN_MODEL_BMW_ADD = driver.findElement(By.xpath(MobilePage.BTN_MODEL_BMW));
        BTN_MODEL_BMW_ADD.click();

        WebElement BTN_SELECT_ELEMENT = driver.findElement(By.xpath(MobilePage.BTN_SELECT));
        BTN_SELECT_ELEMENT.click();

        WebElement ELEMENT_SELECT_ADD = driver.findElement(By.xpath(MobilePage.ELEMENT_SELECT));
        ELEMENT_SELECT_ADD.click();

        WebElement BTN_PARKING_ADD = driver.findElement(By.xpath(MobilePage.BTN_PARKING));
        BTN_PARKING_ADD.click();

        WebElement BTN_MY_PARKING_ADD = driver.findElement(By.xpath(MobilePage.BTN_MY_PARKING));
        BTN_MY_PARKING_ADD.click();

        //@AfterEach
        driver.quit();
    }

}
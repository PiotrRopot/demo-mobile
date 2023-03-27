package by.itacademy.piotr.ropot.demomobile;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MobileLoginTest {
    WebDriver driver;

    @Test
    public void testLoginCorrect() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(MobileLoginPage.URL);

        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(MobileLoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(MobileLoginPage.INPUT_EMAIL)).sendKeys("Ropot.piotr@gmail.com");
        driver.findElement(By.xpath(MobileLoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(MobileLoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath(MobileLoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(MobileLoginPage.BTN_REGISTER)).click();
        driver.quit();
    }

    @Test
    public void testLoginIncorrectEmail() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(MobileLoginPage.URL);

        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(MobileLoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(MobileLoginPage.INPUT_EMAIL)).sendKeys("R@gmail.com");
        driver.findElement(By.xpath(MobileLoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(MobileLoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assertions.assertEquals("Hallo! Willkommen zurück!", driver.findElement(By.xpath(MobileLoginPage.REPEAT_LOGIN)).getText());
        driver.quit();
    }

    @Test
    public void testLoginWithoutEmail() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(MobileLoginPage.URL);

        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(MobileLoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(MobileLoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(MobileLoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assertions.assertEquals("Hallo! Willkommen zurück!", driver.findElement(By.xpath(MobileLoginPage.REPEAT_LOGIN)).getText());
        driver.quit();
    }

}



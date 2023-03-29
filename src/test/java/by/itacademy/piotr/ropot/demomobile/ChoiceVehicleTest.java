package by.itacademy.piotr.ropot.demomobile;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChoiceVehicleTest {
    WebDriver driver;

    @BeforeEach
    public void OpenMobile() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(ChoiceVehiclePage.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void testChoiceVehicle() {

        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();
    }

    @Test
    public void testFindElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();

        driver.findElement(By.xpath(ChoiceVehiclePage.ELEMENT));
        Assertions.assertTrue((driver.findElements(By.xpath(ChoiceVehiclePage.ELEMENT))).size() >= 1);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

package by.itacademy.piotr.ropot.demomobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChoiceVehicleTest {

    @Test
    public void testChoiceVehicle() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(ChoiceVehiclePage.URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();

        driver.quit();
    }

    @Test
    public void testFindElement() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(ChoiceVehiclePage.URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(MobileLoginPage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();

        driver.findElement(By.xpath(ChoiceVehiclePage.T));
        Assertions.assertTrue((driver.findElements(By.xpath(ChoiceVehiclePage.T))).size() >= 1);
        {
            driver.quit();
        }
    }
}

package ru.tesoft.calculator.integration;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by Konstantin on 08.02.2016.
 */

public class CalculatorBeanIT {

    static Logger logger = Logger.getLogger(CalculatorBeanIT.class);
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void test2Plus3(){
        logger.debug("testAddition");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement knopka2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        knopka2.click();

        // Find the "Button +" element by it's id="btn+":
        WebElement knopkaPlus = driver.findElement(By.id("btn+"));
        knopkaPlus.click();

        // Find the "Button 3" element by it's id="btn3":
        WebElement knopka3 = driver.findElement(By.id("btn3"));
        knopka3.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement knopkaRavno = driver.findElement(By.id("btn="));
        knopkaRavno.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        try {
            // Compare expected and actual results:
            assertEquals("5", displayText);

            // Let the user actually see something:
            Thread.sleep(3500);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Close the browser
            driver.quit();
        }
    }
}

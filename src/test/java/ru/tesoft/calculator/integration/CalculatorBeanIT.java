package ru.tesoft.calculator.integration;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tesoft.util.Util;

import static org.junit.Assert.assertEquals;

/**
 * Created by Konstantin on 08.02.2016.
 */

public class CalculatorBeanIT {

    static Logger logger = Logger.getLogger(CalculatorBeanIT.class);
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", Util.getCurrentProjectPath() + "/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test2Plus3() {
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

        // Compare expected and actual results:
        assertEquals("5", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();
    }

    @Test
    public void test2Times3() {
        logger.debug("testAddition");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        button2.click();

        // Find the "Button X" element by it's id="btn*":
        WebElement buttonX = driver.findElement(By.id("btn*"));
        buttonX.click();

        // Find the "Button 3" element by it's id="btn3":
        WebElement button3 = driver.findElement(By.id("btn3"));
        button3.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("6", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();
    }

    @Test
    public void test10Divide2() {
        logger.debug("testAddition");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 1" element by it's id="btn1":
        WebElement button1 = driver.findElement(By.id("btn1"));
        // Click the "Button 1":
        button1.click();

        // Find the "Button 0" element by it's id="btn0":
        WebElement button0 = driver.findElement(By.id("btn0"));
        button0.click();

        // Find the "Button divide" element by it's id="btn/":
        WebElement buttonDivide = driver.findElement(By.id("btn/"));
        buttonDivide.click();

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        button2.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("5", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();
    }

    @Test
    public void test8Minus3() {
        logger.debug("testAddition");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 8" element by it's id="btn8":
        WebElement button8 = driver.findElement(By.id("btn8"));
        // Click the "Button 8":
        button8.click();

        // Find the "Button minus" element by it's id="btn-":
        WebElement buttonMinus = driver.findElement(By.id("btn-"));
        buttonMinus.click();

        // Find the "Button 3" element by it's id="btn3":
        WebElement button3 = driver.findElement(By.id("btn3"));
        button3.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("5", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();
    }


    @Test
    public void test2Dot5Plus3Dot7() {
        logger.debug("testLogin");

       // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        button2.click();

        // Find the "Button dot" element by it's id="btn,":
        WebElement buttonDot = driver.findElement(By.id("btn,"));
        buttonDot.click();

        // Find the "Button Plus" element by it's id="btn+":
        WebElement buttonPlus = driver.findElement(By.id("btn+"));
        buttonPlus.click();

        // Find the "Button 3" element by it's id="btn3":
        WebElement button3 = driver.findElement(By.id("btn3"));
        button3.click();

        // Find the "Button dot" element by it's id="btn,":
        buttonDot.click();

        // Find the "Button 7" element by it's id="btn7":
        WebElement button7 = driver.findElement(By.id("btn7"));
        button7.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();


        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("6.2", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }


    @Test
    public void test2Divide0() {
        logger.debug("testLogin");

       // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        button2.click();

        // Find the "Button Divide" element by it's id="btn/":
        WebElement buttonDivide = driver.findElement(By.id("btn/"));
        buttonDivide.click();

        // Find the "Button 0" element by it's id="btn0":
        WebElement button0 = driver.findElement(By.id("btn0"));
        button0.click();

       // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("Infinity", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }


    @Test
    public void test2Clear0() {
        logger.debug("testLogin");

       // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        button2.click();

        // Find the "Button Clear" element by it's id="btnc":
        WebElement buttonClear = driver.findElement(By.id("btnc"));
        buttonClear.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("0", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }


    @Test
    public void test0Plus0() {
        logger.debug("testLogin");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 0" element by it's id="btn0":
        WebElement button0 = driver.findElement(By.id("btn0"));
        // Click the "Button 0":
        button0.click();

        // Find the "Button Plus" element by it's id="btn+":
        WebElement buttonPlus = driver.findElement(By.id("btn+"));
        buttonPlus.click();

        // Find the "Button 0" element by it's id="btn0":
        button0.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("0", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }

        @Test
        public void test10Divide3() {
            logger.debug("testLogin");

            // Open Calculator application in Chrome Browser:
            driver.get("http://localhost:8080/Calculator");

            // Find the "Button 1" element by it's id="btn1":
            WebElement button1 = driver.findElement(By.id("btn1"));
            // Click the "Button 1":
            button1.click();

            // Find the "Button 0" element by it's id="btn0":
            WebElement button0 = driver.findElement(By.id("btn0"));
            // Click the "Button 0":
            button0.click();

            // Find the "Button Divide" element by it's id="btn/":
            WebElement buttonDivide = driver.findElement(By.id("btn/"));
            buttonDivide.click();

            // Find the "Button 3" element by it's id="btn3":
            WebElement button3 = driver.findElement(By.id("btn3"));
            button3.click();

            // Find the "Button =" element by it's id="btn=":
            WebElement buttonEquals = driver.findElement(By.id("btn="));
            buttonEquals.click();

            // Find the Input Text element by it's id="display":
            WebElement display = driver.findElement(By.id("display"));
            String displayText = display.getAttribute("value");

            // Compare expected and actual results:
            assertEquals("3.3333333333333335", displayText);

            // Let the user actually see something:
            Util.keepBrowserOpenFor3Seconds();

        }

    @Test
    public void test2546Plus3438() {
        logger.debug("testLogin");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 2" element by it's id="btn2":
        WebElement button2 = driver.findElement(By.id("btn2"));
        // Click the "Button 2":
        button2.click();

        // Find the "Button 5" element by it's id="btn5":
        WebElement button5 = driver.findElement(By.id("btn5"));
        // Click the "Button 5":
        button5.click();

        // Find the "Button 4" element by it's id="btn4":
        WebElement button4 = driver.findElement(By.id("btn4"));
        // Click the "Button 4":
        button4.click();

        // Find the "Button 6" element by it's id="btn6":
        WebElement button6 = driver.findElement(By.id("btn6"));
        // Click the "Button 6":
        button6.click();

       // Find the "Button Plus" element by it's id="btn+":
        WebElement buttonPlus = driver.findElement(By.id("btn+"));
        buttonPlus.click();

        // Find the "Button 3" element by it's id="btn3":
        WebElement button3 = driver.findElement(By.id("btn3"));
        button3.click();

        // Find the "Button 4" element by it's id="btn4":
        button4.click();

        // Find the "Button 3" element by it's id="btn3":
        button3.click();

        // Find the "Button 8" element by it's id="btn8":
        WebElement button8 = driver.findElement(By.id("btn8"));
        button8.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("5984", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }

    @Test
    public void test9Minus45() {
        logger.debug("testLogin");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 9" element by it's id="btn9":
        WebElement button9 = driver.findElement(By.id("btn9"));
        // Click the "Button 9":
        button9.click();

        // Find the "Button Minus" element by it's id="btn-":
        WebElement buttonMinus = driver.findElement(By.id("btn-"));
        // Click the "Button Minus":
        buttonMinus.click();

        // Find the "Button 4" element by it's id="btn4":
        WebElement button4 = driver.findElement(By.id("btn4"));
        // Click the "Button4":
        button4.click();

        // Find the "Button 5" element by it's id="btn5":
        WebElement button5 = driver.findElement(By.id("btn5"));
        // Click the "Button 5":
        button5.click();

       // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("-36", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }

    @Test
    public void test5Dot98Multiply1Dot65() {
        logger.debug("testLogin");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

        // Find the "Button 5" element by it's id="btn5":
        WebElement button5 = driver.findElement(By.id("btn5"));
        // Click the "Button 5":
        button5.click();

        // Find the "Button Dot" element by it's id="btn,":
        WebElement buttonDot = driver.findElement(By.id("btn,"));
        // Click the "Button Dot":
        buttonDot.click();

        // Find the "Button 9" element by it's id="btn9":
        WebElement button9 = driver.findElement(By.id("btn9"));
        // Click the "Button9":
        button9.click();

        // Find the "Button 8" element by it's id="btn8":
        WebElement button8 = driver.findElement(By.id("btn8"));
        // Click the "Button 8":
        button8.click();

        // Find the "Button Multiply" element by it's id="btn*":
        WebElement buttonMultiply = driver.findElement(By.id("btn*"));
        buttonMultiply.click();

        // Find the "Button 1" element by it's id="btn1":
        WebElement button1 = driver.findElement(By.id("btn1"));
        button1.click();

        // Find the "Button Dot2" element by it's id="btn,":
        WebElement buttonDot2 = driver.findElement(By.id("btn,"));
        // Click the "Button Dot2":
        buttonDot2.click();

        // Find the "Button 6" element by it's id="btn6":
        WebElement button6 = driver.findElement(By.id("btn6"));
        button6.click();

        // Find the "Button 5_2" element by it's id="btn5":
        WebElement button5_2 = driver.findElement(By.id("btn5"));
        button5_2.click();

        // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("9.867", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }


        @Test
    public void test1Minus1Dot7() {
        logger.debug("testLogin");

        // Open Calculator application in Chrome Browser:
        driver.get("http://localhost:8080/Calculator");

            // Find the "Button 1" element by it's id="btn1":
            WebElement button1 = driver.findElement(By.id("btn1"));
            // Click the "Button 1":
            button1.click();

            // Find the "Button Minus" element by it's id="btn-":
            WebElement buttonMinus = driver.findElement(By.id("btn-"));
            // Click the "Button Minus":
            buttonMinus.click();

            // Find the "Button 1" element by it's id="btn1":
            // Click the "Button 1":
            button1.click();

        // Find the "Button Dot" element by it's id="btn,":
        WebElement buttonDot = driver.findElement(By.id("btn,"));
        // Click the "Button Dot":
        buttonDot.click();

        // Find the "Button 7" element by it's id="btn7":
        WebElement button7 = driver.findElement(By.id("btn7"));
        // Click the "Button7":
        button7.click();

       // Find the "Button =" element by it's id="btn=":
        WebElement buttonEquals = driver.findElement(By.id("btn="));
        buttonEquals.click();

        // Find the Input Text element by it's id="display":
        WebElement display = driver.findElement(By.id("display"));
        String displayText = display.getAttribute("value");

        // Compare expected and actual results:
        assertEquals("-0.7", displayText);

        // Let the user actually see something:
        Util.keepBrowserOpenFor3Seconds();

    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
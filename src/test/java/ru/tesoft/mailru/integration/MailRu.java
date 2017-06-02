package ru.tesoft.mailru.integration;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tesoft.util.Util;

import static org.junit.Assert.assertEquals;

/**
 */

public class MailRu {

  static Logger logger = Logger.getLogger(MailRuIT.class);
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", Util.getCurrentProjectPath() + "/chromedriver.exe");
    driver = new ChromeDriver();
  }

  @Test
  public void testLogin() {
    logger.debug("testLogin");

    // Open mail.ru application in Chrome Browser:
    driver.get("http://mail.ru");

    // Find the "loginTextBox" element by it's id="mailbox__login":
    WebElement loginTextBox = driver.findElement(By.id("mailbox__login"));
    loginTextBox.sendKeys("selenium.webdriver");

    // Find the "passwordTextBox" element by it's id="mailbox__password":
    WebElement passwordTextBox = driver.findElement(By.id("mailbox__password"));
    passwordTextBox.sendKeys("Gaspu3aQ");

    // Find the "enterButton" element by it's id="mailbox__auth__button":
    WebElement enterButton = driver.findElement(By.id("mailbox__auth__button"));

    // Click the "enterButton":
    enterButton.click();

    // Find the "userEmail" element by it's id="PH_user-email":
    // To avoid stale element reference error, we need to wait until element is loaded first:
    Util.waitElementUntilPresent(By.id("PH_user-email"), driver);
    WebElement userEmail = driver.findElement(By.id("PH_user-email"));
    String displayText = userEmail.getText();

    // Compare expected and actual results:
    assertEquals("selenium.webdriver@mail.ru", displayText);

  }

  @Test
  public void testSendEmail() {
    logger.debug("testLogin");

    // Open mail.ru application in Chrome Browser:
    driver.get("http://mail.ru");

    // Find the "loginTextBox" element by it's id="mailbox__login":
    WebElement loginTextBox = driver.findElement(By.id("mailbox__login"));
    loginTextBox.sendKeys("selenium.webdriver");

    // Find the "passwordTextBox" element by it's id="mailbox__password":
    WebElement passwordTextBox = driver.findElement(By.id("mailbox__password"));
    passwordTextBox.sendKeys("Gaspu3aQ");

    // Find the "enterButton" element by it's id="mailbox__auth__button":
    WebElement enterButton = driver.findElement(By.id("mailbox__auth__button"));

    // Click the "enterButton":
    enterButton.click();

    // Find the "IncomingEmails" element by it's id="PH_user-email":
    // To avoid stale element reference error, we need to wait until element is loaded first:
    Util.waitElementUntilPresent(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[1]/a/span[2]"), driver);
    WebElement incomingEmails = driver.findElement(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[1]/a/span[2]"));
    String displayText = incomingEmails.getText();

    // Compare expected and actual results:
    assertEquals("Входящие", displayText);

    // Find the "SentEmails" element by it's id="PH_user-email":
    // To avoid stale element reference error, we need to wait until element is loaded first:
    Util.waitElementUntilPresent(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[2]/a/span"), driver);
    WebElement sentEmails = driver.findElement(By.xpath("//*[@id=\"b-nav_folders\"]/div/div[2]/a/span"));
    displayText = sentEmails.getText();

    // Compare expected and actual results:
    assertEquals("Отправленные", displayText);

   // Find the "WriteEmails" element by it's id="PH_user-email":
    // To avoid stale element reference error, we need to wait until element is loaded first:
    Util.waitElementUntilPresent(By.xpath("//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span"), driver);
    WebElement writeEmails = driver.findElement(By.xpath("//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span"));
    displayText = writeEmails.getText();

       // Compare expected and actual results:
    assertEquals("Написать письмо", displayText);

    // Click the "enterButton":
    writeEmails.click();

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }


}

package services;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Page extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled2() throws Exception {
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "/services/magento_site_from_scratch.html");
    assertEquals("Magento Site from Scratch", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("MAGENTO SITE FROM SCRATCH", driver.findElement(By.cssSelector("li.active > span")).getText());
    assertEquals("MAGENTO DESIGN", driver.findElement(By.xpath("(//a[contains(text(),'Magento Design')])[2]")).getText());
    assertEquals("PSD TO MAGENTO", driver.findElement(By.xpath("(//a[contains(text(),'PSD to Magento')])[2]")).getText());
    assertEquals("MAGENTO DEVELOPMENT", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(4) > a")).getText());
    assertEquals("MIGRATION TO MAGENTO", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(5) > a")).getText());
    assertEquals("MIGRATION TO MAGENTO 2", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(6) > a")).getText());
    assertEquals("RESPONSIVE MOBILE DEVELOPMENT", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(7) > a")).getText());
    assertEquals("MAGENTO PERFORMANCE OPTIMIZATION", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(8) > a")).getText());
    assertEquals("MAGENTO AUDIT SERVICES AND IMPROVEMENTS", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(9) > a")).getText());    
    assertEquals("MAGENTO SUPPORT", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(10) > a")).getText());
    assertEquals("MAGENTO UPGRADE", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(11) > a")).getText());
    assertEquals("MAGENTO FOR SMALL BUSINESS", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(12) > a")).getText());    
    assertEquals("MAGENTO ENTERPRISE", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(13) > a")).getText());
    assertEquals("MAGENTO OUTSOURCING", driver.findElement(By.cssSelector("#content > div.std > div.main_with-right > aside > nav > ul > li:nth-child(14) > a")).getText());
  }

   private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  
  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

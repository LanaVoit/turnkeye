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
    driver.manage().window().maximize();
    driver.get(baseUrl + "/services/magento_site_from_scratch.html");
    assertEquals("Magento Site from Scratch", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("MAGENTO SITE FROM SCRATCH", driver.findElement(By.cssSelector("li.active > span")).getText());
    assertEquals("MAGENTO DESIGN", driver.findElement(By.xpath("(//a[contains(text(),'Magento Design')])[2]")).getText());
    assertEquals("PSD TO MAGENTO", driver.findElement(By.xpath("(//a[contains(text(),'PSD to Magento')])[2]")).getText());
    assertEquals("MAGENTO DEVELOPMENT", driver.findElement(By.xpath("(//a[contains(text(),'Magento Development')])[2]")).getText());
    assertEquals("MIGRATION TO MAGENTO", driver.findElement(By.xpath("(//a[contains(text(),'Migration to Magento')])[2]")).getText());
    assertEquals("MAGENTO SUPPORT", driver.findElement(By.xpath("(//a[contains(text(),'Magento Support')])[2]")).getText());
    assertEquals("MAGENTO UPGRADE", driver.findElement(By.xpath("(//a[contains(text(),'Magento Upgrade')])[2]")).getText());
    assertEquals("MAGENTO ENTERPRISE", driver.findElement(By.xpath("(//a[contains(text(),'Magento Enterprise')])[2]")).getText());
    assertEquals("OUR PROCESS", driver.findElement(By.cssSelector("h2")).getText());
    assertEquals("DESIGN CREATION", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[2]")).getText());
    assertEquals("MAGENTO THEME DEVELOPMENT", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[3]")).getText());
    assertEquals("FUNCTIONALITY DEVELOPMENT", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[4]")).getText());
    assertEquals("DATA TRANSFERS", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[5]")).getText());
    assertEquals("MOBILE SUPPORT", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[6]")).getText());
    assertEquals("MAGENTO & SERVER OPTIMIZATION", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[7]")).getText());
    assertEquals("FURTHER SUPPORT", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/section/h2[8]")).getText());
    
    driver.quit();
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

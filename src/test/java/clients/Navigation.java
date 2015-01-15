package clients;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Navigation extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled10() throws Exception {
    driver.manage().window().maximize();    
    driver.get(baseUrl + "clients");
    driver.findElement(By.xpath("(//a[contains(text(),'Magento Enterprise')])[2]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.portfolio-item > img")).getAttribute("alt"));    
    driver.findElement(By.cssSelector("a[href=\"#magentocommunity\"]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.isotope-hidden > img")).getAttribute("alt"));    
    driver.findElement(By.xpath("(//a[contains(text(),'Migration to Magento')])[2]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.isotope-hidden > img")).getAttribute("alt"));  
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

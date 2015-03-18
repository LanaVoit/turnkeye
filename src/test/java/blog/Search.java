package blog;

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

public class Search extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled3() throws Exception {
    driver.manage().window().maximize();
    
    driver.get(baseUrl + "blog/");
    assertEquals("", driver.findElement(By.id("gsc-i-id1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).getText());
    
    driver.findElement(By.id("gsc-i-id1")).clear();
    driver.findElement(By.id("gsc-i-id1")).sendKeys("magento");
    driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).click();
    assertEquals("Magento upgrade guide", driver.findElement(By.linkText("Magento upgrade guide")).getText());
    assertEquals("Magento Tips: Disable Magento compiler from Linux command shell", driver.findElement(By.linkText("Magento Tips: Disable Magento compiler from Linux command shell")).getText());
    assertEquals("Updated Instruction for 'Facebook Products Tab' Magento Extension", driver.findElement(By.linkText("Updated Instruction for 'Facebook Products Tab' Magento Extension")).getText());
    
    driver.findElement(By.cssSelector("div.gsc-results-close-btn.gsc-results-close-btn-visible")).click();
    assertEquals("Blog", driver.findElement(By.cssSelector("h1")).getText());    
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

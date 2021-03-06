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

public class Captcha_empty extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled() throws Exception {
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "blog/merry-christmas-and-happy-new-year-2014/");
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.id("user")).clear();
    driver.findElement(By.id("user")).sendKeys("test");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("test@test.com");
    driver.findElement(By.id("comment")).clear();
    driver.findElement(By.id("comment")).sendKeys("test comment");
    driver.findElement(By.cssSelector("input.button.form-button")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Your Recaptcha solution was incorrect, please try again", driver.findElement(By.cssSelector("#noty_top_layout_container >li > div > div > span > ul > li > ul > li > span")).getText());  
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

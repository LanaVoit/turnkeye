package about;

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

public class Contact_us extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled6() throws Exception {
    driver.manage().window().maximize();
    driver.get(baseUrl + "/about");
    assertEquals("CONTACT US", driver.findElement(By.cssSelector("a.see-more")).getText());
    
    driver.findElement(By.cssSelector("a.see-more")).click();
    assertEquals("Contact Us", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("If you have any pre-sales questions or want to contact us, please use the form below. You can also submit your questions to hello@turnkeye.com.", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("", driver.findElement(By.id("name")).getText());
    assertEquals("", driver.findElement(By.id("email")).getText());
    assertEquals("", driver.findElement(By.id("comment")).getText());
    assertEquals("SEND MESSAGE", driver.findElement(By.cssSelector("button.button")).getText());
    
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

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

public class Details_page extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled() throws Exception {
    driver.manage().window().maximize();
    driver.get(baseUrl + "blog/merry-christmas-and-happy-new-year-2014/");
    assertEquals("MERRY CHRISTMAS AND HAPPY NEW YEAR 2014", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Merry Christmas and Happy New year 2014\"]")).getText());
    assertEquals("TAGS", driver.findElement(By.cssSelector("div.post-tags-title")).getText());
    assertEquals("POSTED IN", driver.findElement(By.cssSelector("div.post-posted-title")).getText());
    assertEquals("Leave a Comment!", driver.findElement(By.cssSelector("div.legend")).getText());
    assertEquals("Post Comment", driver.findElement(By.cssSelector("input.button.form-button")).getAttribute("value"));
    assertEquals("", driver.findElement(By.id("user")).getAttribute("value"));
    assertEquals("", driver.findElement(By.id("email")).getAttribute("value"));
    assertEquals("", driver.findElement(By.id("comment")).getText());
    assertEquals("Categories", driver.findElement(By.cssSelector("div.block-title > span")).getText());
    assertEquals("", driver.findElement(By.id("gsc-i-id1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).getText());
    assertEquals("Tags", driver.findElement(By.cssSelector("div.block-tags > div.block-title > span")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento developers\"]")).getText());
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

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

public class Blog_page extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled2() throws Exception {
    	//final WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    driver.get(baseUrl + "blog/");
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Blog", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("", driver.findElement(By.id("gsc-i-id1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).getText());
    assertEquals("Categories", driver.findElement(By.cssSelector("div.block-title > span")).getText());
    assertEquals("Archives", driver.findElement(By.cssSelector("div.block-archives > div.block-title > span")).getText());
    assertEquals("Tags", driver.findElement(By.cssSelector("div.block-tags > div.block-title > span")).getText());
    assertEquals("Blog Authors", driver.findElement(By.cssSelector("div.block-blog-authors > div.block-title")).getText());
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

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
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "blog/");
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Blog", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("", driver.findElement(By.id("blog-search")).getText());
    assertEquals("", driver.findElement(By.cssSelector("#blog_search_mini_form > div > button")).getText());
    assertEquals("Categories", driver.findElement(By.cssSelector("#sideRight > div > div.block-blog-right > div.block-categories > div > span")).getText());
    //assertEquals("Archives", driver.findElement(By.cssSelector("#sideRight > div > div.block-blog-right > div.block-archives > div > span")).getText());
    assertEquals("Tags", driver.findElement(By.cssSelector("#sideRight > div > div.block-blog-right > div.block-tags > div > span")).getText());
    //assertEquals("Blog Authors", driver.findElement(By.cssSelector("#sideRight > div > div.block-blog-left > div.block-blog-authors > div")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento developers\"]")).getText());  

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

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
import org.openqa.selenium.support.ui.Select;

public class Navigation extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled10() throws Exception {
    //	final WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    driver.get(baseUrl + "/portfolio");
    assertEquals("PINUP GIRL CLOTHING", driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).getText());
    
    driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).click();
    assertEquals("GOLDEN EDIBLES >", driver.findElement(By.cssSelector(".next-project")).getText());
    assertEquals("< BUY WHOLE FOODS ONLINE", driver.findElement(By.cssSelector(".prev-project")).getText());
    
    driver.findElement(By.cssSelector(".next-project")).click();
    assertEquals("Golden Edibles", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("LETHAL PERFORMANCE >", driver.findElement(By.cssSelector(".next-project")).getText());
    
    driver.findElement(By.cssSelector(".next-project")).click();
    assertEquals("Lethal Performance", driver.findElement(By.cssSelector("h1")).getText());
    
    driver.findElement(By.cssSelector(".prev-project")).click();
    assertEquals("Golden Edibles", driver.findElement(By.cssSelector("h1")).getText());
    
  //  driver.quit();
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

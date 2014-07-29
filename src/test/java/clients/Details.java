package clients;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Details extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled8() throws Exception {
    driver.get(baseUrl + "/portfolio");
    assertEquals("PINUP GIRL CLOTHING", driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).getText());
    driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).click();
   
    assertEquals("Pinup Clothing", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Slide 1\"]")).getText());
    assertEquals("Since 1999, Pinup Clothing, has been specializing in the highest quality vintage inspired fashion, shoes and accessories for women.", driver.findElement(By.cssSelector("div.project-details > p")).getText());
    
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

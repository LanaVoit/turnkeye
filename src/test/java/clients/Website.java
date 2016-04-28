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

public class Website extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled7() throws Exception {
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "/clients/pinup-girl-clothing");
    assertEquals("Our clients - Pinup Girl Clothing", driver.getTitle());
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("h1")).getText());
      
    String parentHandle = driver.getWindowHandle();
    driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[2]/p/a")).click();
    TimeUnit.SECONDS.sleep(5);
    for (String winHandle : driver.getWindowHandles()) {
        driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
    }
    TimeUnit.SECONDS.sleep(15);
   
    //assertEquals("Home page | Pinup Girl Clothing", driver.getTitle());
    
    driver.close();
    driver.switchTo().window(parentHandle);   
      
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

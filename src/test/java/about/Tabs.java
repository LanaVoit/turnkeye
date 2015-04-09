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

public class Tabs extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled5() throws Exception {
    driver.manage().window().maximize();
    
    driver.get(baseUrl + "/about");
    assertEquals("About Us", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("Five reasons to choose our Magento development services.", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento Silver partner\"]")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"PayPal Gold partner\"]")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento back end and front end developers\"]")).getText());
    assertEquals("CONTACT US", driver.findElement(By.cssSelector("a.see-more")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"http://turnkeye.com/about/meet_the_team.html\"]")).click();
    assertEquals("Turnkey Ecommerce Solutions (TurnkeyE.com) is the full service Internet solution agency and custom development company with strong team of IT eCommerce professionals.", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("Meet the Team", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("Vyacheslav Fedorenko", driver.findElement(By.cssSelector("div.t-col-2 > h4")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"http://turnkeye.com/about/testimonials.html\"]")).click();
    assertEquals("Testimonials", driver.findElement(By.cssSelector("h1")).getText());
    //assertEquals("We would like to share some of comments of our clients", driver.findElement(By.cssSelector("h4")).getText());
   // assertEquals("", driver.findElement(By.cssSelector("img[alt=\"magento partners\"]")).getText());
    //assertEquals("Professionalism, commitment, deep understanding of the project's scope and requirements as well as attention to detail make them stand out and a pleasure to work with.", driver.findElement(By.cssSelector("span.big-text")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"http://turnkeye.com/about/partners.html\"]")).click();
    assertEquals("Partners", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("Our partners", driver.findElement(By.cssSelector("h4")).getText());
    //assertEquals("MAGENTO EXTENSIONS & TOOLS", driver.findElement(By.cssSelector("h2")).getText());
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

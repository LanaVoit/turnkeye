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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tabs extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled5() throws Exception {
    Actions actions = new Actions(driver);
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "/about");
    assertEquals("About Us", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("Five reasons to choose our Magento development services.", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento Partner Company\"]")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"PayPal Gold Partner Company\"]")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Magento Certified Developers\"]")).getText());
    assertEquals("CONTACT US", driver.findElement(By.cssSelector("a.see-more")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"https://astrio.net/about/meet_the_team.html\"]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("ASTRIO (astrio.net) is the full service Internet solution agency and custom development company with strong team of IT eCommerce professionals.", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("Meet the Team", driver.findElement(By.cssSelector("h1")).getText());
    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[4]"))).build().perform();
    //assertEquals("Svetlana Baranova\nQA Specialist", driver.findElement(By.cssSelector("#content > div.std > ul > li:nth-child(5) > div > div > div > div > h4")).getText());
    assertEquals("Svetlana Baranova\nQA Specialist", driver.findElement(By.cssSelector("#content > div.std > ul > li:nth-child(4) > div > div > div > div > h4")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"https://astrio.net/about/testimonials.html\"]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Testimonials", driver.findElement(By.cssSelector("h1")).getText());
    //assertEquals("We would like to share some of comments of our clients", driver.findElement(By.cssSelector("h4")).getText());
   // assertEquals("", driver.findElement(By.cssSelector("img[alt=\"magento partners\"]")).getText());
    //assertEquals("Professionalism, commitment, deep understanding of the project's scope and requirements as well as attention to detail make them stand out and a pleasure to work with.", driver.findElement(By.cssSelector("span.big-text")).getText());
    
    driver.findElement(By.cssSelector("a[href=\"https://astrio.net/about/partners.html\"]")).click();
    TimeUnit.SECONDS.sleep(5);
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

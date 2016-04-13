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

public class Details_elements extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled9() throws Exception {
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl + "/clients/pinup-girl-clothing");
    assertEquals("Our clients - Pinup Girl Clothing", driver.getTitle());
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("http://astrio.net/media/wysiwyg/portfolio/PinupClothing/xtop-banner.jpg.pagespeed.ic.1EMUFl8R3K.webp", driver.findElement(By.cssSelector("#content > div.turnkeye-portfolio > div.block-portfolio-banner > img.shadows-image")).getAttribute("src"));
    assertEquals("http://astrio.net/media/wysiwyg/portfolio/PinupClothing/xtop-mobile.png.pagespeed.ic.1GhF7nD-_1.webp", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[3]/img[2]")).getAttribute("src"));
    assertEquals("Project review", driver.findElement(By.cssSelector("h3")).getText());
    assertEquals("About the Pinup Girl Clothing project", driver.findElement(By.cssSelector("div.block-about-project > h3")).getText());
    assertEquals("Examples of implementation", driver.findElement(By.cssSelector("div.block-have-done > h3")).getText());
    assertEquals("Responsive design", driver.findElement(By.cssSelector("h4")).getText());
    assertEquals("Social login", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[2]/div/div/h4")).getText());
    assertEquals("Social activity block", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[3]/div/div/h4")).getText());
    assertEquals("Amazon Wish List", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[4]/div/div/h4")).getText());
    assertEquals("Shop the Look: hints to choose complementary products.", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[5]/div/div/h4")).getText());
    assertEquals("Love it", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[6]/div/div/h4")).getText());
    assertEquals("Look Book", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[6]/div[7]/div/div/h4")).getText());
    assertEquals("CUSTOMER FEEDBACK", driver.findElement(By.cssSelector("h3 > span")).getText());
    assertEquals("ABOUT OUR WORK:", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[7]/h3/span[2]/span")).getText());
    assertEquals("Contacts Us", driver.findElement(By.linkText("Contacts Us")).getText());
    assertEquals("EMAIL US", driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[9]/div/a[2]")).getText());
    assertEquals("Skype", driver.findElement(By.cssSelector("a.block-skype > span")).getText());
    driver.findElement(By.cssSelector("span.icon-right-open")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Personalised Gifts Shop", driver.findElement(By.cssSelector("h1")).getText());    
    driver.findElement(By.cssSelector("span.icon-left-open")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("h1")).getText());   
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

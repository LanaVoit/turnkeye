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

public class Details_elements extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled9() throws Exception {
    driver.get(baseUrl + "/portfolio");
    assertEquals("PINUP GIRL CLOTHING", driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).getText());
    
    driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).click();
    assertEquals("Pinup Clothing", driver.findElement(By.cssSelector("h1")).getText());
    assertEquals("Visit Website >", driver.findElement(By.linkText("Visit Website >")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Pinup Clothing\"]")).getText());
    assertEquals("GOLDEN EDIBLES >", driver.findElement(By.cssSelector(".next-project")).getText());
    assertEquals("< BUY WHOLE FOODS ONLINE", driver.findElement(By.cssSelector(".prev-project")).getText());
    assertEquals("3,000 products", driver.findElement(By.cssSelector("ul.key-options.cols-4 > li > span")).getText());
    assertEquals("545K fans on Facebook", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/ul/li[2]/span")).getText());
    assertEquals("Founded in 1999", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/ul/li[3]")).getText());
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Slide 1\"]")).getText());
    assertEquals("FULL RANGE OF SERVICES", driver.findElement(By.cssSelector("h3")).getText());
    assertEquals("Our team provided Pinup Clothing company\nwith full range of services, including", driver.findElement(By.cssSelector("div.full-range-services > h4")).getText());
    assertEquals("Since 1999, Pinup Clothing, has been specializing in the highest quality vintage inspired fashion, shoes and accessories for women.", driver.findElement(By.cssSelector("div.project-details > p")).getText());
    assertEquals("Our designs can be found in thousands of boutiques across the globe, but online, we are the exclusive manufacturer and retailer of vintage inspired clothing lines Pinup Couture, Deadly Dames by Micheline Pitt, Dixiefried by Melanie Komenkul, Little Foxes by Davida Sullivan, and Eldorado Club Jewelry by Joe DeBlois.", driver.findElement(By.xpath("//div[@id='content']/div[2]/div[3]/p[2]")).getText());
    assertEquals("CHOOSE A RELIABLE DEVELOPMENT PARTNER\nAND GET A BUG-FREE, UPGRADABLE, BRIGHT FUTURE\nFOR YOUR ECOMMERCE PROJECTS.", driver.findElement(By.cssSelector("h2.choose-partner")).getText());
    assertEquals("TEAM BEHIND THE PROJECT", driver.findElement(By.cssSelector("div.team-behind > h3")).getText());
    assertEquals("This project was delivered by own in-house\nteam of Magento experts", driver.findElement(By.cssSelector("div.team-behind > h4")).getText());
    assertEquals("What clients say about our work", driver.findElement(By.linkText("What clients say about our work")).getText());
    
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

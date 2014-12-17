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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Navigation extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled10() throws Exception {
    //	final WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	/*driver.manage().window().maximize();
    	Actions actions = new Actions(driver);
        driver.get(baseUrl + "index.php/secretzone51");
       driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("gbpljrhzxrf1530");
        driver.findElement(By.cssSelector("input.form-button")).click();
        actions.moveToElement(driver.findElement(By.xpath("//ul[@id='nav']/li[8]/a/span"))).build().perform();
        driver.findElement(By.xpath("//ul[@id='nav']/li[8]/ul/li/a/span")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.cssSelector("a[name=\"position\"] > span.sort-title")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("//table[@id='portfolio_set_id_table']/tbody/tr/td[2]")).click();
        driver.findElement(By.cssSelector("#portfolio_tabs_filter > span")).click();
        assertEquals("Magento Enterprise", driver.findElement(By.cssSelector("#filter_filter_magento > option[value=\"1\"]")).getText());   */
        
    driver.get(baseUrl + "clients");
    driver.findElement(By.xpath("(//a[contains(text(),'Magento Enterprise')])[2]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.portfolio-item > img")).getAttribute("alt"));    
    driver.findElement(By.cssSelector("a[href=\"#magentocommunity\"]")).click();
    TimeUnit.SECONDS.sleep(5);
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.isotope-hidden > img")).getAttribute("alt"));    
   // assertFalse(isElementPresent(By.cssSelector("div.portfolio-item > img[alt=\"Pinup Girl Clothing\"]")));
    driver.findElement(By.xpath("(//a[contains(text(),'Migration to Magento')])[2]")).click();
    TimeUnit.SECONDS.sleep(5);
    //assertFalse(isElementPresent(By.cssSelector("div.portfolio-item > img[alt=\"Pinup Girl Clothing\"]")));
    assertEquals("Pinup Girl Clothing", driver.findElement(By.cssSelector("div.isotope-hidden > img")).getAttribute("alt"));  
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

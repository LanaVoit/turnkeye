package home;

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

public class Banner extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  

    @Test
  public void testUntitled4() throws Exception {    	
    driver.manage().window().setSize(new Dimension(1366, 1050));
    
    driver.get(baseUrl);

    //String img1 = "https://astrio.net/skin/frontend/default/turnkeye/images/main-banner/large/slide1.jpg";
    String img1="1";
    assertEquals("", img1, driver.findElement(By.cssSelector("#container > div.block-main-banner > header > div.carousel-wrapper > div > ul > li:nth-child(1)")).getAttribute("data-init-position")); 
    
   
    driver.findElement(By.cssSelector("#container > div.block-main-banner > header > div.wrap > div > div > ul > li:nth-child(4)")).click();

    TimeUnit.SECONDS.sleep(5);
    //String img2 = "https://astrio.net/media/wysiwyg/main-banner/home-original/slide-pinup.jpg";
    String img2="2";
    assertEquals("", img2, driver.findElement(By.cssSelector("#container > div.block-main-banner > header > div.carousel-wrapper > div > ul > li.active")).getAttribute("data-init-position")); 
    
    TimeUnit.SECONDS.sleep(5);
    driver.findElement(By.cssSelector("#container > div.block-main-banner > header > div.wrap > div > div > ul > li:nth-child(4)")).click();
    TimeUnit.SECONDS.sleep(5);
    
    //String img4 = "https://astrio.net/media/wysiwyg/main-banner/home-original/slide-backcountry.jpg";
    String img3="3";
    assertEquals("", img3, driver.findElement(By.cssSelector("#container > div.block-main-banner > header > div.carousel-wrapper > div > ul > li.active")).getAttribute("data-init-position"));     
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

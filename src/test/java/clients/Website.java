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
    //	final WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    driver.get(baseUrl + "/portfolio");
    assertEquals("PINUP GIRL CLOTHING", driver.findElement(By.xpath("//div[@id='content']/div[3]/div[3]/ul/li[2]/div/p")).getText());
    assertEquals("VISIT WEBSITE", driver.findElement(By.xpath("(//a[contains(text(),'Visit Website')])[2]")).getText());
    
    
    String parentHandle = driver.getWindowHandle();
    driver.findElement(By.xpath("(//a[contains(text(),'Visit Website')])[2]")).click();
    for (String winHandle : driver.getWindowHandles()) {
        driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
    }
   
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"PinupgirlClothing.com\"]")).getText());
    assertEquals("Welcome to Pinup Girl Clothing! Since 1999, Pin Up Girl, headed by Laura Byrnes, has been specializing in the highest quality vintage inspired fashion, shoes and accessories for women of every size! Our original designs are cut to flatter your curves and make you look as beautiful as you feel, at prices to fit every budget. Pinup Girl Clothing is the first company to do more than pay lip service to the idea that beauty is not a size. We use models from size Extra Small to 2X to showcase our designs, featuring stunning editorial pinup photography by Laura, who is also the head designer for our signature line, Pinup Couture. Our designs can be found in thousands of boutiques across the globe, but online, we are the exclusive manufacturer and retailer of vintage inspired clothing lines Pinup Couture, Deadly Dames by Micheline Pitt, and Dixiefried by Melanie Komenkul. We love our customers, and again, we're not just saying that: our Pinup Girl Clothing Facebook page has over 600,000 likes and counting, because it is an active, lively forum filled with loyal customers who not only sing our praises, but actually help other customers with questions about fit, sizing, and more. We enjoy and value this interaction with our customers and your comments and suggestions help us bring you even better designs and products, so please feel free to join us! We believe in hassle free, personalized service, delivered with sincerity and respect. Profit is important to us, but not at the expense of fun, and here at Pinup Girl Clothing, we love what we do and look forward to helping you look fabulous! Since 1999, the originator of Pinup Style: Nifty Threads for Girly Girls and Bodacious Bombshells!", driver.findElement(By.cssSelector("td > div.std")).getText());
  
    driver.close();
    driver.switchTo().window(parentHandle);
   // driver.quit();
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
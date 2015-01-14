package home;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.saucelabs.testng.SauceOnDemandTestListener;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;






import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;


public class Newsletter_empty extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @Test
  public void testUntitled5() throws Exception {
	driver.get(baseUrl);
    driver.manage().window().maximize();    
    TimeUnit.SECONDS.sleep(5);
    assertEquals("", driver.findElement(By.id("newsletter111")).getText());
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    assertEquals("", driver.findElement(By.className("error")).getText());
  //  driver.quit();
  }

  @AfterSuite
	public void tearDown() {
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
  
  
}

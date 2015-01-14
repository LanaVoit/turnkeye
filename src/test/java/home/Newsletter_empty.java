package home;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

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

@Listeners({SauceOnDemandTestListener.class})
public class Newsletter_empty extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  public WebDriver createDriver(String browser, String version, String os) throws MalformedURLException {

      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability(CapabilityType.BROWSER_NAME, browser);
      if (version != null) {
          capabilities.setCapability(CapabilityType.VERSION, version);
      }
      capabilities.setCapability(CapabilityType.PLATFORM, os);
      capabilities.setCapability("name", "Only_firstname");
      capabilities.setCapability("passed", "true");
      webDriver.set(new RemoteWebDriver(
              new URL("http://qatestingtestqa:7d7d449c-27c0-45c7-9339-3aad563a5cc0@ondemand.saucelabs.com:80/wd/hub"),
              capabilities));
      sessionId.set(((RemoteWebDriver) getWebDriver()).getSessionId().toString());
      return webDriver.get();
  }

  @Test(dataProvider = "hardCodedBrowsers")
  public void testUntitled5(String browser, String version, String os) throws Exception {
	WebDriver driver = createDriver(browser, version, os);
	driver.get(baseUrl);
    driver.manage().window().maximize();    
    TimeUnit.SECONDS.sleep(5);
    assertEquals("", driver.findElement(By.id("newsletter")).getText());
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

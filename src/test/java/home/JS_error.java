package home;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.Logs;

import com.saucelabs.testng.SauceOnDemandTestListener;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;

public class JS_error extends turnkeye.pages.TestBase {
	@Listeners({SauceOnDemandTestListener.class})
	public class Email extends turnkeye.pages.TestBase {
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  public WebDriver createDriver(String browser, String version, String os) throws MalformedURLException {

	      DesiredCapabilities capabilities = new DesiredCapabilities();
	      capabilities.setCapability(CapabilityType.BROWSER_NAME, browser);
	      if (version != null) {
	          capabilities.setCapability(CapabilityType.VERSION, version);
	      }
	      capabilities.setCapability(CapabilityType.PLATFORM, os);
	      capabilities.setCapability("name", "Email");
	      capabilities.setCapability("passed", "true");
	      webDriver.set(new RemoteWebDriver(
	              new URL("http://qatestingtestqa:7d7d449c-27c0-45c7-9339-3aad563a5cc0@ondemand.saucelabs.com:80/wd/hub"),
	              capabilities));
	      sessionId.set(((RemoteWebDriver) getWebDriver()).getSessionId().toString());
	      return webDriver.get();
	  }

	  @Test(dataProvider = "hardCodedBrowsers")
	  public void testUntitled2(String browser, String version, String os) throws Exception {
		WebDriver driver = createDriver(browser, version, os);

    	driver.manage().window().maximize();
        driver.get(baseUrl);
        Logs log = driver.manage().logs();
        List<LogEntry> logsEntries = log.get("browser").getAll();    
        List<String> list = new ArrayList<String>();
        list.isEmpty();
        for (LogEntry entry: logsEntries) {        	
    		System.out.println(entry.getMessage());  
    		//driver.quit();
        }
		    assertEquals(list, logsEntries);
		  //  driver.quit();
  	    }    

	  }
}



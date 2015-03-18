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


@Listeners({SauceOnDemandTestListener.class})
public class JS_error extends turnkeye.pages.TestBase {	
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();
		  
		  @Test
	public void testUntitled2() throws Exception {
	    	driver.manage().window().maximize();
	    	
	        driver.get(baseUrl);
	        
	        Logs log = driver.manage().logs();
	        List<LogEntry> logsEntries = log.get("browser").getAll();    
	        List<String> list = new ArrayList<String>();
	        list.isEmpty();
	        
	        for (LogEntry entry: logsEntries) {        	
	    		System.out.println(entry.getMessage());  
	        }
	        
			assertEquals(list, logsEntries);    
	  }    

 }



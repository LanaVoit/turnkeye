package home;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
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
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.Platform;;

import com.saucelabs.testng.SauceOnDemandTestListener;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;

import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;


public class JS_error_home extends turnkeye.pages.TestBase {
		  
		  @Test
	public void testUntitled2() throws Exception {
			  LoggingPreferences logPrefs = new LoggingPreferences();
		    	logPrefs.enable(LogType.BROWSER, Level.SEVERE);
		        driver.get(baseUrl);
		        TimeUnit.SECONDS.sleep(5);
		        Logs log = driver.manage().logs();
		        List<LogEntry> logsEntries =  driver.manage().logs().get("browser").filter(Level.SEVERE);
		        List<String> list = new ArrayList<String>();
		        list.isEmpty();
		        
		         for (LogEntry entry: logsEntries) {        	
		    		System.out.println(entry.getMessage());  
		        }
		        
		    	assertEquals(list, logsEntries);		
		    }    		       
		}



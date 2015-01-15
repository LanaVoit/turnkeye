package blog;

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

public class Search extends turnkeye.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    @Test
  public void testUntitled3() throws Exception {
  //	final WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    driver.get(baseUrl + "blog/");
    assertEquals("", driver.findElement(By.id("gsc-i-id1")).getText());
    assertEquals("", driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).getText());
    
    driver.findElement(By.id("gsc-i-id1")).clear();
    driver.findElement(By.id("gsc-i-id1")).sendKeys("magento");
    driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).click();
   // assertTrue(driver.findElement(By.cssSelector("div.gsc-results-wrapper-overlay.gsc-results-wrapper-visible")).getText().matches("^exact:Turnkeye\\.com\n \n\nAbout 156 results \\(0\\.14 seconds\\)\nSort by:\nRelevance\n\n\nRelevance\n\nDate\n\n\n\n\n\n\n\nWeb\n\n\\(10\\)\n \n \n \n\npowered by\nCustom Search\n\nMagento upgrade guide\n\nturnkeye\\.com\nturnkeye\\.com/blog/magento-upgrade-guide/\n\nMagento upgrade guide\n\nMar 24, 2013 \\.\\.\\. This is the most comprehensive description of the Magento 1\\.3\\.x, 1\\.4\\.x, 1\\.5\\.x, 1\\.6\\. x and 1\\.7\\.x upgrade process\\. Additionally It contains \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/magento-upgrade-guide/\n\n\n\nclipped from Google - 8/2014\n\nMagento Tips: Disable Magento compiler from Linux command shell\n\nturnkeye\\.com\nturnkeye\\.com/blog/disable-magento-compiler/\n\n\nMagento Tips: Disable Magento compiler from Linux command shell\n\nMar 2, 2012 \\.\\.\\. Sometimes it is needed to urgently disable and clear Magento compiler, e\\.g\\. after installation or some 3rd party Magento module\\. If you have \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/disable-magento-compiler/\n\n\n\nclipped from Google - 8/2014\n\nUpdated Instruction for 'Facebook Products Tab' Magento Extension\n\nturnkeye\\.com\nturnkeye\\.com/blog/facebook-products-tab-for-magento/\n\n\nUpdated Instruction for 'Facebook Products Tab' Magento Extension\n\nDec 14, 2011 \\.\\.\\. In this tutorial you will find detailed instruction on how to install and configure \" Facebook Products Tab\" Magento extension\\. Using this \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/facebook-products-tab-for-magento/\n\n\n\nclipped from Google - 8/2014\n\nMagento performance: Optimization of Magento configurable \\.\\.\\.\n\nturnkeye\\.com\nturnkeye\\.com/\\.\\.\\./magento-performance-optimization-configurable-products- 2/\n\nMagento performance: Optimization of Magento configurable \\.\\.\\.\n\nFeb 5, 2013 \\.\\.\\. Here I will provide you with several tips on how to increase Magento performance if you have configurable products with many associated \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/\\.\\.\\./magento-performance-optimization-configurable-products- 2/\n\n\n\nclipped from Google - 8/2014\n\nWhy Upgrade to Magento Community 1\\.8[\\s\\S]\n\nturnkeye\\.com\nturnkeye\\.com/blog/upgrade-to-magento-community-1-8/\n\nWhy Upgrade to Magento Community 1\\.8[\\s\\S]\n\nJul 1, 2013 \\.\\.\\. Here is an overview of the most important Magento Community 1\\.8 fixes and improvements sorted by importance\\. Magento Community 1\\.8 is \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/upgrade-to-magento-community-1-8/\n\n\n\nclipped from Google - 8/2014\n\nMagento performance: Optimization of Magento configurable products\n\nturnkeye\\.com\nturnkeye\\.com/\\.\\.\\./magento-perfomance-optimization-of-configurable- products/\n\nMagento performance: Optimization of Magento configurable products\n\nAug 15, 2012 \\.\\.\\. Magento perfomance: Optimization of Magento configurable products\\. In this article I will show how to debug such issues and how to fix the \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/\\.\\.\\./magento-perfomance-optimization-of-configurable- products/\n\n\n\nclipped from Google - 8/2014\n\nMagento Performance: Nginx Installation\n\nturnkeye\\.com\nturnkeye\\.com/blog/nginx-for-magento/\n\nMagento Performance: Nginx Installation\n\nJun 12, 2013 \\.\\.\\. \\.\\.\\. manager \\(PHP-FPM\\) and MySQL\\. Operating system is Linux CentOS 6\\. Also you will find here Magento compatible Nginx configuration\\.\nturnkeye\\.com\nturnkeye\\.com/blog/nginx-for-magento/\n\n\n\nclipped from Google - 8/2014\n\nMagento announces plans to phase out the Professional Edition\n\nturnkeye\\.com\nturnkeye\\.com/blog/magento-professional-phasing-out-migration/\n\nMagento announces plans to phase out the Professional Edition\n\nFeb 9, 2012 \\.\\.\\. On February 1, 2012 Magento announced the end-of-life of Magento Professional edition\\. Phasing out Magento Professional will allow \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/magento-professional-phasing-out-migration/\n\n\n\nclipped from Google - 8/2014\n\nMagento performance: Optimize MySQL settings for your Magento \\.\\.\\.\n\nturnkeye\\.com\nturnkeye\\.com/blog/magento-performance-optimize-mysql/\n\nMagento performance: Optimize MySQL settings for your Magento \\.\\.\\.\n\nJul 3, 2012 \\.\\.\\. Optimize MySQL settings for Magento database The Tuning Primer is a shell script that allows you to review the MySQL settings and make \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/magento-performance-optimize-mysql/\n\n\n\nclipped from Google - 8/2014\n\nHow to share Magento cart between several Magento multi-stores\n\nturnkeye\\.com\nturnkeye\\.com/blog/share-magento-cart-between-multistores/\n\nHow to share Magento cart between several Magento multi-stores\n\nNov 22, 2012 \\.\\.\\. If you have multi-stores configured in your Magento and you want to have single cart for all multi-stores this article is what you need\\. All your \\.\\.\\.\nturnkeye\\.com\nturnkeye\\.com/blog/share-magento-cart-between-multistores/\n\n\n\nclipped from Google - 8/2014\n\n\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10$"));
    assertEquals("Magento upgrade guide", driver.findElement(By.linkText("Magento upgrade guide")).getText());
    assertEquals("Magento Tips: Disable Magento compiler from Linux command shell", driver.findElement(By.linkText("Magento Tips: Disable Magento compiler from Linux command shell")).getText());
    assertEquals("Updated Instruction for 'Facebook Products Tab' Magento Extension", driver.findElement(By.linkText("Updated Instruction for 'Facebook Products Tab' Magento Extension")).getText());
    
    driver.findElement(By.cssSelector("div.gsc-results-close-btn.gsc-results-close-btn-visible")).click();
    assertEquals("Blog", driver.findElement(By.cssSelector("h1")).getText());
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

package com.cardinalhealth.bpm.automation.browser;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.cardinalhealth.bpm.automation.constants.Browsers;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.Constants;

public class BrowserFactory {
	
	private static ConfigurationManager configrationManager = ConfigurationManager.getInstance();
	
	/**
	 * creates the browser driver specified in the system property "browser"
	 * if no property Ois set then a firefox browser driver is created.
	 * The allow properties are firefox, safari, IE and chrome
	 * e.g to run with safari, pass in the option -Dbrowser=safari at runtime
	 * @return WebDriver
	 */
	public static WebDriver getBrowser() {
		Browsers browser;
		WebDriver driver;
		
		if(configrationManager.getProperty(Constants.BROWSER)==null){
			browser = Browsers.CHROME;
		}else{
			browser = Browsers.browserForName(configrationManager.getProperty(Constants.BROWSER));
		}
		switch(browser){
			case SAFARI:
				driver = createSafariDriver();
				break;
			//case FIREFOX:
				//driver = createFirefoxDriver(getFirefoxProfile());
				//break;
			case FIREFOX:
				driver = createFirefoxDriver();
				break;
				
				
			case IE:
				driver = createIEDriver();
				break;
			case CHROME:
				driver = createChromeDriver();
				break;
			case REMOTECHROME:
				driver = createRemoteChromeDriver();
				break;
			default:
				driver = createChromeDriver();
		}
		addAllBrowserSetup(driver);
		return driver;
	}

	private static WebDriver createIEDriver() {
		System.setProperty("webdriver.ie.driver", configrationManager.getProperty(Constants.IE_DRIVER_PATH));
		return new InternetExplorerDriver();
	}
	
	private static WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", configrationManager.getProperty(Constants.FIREFOX_DRIVER_PATH));
		return new FirefoxDriver();
	}

	private static WebDriver createSafariDriver() {
		return new SafariDriver();
	}

	private static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver",  configrationManager.getProperty(Constants.CHROME_DRIVER_PATH));
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("test-type");
	    //New two lines
	    // ChromeOptions options = new ChromeOptions();
	    //options.setBinary("/Applications/chrome-mac/Chromium.app/Contents/MacOs/Chromium");
	    options.addArguments("--allow-running-insecure-content");
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return new ChromeDriver(capabilities);
	}
	
	private static WebDriver createRemoteChromeDriver() {
		try{
			String remoteServer = "http://192.168.18.26:5555/wd/hub";
			URL hubUrl = new URL(remoteServer);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			chromeOptions.addArguments("--allow-running-insecure-content");
			chromeOptions.addArguments("test-type");
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			
			//capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
			return  new RemoteWebDriver(hubUrl, capabilities);
		}
		catch(Exception ex){
			return null;
		}
	}
	
	/*
	private static WebDriver createFirefoxDriver(FirefoxProfile firefoxProfile) {
        return new FirefoxDriver(firefoxProfile);
    }

	private static FirefoxProfile getFirefoxProfile() {
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        
        
        try {
			firefoxProfile.addExtension(FileUtils.getFile("firebug/firebug-1.9.2.xpi"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e){
        	e.printStackTrace();
        }

        //See http://getfirebug.com/wiki/index.php/Firebug_Preferences
        firefoxProfile.setPreference("extensions.firebug.currentVersion", "1.9.2");  // Avoid startup screen
        firefoxProfile.setPreference("extensions.firebug.script.enableSites", true);
        firefoxProfile.setPreference("extensions.firebug.console.enableSites", true);
        firefoxProfile.setPreference("extensions.firebug.allPagesActivation", true);
        firefoxProfile.setPreference("extensions.firebug.delayLoad", false);
        
        return firefoxProfile;
    }
	
	*/
	
	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(dim);
	}

}

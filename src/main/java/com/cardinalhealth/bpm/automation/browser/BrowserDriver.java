package com.cardinalhealth.bpm.automation.browser;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

import cucumber.annotation.en.Given;

public class BrowserDriver {
	private static final Logger LOGGER = LogManager.getInstance().getAppLogger();
	private static WebDriver mDriver;
	
	public synchronized static WebDriver getCurrentDriver() {
		
		if (mDriver==null) {
			try {
                mDriver = BrowserFactory.getBrowser();
	        } catch (UnreachableBrowserException e) {
	            mDriver = BrowserFactory.getBrowser();
	        } catch (WebDriverException e) {
	            mDriver = BrowserFactory.getBrowser();        
	        }finally{
	        	Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
	        }
		}
        return mDriver;
    }
	
	public static void close() {
        try {
            getCurrentDriver().quit();
            mDriver = null;
            LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }
	
	private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }
	
	public static void loadPage(String url){
		getCurrentDriver();
        LOGGER.info("Directing browser to:" + url);
        LOGGER.info("try to loadPage [" + url + "]");
        getCurrentDriver().get(url);
	}
	
	public static void reopenAndLoadPage(String url) {
        mDriver = null;
        getCurrentDriver();
        loadPage(url);
    }
	
	public static WebElement waitForElement(WebElement elementToWaitFor){
		return waitForElement(elementToWaitFor, null);
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	   
	}
	
	public static WebElement waitForElementToBeClickable(WebElement elementToWaitFor){
		return waitForElementToBeClickable(elementToWaitFor,null);
	}
	
	public static WebElement waitForElementToBeClickable(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 60;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.elementToBeClickable(elementToWaitFor));
	   
	}
	
    public static WebElement getParent(WebElement element) {
        return element.findElement(By.xpath(".."));
    }
    
    public static List<WebElement> getDropDownOptions(WebElement webElement) {
        Select select = new Select(webElement);
        return select.getOptions();
    }
    

    public static WebElement getDropDownOption(WebElement webElement, String value) {
    	WebElement option = null;
        List<WebElement> options = getDropDownOptions(webElement);
        for (WebElement element : options) {
            if (element.getAttribute("value").equalsIgnoreCase(value)) {
                System.out.println("This works2");
            	option = element;
            	System.out.println("option"+option);
                break;
            }
        }
        return option;
    }
    
    
    public static void findAllTextFields(WebElement webElement){
    	//webElement.sendKeys(value);
    	//ebElement.sendKeys(Keys.TAB);
    	//webElement.findElements(by)
    	java.util.List<WebElement> links = webElement.findElements(By.xpath(".."));
    	
    	//java.util.List<WebElement> links = webElement.;
    	System.out.println("size:-"+links.size());
    	
    	//String arr1[];
    	
		for (int i = 0; i<links.size(); i=i+1)
 
		{
 System.out.println("i"+i);
			System.out.println(links.get(i).getText());
			//arr1 = links.get(i).getText();
			
		/*	if (links.get(i).getText().equals("Support")){
				System.out.println("This is working");
				links.get(i).click();
				//waitForAMoment();
			}*/
 
		}
 
	
    }
	
	
    public static void findAllTextFields2(WebElement webElement){
    	
//java.util.List<WebElement> inputFields = webElement.findElements(By.tagName("input"));
    	//textToInput = {"first","second","Third","Fourth","Fifth","Sixth","Seventh","Eight"};
    	//java.util.List<WebElement> inputFields = webElement.findElements(By.className("cat_item_option"));
    	
    	java.util.List<WebElement> inputFields = webElement.findElements(By.xpath(".//*[@class='input_controls']"));
    	
    	System.out.println("sizeNew:"+ inputFields.size());
    	
    	for(int i = 0; i < inputFields.size(); i++){
            inputFields.get(i).sendKeys("this is great!");
        }
    	
    	//String arr1[];
    	
		/*for (int i = 0; i<inputFields.size(); i=i+1)
 
		{
 System.out.println("i"+i);
			System.out.println(links.get(i).getText());
			//arr1 = links.get(i).getText();
			
			if (links.get(i).getText().equals(value)){
				System.out.println("This is working");
				links.get(i).click();
				
				waitForAMoment();
				break;
			}*/
 
		}
  
	
    public static void findTable(WebElement webElement){
    	
    	WebElement table_element = webElement.findElement(By.id("item_table"));
        List<WebElement> tr_collection=table_element.findElements(By.xpath("id('item_table')/tbody/tr"));

        System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
        int row_num,col_num;
        row_num=1;
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
            System.out.println("NUMBER OF COLUMNS="+td_collection.size());
            col_num=1;
            for(WebElement tdElement : td_collection)
            {
                System.out.println("row # "+row_num+", col # "+col_num+ "text="+tdElement.getText());
                col_num++;
            }
            row_num++;
        } 
    }
    	
    	
    
    
    
    
    
    
    public static WebElement getDropDownOption2(WebElement webElement, String value) {
    	WebElement option = null;
        List<WebElement> options = getDropDownOptions(webElement);
        for (WebElement element : options) {
            if (element.getAttribute("value").equalsIgnoreCase(value)) {
                option = element;
                option.click();
                break;
            }
        }
        return option;
    }
    
    public static void doubleClick(WebElement webElement){
    	Actions actions = new Actions(getCurrentDriver()) ;
    	actions.doubleClick(webElement).build().perform();
    }
    
    
    
    public static void selectValueInFilteringSelect(WebElement webElement,String value){
    	webElement.sendKeys(value);
    	webElement.sendKeys(Keys.TAB);
    	//webElement.findElements(by)
    }
    
    
    public static void findAllLinks(WebElement webElement){
    	//webElement.sendKeys(value);
    	//ebElement.sendKeys(Keys.TAB);
    	//webElement.findElements(by)
    	java.util.List<WebElement> links = webElement.findElements(By.tagName("a"));
    	
    	
    	System.out.println(links.size());
    	
    	//String arr1[];
    	
		for (int i = 0; i<links.size(); i=i+1)
 
		{
 System.out.println("i"+i);
			System.out.println(links.get(i).getText());
			//arr1 = links.get(i).getText();
			
			if (links.get(i).getText().equals("Support")){
				System.out.println("This is working");
				links.get(i).click();
				//waitForAMoment();
			}
 
		}
 
	
    }
    	
    
 
    
   /* public static void enterText(WebElement webElement){
    	//webElement.sendKeys(value);
    	//ebElement.sendKeys(Keys.TAB);
    	//webElement.findElements(by)
    	WebElement field = null;
    	WebElement parent =null;
    	 field = webElement.findElement(By.className("col-xs-6"));
    	parent = field.
    	field.
    	 
    	System.out.println(links.size());
    	
    	//String arr1[];
    	
		for (int i = 0; i<links.size(); i=i+1)
 
		{
 System.out.println("i"+i);
			System.out.println(links.get(i).getText());
			//arr1 = links.get(i).getText();
			
			if (links.get(i).getText().equals("Support")){
				System.out.println("This is working");
				links.get(i).click();
				//waitForAMoment();
			}
 
		}
 
	
    }*/
    	
    
    
  public static void findAllLinks2(WebElement webElement, String value){
    	//webElement.sendKeys(value);
    	//ebElement.sendKeys(Keys.TAB);
    	//webElement.findElements(by)
    	java.util.List<WebElement> links = webElement.findElements(By.tagName("a"));
    	
    	
    	System.out.println(links.size());
    	
    	//String arr1[];
    	
		for (int i = 0; i<links.size(); i=i+1)
 
		{
 System.out.println("i"+i);
			System.out.println(links.get(i).getText());
			//arr1 = links.get(i).getText();
			
			if (links.get(i).getText().equals(value)){
				System.out.println("This is working");
				links.get(i).click();
				
				waitForAMoment();
				break;
			}
 
		}
  
	
    }
    
    
    
    
    public static void sleep() {
    	
    	try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}

    	
    }
    
  public static void enter() {
    	
	  Actions action = new Actions(BrowserDriver.getCurrentDriver()); 
	  action.sendKeys(Keys.ENTER).build().perform();


    	
    }
  
	
	public static void pressTab() {

		Actions action = new Actions(BrowserDriver.getCurrentDriver());
		action.sendKeys(Keys.TAB).build().perform();
		//action

	}

	public static void waitForAMoment(){
		wait(3000);
	}
	
	public static void wait(int waitTimeInMilliSeconds){
		try {
			Thread.sleep(waitTimeInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
}


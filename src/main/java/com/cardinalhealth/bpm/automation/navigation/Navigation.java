package com.cardinalhealth.bpm.automation.navigation;

import org.apache.log4j.Logger;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.CredentialsType;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.Constants;
import com.cardinalhealth.bpm.automation.util.LogManager;




public class Navigation {
	private static final Logger LOGGER = LogManager.getInstance().getAppLogger();
	//private User user;
	ConfigurationManager configurationManager = ConfigurationManager.getInstance();
	public void given_I_navigate_to_the_vitalpath_application(){
		BrowserDriver.loadPage(configurationManager.getProperty(Constants.VITALPATH_URL));
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		
	}

	public void when_I_try_to_login(String roleName) throws InvalidDataException {
		String[] credentials = CredentialsType.getCredentials(roleName);
		//LoginView.login(credentials[0], credentials[1]);
	}
	
}

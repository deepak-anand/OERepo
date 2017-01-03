package com.cardinalhealth.bpm.automation.constants;

import org.apache.commons.lang3.StringUtils;

import com.cardinalhealth.bpm.automation.util.ConfigurationManager;

public class CredentialsType {
	public static ConfigurationManager configurationManager = ConfigurationManager.getInstance();
	public static final String VPATH_PHARMA_USERNAME="VPATH_PHARMA_USERNAME";
	public static final String VPATH_PHARMA_PASSWORD="VPATH_PHARMA_PASSWORD";
	public static final String VPATH_TECHNICIAN_USERNAME="VPATH_TECHNICIAN_USERNAME";
	public static final String VPATH_TECHNICIAN_PASSWORD="VPATH_TECHNICIAN_PASSWORD";
	public static final String VPATH_ADMIN_USERNAME="VPATH_ADMIN_USERNAME";
	public static final String VPATH_ADMIN_PASSWORD="VPATH_ADMIN_PASSWORD";
	public static String[] getCredentials(String roleName) throws InvalidDataException{
		String[] credentials = new String[2];
		if(StringUtils.isEmpty(roleName)){
			roleName="PHARMACIST";
		}
		if("PHARMACIST".equalsIgnoreCase(roleName)){
			credentials[0] = configurationManager.getProperty(VPATH_PHARMA_USERNAME);
			credentials[1] = configurationManager.getProperty(VPATH_PHARMA_PASSWORD);
		}else if("TECHNICIAN".equalsIgnoreCase(roleName)){
			credentials[0] = configurationManager.getProperty(VPATH_TECHNICIAN_USERNAME);
			credentials[1] = configurationManager.getProperty(VPATH_TECHNICIAN_PASSWORD);
		}else if("ADMINISTRATOR".equalsIgnoreCase(roleName)){
			credentials[0] = configurationManager.getProperty(VPATH_ADMIN_USERNAME);
			credentials[1] = configurationManager.getProperty(VPATH_ADMIN_PASSWORD);
		}else{
			throw new InvalidDataException("Invalid credentials specified");
		}
		return credentials;
	}
}

package com.cardinalhealth.bpm.automation.util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import org.apache.log4j.Logger;

public  class ConfigurationManager {
	
	static Logger logger = LogManager.getInstance().getAppLogger();
	private static ConfigurationManager configurationManager = null;

	private static Properties appConfig;
	
	private void dumpProperties( Properties appConfig) {
		for (Entry<Object, Object> prop : appConfig.entrySet()) {
			logger.trace("ConfigurationBase.dumpProperties:\t" + prop.getKey() + "=" + prop.getValue());
		}
	}
	private final String defaultConfigFile = "automation.default.properties";
	
	private ConfigurationManager() 
	{
		appConfig = init(defaultConfigFile);
		loadEnvironmentSpecificProperties(appConfig);
	}
	
	public static ConfigurationManager getInstance() {
		if (configurationManager == null) {
			configurationManager = new ConfigurationManager();
		}
		return configurationManager;
	}
	private Properties init( String defaultConfigFile)
	{
		final String METHOD_NAME = "ConfigurationManager.init";
		InputStream defaultConfig = null;
		Properties appconfig = null;

		try 
		{
			logger.info(METHOD_NAME + ":  Default config file =" + defaultConfigFile);
			Properties defaultConfigProps = new Properties();
			defaultConfig = ConfigurationManager.class.getClassLoader().getResourceAsStream(
					defaultConfigFile);
			if (defaultConfig != null) {
				defaultConfigProps.load(defaultConfig);
			}

			appconfig = new Properties(defaultConfigProps);
		} catch (IOException ioe) {
			logger.error("Unable load App Configuration file");
		}
		finally{
			try {
				if( defaultConfig != null)	defaultConfig.close();
			} catch (IOException e) {
				logger.error( METHOD_NAME + ":  Failed to close default config file = " + defaultConfigFile, e);
			}
		}
		
		return appconfig;
	}
	/*
	 * Load appConfig (overlaying the defaults) from the config file named by appConfigPropertyFileRef
	 */
	private void loadEnvironmentSpecificProperties(Properties properties)
	{
		String configFileName = System.getProperty("automation.configuration", defaultConfigFile);
		
		if(configFileName==null){
			return;
		}
		final String METHOD_NAME = "ConfigurationManager.loadEnvironmentSpecificProperties()";
		logger.info( METHOD_NAME + ":  config file=" + configFileName);
		
		InputStream configStream = null;

		try {
			configStream = ConfigurationManager.class.getClassLoader().getResourceAsStream(configFileName);
			if (configStream != null) 
			{
				properties.load(configStream);
			} 
		} catch (IOException e) {
			logger.error( "Failed to load config file " + configFileName, e);
		}
		finally
		{
			try {
				if( configStream != null)	configStream.close();
			} catch (IOException e) {
				logger.error( "Failed to close config file " + configFileName, e);
			}
		}
		dumpProperties(properties);
	}
	public String getProperty(String propertyName) 
	{
		return appConfig.getProperty(propertyName);
	}

}

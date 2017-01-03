package com.cardinalhealth.bpm.automation.util;

import org.apache.log4j.Logger;

public class LogManager
{
	private static LogManager logManager = null;

	private Logger appLogger = Logger.getLogger("com.cardinalhealth.vp.VitalPathAutomationLogger");
	private LogManager() {}

	public static LogManager getInstance() {
		if (logManager == null)
		{
			logManager = new LogManager();
		}
		return logManager;
	}

	public Logger getAppLogger()
	{
		return appLogger;
	}

}

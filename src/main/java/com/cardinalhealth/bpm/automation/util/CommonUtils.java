package com.cardinalhealth.bpm.automation.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CommonUtils {

	public static String getDateAndTimeString(){
		String dateString =null;
		Date now = new Date(System.currentTimeMillis());
		//Date now = new Date(System.nanoTime());
		//DateFormat f = new SimpleDateFormat("MM/dd/yyyy HH:MM");
		DateFormat f = new SimpleDateFormat("MMddyyyyHHMMSS");
		
		dateString=f.format(now);
		//System.out.println("dateString"+dateString);
		return dateString;
	}
}

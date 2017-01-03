package com.cardinalhealth.bpm.automation.view;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class TimeLogger {

	private static String fileName = "/users/deepak.kumar01/logs.csv";
	private static Date startTime;
	public TimeLogger() {
		super();
	}
	
	static{
		startTime =  getCurrentTime();
	}
	
	private static Date getCurrentTime(){
		return Calendar.getInstance().getTime();
	}

	protected static void resetTimer(){
		startTime = getCurrentTime();
	}
	protected static void WriteLog(String step){
		WriteLog(step, "true");
	}
	protected static void WriteLog(String step, String write)
   {
		try
		{
			if(write.equals("true")){
			    FileWriter writer = new FileWriter(fileName, true);
			    Date newTime = getCurrentTime();
			    double diff = ((double)(newTime.getTime() - startTime.getTime()))/1000;
			    
			    writer.write(step + "," + Double.toString(diff)+ "\n");
			    startTime = newTime;
			    writer.close();
			}
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
    }
}
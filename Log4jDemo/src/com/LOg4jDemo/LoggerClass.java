package com.LOg4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggerClass {
	
	public static Logger Log=Logger.getLogger(LoggerClass.class.getName());
	

	public static void startTestCase(String sTestCase) {
		
		Log.info("STARTED"+"============="+sTestCase+"=========="+"STARTED");
	}
	
	public static void endTestCase(String sTestCase) {
		
		Log.info("ENDED"+"============="+sTestCase+"=========="+"ENDED");
	}
	
	public static void info(String message) {
		
		Log.info(message);
	}
	
	public static void debug(String message) {
		
		Log.info(message);	
	}
	
public static void fatal(String message) {
		
		Log.fatal(message);	
	}

public static void error(String message) {
	
	Log.error(message);	
}

}

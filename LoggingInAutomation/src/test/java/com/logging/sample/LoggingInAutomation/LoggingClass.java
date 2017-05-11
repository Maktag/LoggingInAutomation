package com.logging.sample.LoggingInAutomation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingClass 
{
	Logger logger=Logger.getLogger("LoggingClass");
	// configure log4j properties file
    
	@BeforeClass
	public void Log()
		{
			PropertyConfigurator.configure("Log4j.properties");
		}
	
	@Test
	public void start()
		{
		    // Open browser
		        System.out.println("");
		        logger.info("Printing first.");
		      
		        System.out.println();
		        logger.info("Printing second.");
		}
}

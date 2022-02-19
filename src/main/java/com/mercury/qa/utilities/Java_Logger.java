package com.mercury.qa.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_Logger {
	

	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
			public static void log(String msg) {
				LOGGER.log(Level.INFO, msg);
			}
			
}

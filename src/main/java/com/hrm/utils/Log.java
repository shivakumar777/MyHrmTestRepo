package com.hrm.utils;

import org.apache.log4j.Logger;

public class Log {
	
	private static Logger logs = Logger.getLogger(Log.class.getName());
	
	public static void info(String message) {
		logs.info(message);
	}

	public static void main(String[] args) {
		info("jhjh");
	}
}

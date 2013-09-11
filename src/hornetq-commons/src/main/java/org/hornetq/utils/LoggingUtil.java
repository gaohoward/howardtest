package org.hornetq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingUtil {
	
	private static SimpleDateFormat format = new SimpleDateFormat("MM:dd-HH:mm:ss:SSS");

	public static String getCurrentTime()
	{
		Date d = new Date();
		return format.format(d);
	}
	
	public static void main(String[] args)
	{
	   Date d = new Date();
	   long time = d.getTime();
	   
	   System.out.println("time is " + time);
	   
	   Date e = new Date(1332240416920l);
	   System.out.println("now is : " + format.format(e));
	}

}



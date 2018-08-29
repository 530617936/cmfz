package com.baizhi.util;

import java.text.SimpleDateFormat;

public class DateConvertUtils {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static java.util.Date toUtilDate(String date){
		try{
			return sdf.parse(date);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null ;
	}

	public static java.sql.Date toSqlDate(java.util.Date utilDate){
		return new java.sql.Date(utilDate.getTime());
	}

	public static String toString(java.util.Date date){
		return sdf.format(date);
	}
	
	
	
	
}

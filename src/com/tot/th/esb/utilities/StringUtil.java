package com.tot.th.esb.utilities;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class StringUtil {
	
	
	public static boolean isNotBlank(String str) {
		if(str == null) return false;
		if(str.replace(" ", "").trim().equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}
	
}

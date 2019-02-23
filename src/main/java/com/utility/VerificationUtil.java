package com.utility;

import org.junit.Assert;

public class VerificationUtil {
	public static void areEqual(String expected, String actual){
		try {
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			//System.out.println("expected value "+expected+ " : actual value "+ actual);
			e.printStackTrace();
		}
	}

}

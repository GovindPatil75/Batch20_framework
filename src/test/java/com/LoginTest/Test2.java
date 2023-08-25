package com.LoginTest;

import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;

public class Test2 extends BaseClass {
	
	@Test
	public void verifyLoginTest_2() throws Exception {
		
		//Library.custom_SendKeys(null, null);
		Library.capture_Screenshot(driver);
		
		excel.getStringData_Excel("Login", 0, 0);
		
	}

}

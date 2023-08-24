package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{
	
	@Test
	public void verifyLogin() throws Exception {
		System.out.println("Test 1");
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String EmailData=excel.getStringData_Excel("Login", 0, 0);
		String PwdData=excel.getStringData_Excel("Login", 0, 1);
		
		Library.custom_SendKeys(login.getTxt_Email(), EmailData);
		Library.custom_SendKeys(login.getTxt_Password(), PwdData);
		Library.custom_Click(login.getBtn_login());
		
		String ActualTitle=driver.getTitle(); //
		String ExpectedTitle="ABC";
		
		String location=System.getProperty("user.dir");
		System.out.println(location);
		
		/*
		//Library.Handle_DropDown(null, ExpectedTitle);
		Library.handle_Rightclick(driver, null);
		Library.handle_Doubleclick(driver, null);
		
		Library.capture_Screenshot(driver);
		
		//Verify
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		*/
	}

}

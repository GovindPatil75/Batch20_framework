package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AddToCartPom;
import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_Aniket_Jambaldare extends BaseClass {

	@Test
	public void VerifyAddToCart(){
		
		
		AddToCartPom login=PageFactory.initElements(driver, AddToCartPom.class);
		
		String EmailData=excel.getStringData_Excel("Login", 1, 0);
		
		Library.custom_SendKeys(login.getTxt_Email(), EmailData, "AddToCart");
		
		Library.custom_Click(login.getTxt_srchSym(), "SrchSym");
	}
}

package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPom {

	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	private WebElement txt_srchBar;
	
	@FindBy(how=How.XPATH,using="//input[@id='nav-search-submit-button']")
	private WebElement txt_srchSym;
	
	@FindBy(how=How.XPATH,using="(//span[@class='a-truncate-cut'])[4]")
	private WebElement txt_mobile;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	private WebElement btn_AddToCart;
	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	private WebElement txt_Email;
	
	public WebElement getTxt_srchBar() {
		return txt_srchBar;
	}


	public WebElement getTxt_srchSym() {
		return txt_srchSym;
	}


	public WebElement getTxt_mobile() {
		return txt_mobile;
	}

	
	public WebElement getBtn_AddToCart() {
		return btn_AddToCart;
	}


	public WebElement getTxt_Email() {
		return txt_Email;
	}
}

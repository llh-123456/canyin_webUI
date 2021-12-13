package com.icbc.Imoocweb.Handle;

import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Page.SureSubmitPage;

public class SureSubmitHandle extends BaseHandle{
	public SureSubmitPage suresubmitpage;
	public WebDriver driver;

	public SureSubmitHandle(WebDriver driver) {
		super(driver);
		this.driver = driver;
		suresubmitpage = new SureSubmitPage(driver);
		// TODO Auto-generated constructor stub
	}
	public void ClickSureSubmit() throws Exception{
		/*
		 * 点击确认订单按钮
		 * */
		suresubmitpage.GetSureSubmitElement().click();
	}
	public void SetUserCookie() {
		new BaseHandle(driver).SteCookie();
	}

}

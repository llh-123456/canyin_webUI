package com.icbc.Imoocweb.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SureSubmitPage extends BasePage{
	public BasePage basepage;
	public SureSubmitPage(WebDriver driver){
		super(driver);
		super.FilePath = "element.properties";
	}
	
	//定位提交按钮
	public WebElement GetSureSubmitElement() throws Exception{
		return GetElement("submit_order");
	}

}

package com.icbc.Imoocweb.Util;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Page.BasePage;

public class SchoolFoodManagePage extends BasePage{
	Logger logger = Logger.getLogger(SchoolFoodManagePage.class);
	public SchoolFoodManagePage(WebDriver driver) {
		super(driver);
		super.FilePath = "element/schoolfood.properties";
	}

}

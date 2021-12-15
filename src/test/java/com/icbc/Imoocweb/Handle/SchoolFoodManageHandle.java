package com.icbc.Imoocweb.Handle;

import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Util.SchoolFoodManagePage;

public class SchoolFoodManageHandle extends BaseHandle{
	public SchoolFoodManagePage schoolfoodmanagepage;
	//构造器:初始化出来page页面
	public SchoolFoodManageHandle(WebDriver driver) {
		super(driver);
		schoolfoodmanagepage = new SchoolFoodManagePage(driver);
		
	}

}

package com.icbc.Imoocweb.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

public class FoodCompanyManagePage extends BasePage{
	Logger logger = Logger.getLogger(FoodCompanyManagePage.class);
	public WebDriver driver;
	public FoodCompanyManagePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//获取市场区域管理菜单元素
	public WebElement GetAreaMenuEle() throws Exception {
		logger.debug("获取市场区域管理菜单元素");
		return GetElement("area_manage_menu");
	}
	//获取配餐公司管理元素
	public WebElement GetFoodCompMenuEle() throws Exception {
		logger.debug("获取配餐公司管理元素");
		return GetElement("food_company_menu");
	}	
	//获取新增配餐公司按钮元素
	public WebElement GetAddFoodCompEle() throws Exception {
		logger.debug("获取新增配餐公司按钮元素");
		return GetElement("add_foodcompany_ele");
	}	
	//获取配餐公司名称元素
	public WebElement GetFoodCompNameEle() throws Exception {
		logger.debug("获取配餐公司名称元素");
		return GetElement("foodcompany_name_ele");
	}	
	//获取配餐公司子商户ID元素
	public WebElement GetFoodCompNnmberEle() throws Exception {
		logger.debug("获取配餐公司子商户ID元素");
		return GetElement("merchantID_ele");
	}	
	//获取配餐公司联系人元素
	public WebElement GetFoodCompContactEle() throws Exception {
		logger.debug("获取配餐公司联系人元素");
		return GetElement("contact_person_ele");
	}		
	//获取配餐公司手机号元素
	public WebElement GetFoodCompMobileEle() throws Exception {
		logger.debug("获取配餐公司手机号元素");
		return GetElement("mobile_ele");
	}		
	//获取配餐公司邮箱元素
	public WebElement GetFoodCompEmailEle() throws Exception {
		logger.debug("获取配餐公司邮箱元素");
		return GetElement("email_ele");
	}		
	//获取配餐公司地址元素
	public WebElement GetFoodCompAddressEle() throws Exception {
		logger.debug("获取配餐公司地址元素");
		return GetElement("address_ele");
	}	
	//获取新增-保存元素
	public WebElement GetFoodCompSaveEle() throws Exception {
		logger.debug("获取新增-保存元素");
		return GetElement("add_save");
	}	
	//获取配餐公司输入搜索框元素
	public WebElement GetFoodCompBoxEle() throws Exception {
		logger.debug("获取配餐公司输入搜索框元素");
		return GetElement("foodcompany_box");
	}	
	//获取配餐公司查询按钮元素
	public WebElement GetFoodCompSearchEle() throws Exception {
		logger.debug("获取配餐公司查询按钮元素");
		return GetElement("search_ele");
	}		
	//获取选中元素
	public WebElement GetFoodCompChooseEle() throws Exception {
		logger.debug("获取选中元素");
		return GetElement("choose_ele");
	}			
	//获取修改按钮元素
	public WebElement GetFoodCompEditEle() throws Exception {
		logger.debug("获取修改按钮元素");
		return GetElement("edit_ele");
	}			
	//获取修改配餐公司名称元素
	public WebElement GetEditFoodCompNameEle() throws Exception {
		logger.debug("获取修改配餐公司名称元素");
		return GetElement("edit_companyname_ele");
	}		
	//获取修改配餐公司联系人元素
	public WebElement GetEditFoodCompContactEle() throws Exception {
		logger.debug("获取修改配餐公司联系人元素");
		return GetElement("edit_contact_ele");
	}	
	//获取修改配餐公司手机号元素
	public WebElement GetEditFoodCompMobileEle() throws Exception {
		logger.debug("获取修改配餐公司手机号元素");
		return GetElement("edit_mobile_ele");
	}		
	//获取修改配餐公司邮箱元素
	public WebElement GetEditFoodCompMailEle() throws Exception {
		logger.debug("获取修改配餐公司邮箱元素");
		return GetElement("edit_email_ele");
	}	
	
	//获取修改配餐公司地址元素
	public WebElement GetEditFoodCompAddressEle() throws Exception {
		logger.debug("获取修改配餐公司地址元素");
		return GetElement("edit_address_ele");
	}		
	//获取修改保存元素
	public WebElement GetEditFoodCompSaveEle() throws Exception {
		logger.debug("获取修改保存元素");
		return GetElement("edit_save");
	}		
	
	
}

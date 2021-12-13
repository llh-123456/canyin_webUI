package com.icbc.Imoocweb.Page;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ManagerPage extends BasePage{
	Logger logger = Logger.getLogger(ManagerPage.class);
	public ManagerPage(WebDriver driver) {
		super(driver);
		super.FilePath = "element\\membermanag.properties";
		
	}
	//找到会员管理
	public WebElement ManagementMenu() throws Exception{
		logger.debug("获取会员管理一级菜单");
		return GetElement("membermanager");
	}
	//点击管理员
	public WebElement ManagerMenu() throws Exception{
		logger.debug("获取管理员二级菜单");
		return GetElement("manager");
	}
	//获取管理员-新增按钮
	public WebElement GetAddManager() throws Exception{
		logger.debug("获取管理员页面-新增按钮");
		return GetElement("add_manager");
	}
	//获取新增管理员-用户名称输入框
	public WebElement GetUserNameEle() throws Exception{
		logger.debug("管理员新增页面-获取用户名称元素");
		return GetElement("bank_user_name");
	}
	/*
	 * 获取元素对应的输入值
	 */
	public String GetUserNameSendKey() {
		logger.debug("输入用户名称");
		return GetEleSendKey("bank_user_name");	
	}
	/*
	 * 获取新增管理员-管理员类型下拉框
	 * 
	 */
	public WebElement GetBankUserTypeEle() throws Exception {
		logger.debug("管理员新增页面-获取用户类型元素");
		return GetElement("bank_type");
	}
	//获取银行管理员类型
	public WebElement BankMagType() throws Exception{
		logger.debug("管理员新增页面-获取银行管理员元素");
		return GetElement("bank_type_choose");
	}
	//获取新增管理员-管理员手机号
	public WebElement GetMobileEle() throws Exception{
		logger.debug("管理员新增页面-获取用户手机号元素");
		return GetElement("bank_user_phone");
	}
	//获取新增管理员-管理员手机号值
	public String GetMobileSendKey() {
		logger.debug("输入手机号");
		return GetEleSendKey("bank_user_phone");
		
	}
	//获取新增管理员-管理员机构名称
	public WebElement GetBankUserInsEle() throws Exception{
		logger.debug("管理员新增页面-获取管理员机构元素");
		return GetElement("bank_ins_info");
	}
	//获取新增管理员-管理员机构-河南分行元素的位置
	public WebElement GetBankInsEle() throws Exception{
		logger.debug("获取新增管理员-管理员机构-河南分行元素的位置");
		return GetElement("bank_ins_choose");
	}
	//获取新增管理员-保存元素
	public WebElement GetAddSaveEle() throws Exception{
		logger.debug("获取新增管理员-保存元素");
		return GetElement("add_save");
	}	
	//获取管理员页面-管理员手机号输入框
	public WebElement GetMobileBox() throws Exception{
		logger.debug("管理员Page页面-获取手机号输入框元素");
		return GetElement("search_user_mobile");
	}	
	//获取管理员页面-查询按钮元素
	public WebElement SearchEle() throws Exception{
		logger.debug("管理员Page页面-获取查询按钮元素");
		return GetElement("search_ele");
	}
	/*
	 * 管理员编辑页面元素
	 */
	//获取管理员页面-“选择”元素
	public WebElement ChooseEle() throws Exception{
		logger.debug("获取管理员页面-“选择”元素");
		return GetElement("choose_manager");
	}

	//获取管理员页面-编辑按钮元素
	public WebElement EditManagerEle() throws Exception{
		logger.debug("获取管理员页面-编辑按钮元素");
		return GetElement("edit_managere");
	}
	//获取管理员页面-编辑用户名称
	public WebElement EditManagerNameEle() throws Exception{
		logger.debug("获取管理员页面-编辑用户名称元素");
		return GetElement("edit_manager2_name");
	}
	//获取管理员页面-重新输入用户名称
	public String EditManagerNameSendKey() throws Exception{
		logger.debug("获取管理员页面-重新输入用户名称");
		return GetEleSendKey("edit_manager2_name");
	}
	//获取管理员页面-编辑用户机构
	public WebElement EditManagerInsEle() throws Exception{
		logger.debug("获取管理员页面-编辑用户机构元素");
		return GetElement("edit_manager3_ins");
	}	
	//获取管理员页面-编辑用户机构-其他机构
	public WebElement EditManagerInsInputEle() throws Exception{
		logger.debug("获取管理员页面-编辑用户机构元素");
		return GetElement("edit_manager4_input");
	}	
	//获取管理员-编辑页面-保存按钮元素
	public WebElement EditSaveEle() throws Exception{
		logger.debug("获取管理员-编辑页面-保存按钮元素");
		return GetElement("edit_save");
	}	
	//获取管理员页面-删除按钮元素
	public WebElement DeleteManagerEle() throws Exception{
		logger.debug("获取管理员页面-删除按钮元素");
		return GetElement("delete_manager");
	}		
	//获取管理员-删除-确定按钮元素
	public WebElement DaleteSureEle() throws Exception{
		logger.debug("获取管理员-删除-确定按钮元素");
		return GetElement("delete_sure");
	}
	
	
}

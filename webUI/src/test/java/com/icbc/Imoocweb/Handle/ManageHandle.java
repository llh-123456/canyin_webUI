package com.icbc.Imoocweb.Handle;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.icbc.Imoocweb.Page.BasePage;
import com.icbc.Imoocweb.Page.ManagerPage;

public class ManageHandle extends BaseHandle{
	Logger logger = Logger.getLogger(ManageHandle.class);
	public ManagerPage managerpage;
	public ManageHandle(WebDriver driver) {
		super(driver);
		managerpage = new ManagerPage(driver);
		
	}
	//点击会员管理一级菜单
	public void ClickManagementMenu() throws Exception{
		logger.debug("点击会员管理一级菜单");
		managerpage.ManagementMenu().click();
		Thread.sleep(1000);
		
	}
	//点击会员管理-管理员 二级菜单
	public void ClickManagerMenu() throws Exception{
		logger.debug("点击会员管理-管理员 二级菜单");
		managerpage.ManagerMenu().click();
		Thread.sleep(1000);
	}
	//点击 管理员-新增按钮
	public void ClickAddHandle() throws Exception{
		logger.debug("点击管理员-新增按钮");
		managerpage.GetAddManager().click();
		Thread.sleep(1000);
	}
	//管理员新增-点击用户名称，输入用户名称
	public void InputBankUserName() throws Exception{
		logger.debug("管理员新增-点击用户名称，输入用户名称");
		WebElement e = managerpage.GetUserNameEle();
		e.click();
		e.sendKeys(managerpage.GetUserNameSendKey());
		Thread.sleep(1000);
	}
	

	//管理员新增-点击用户类型，输入用户类型
	public void InputBankUserType() throws Exception{
		logger.debug("管理员新增-点击用户类型，输入用户类型");
		managerpage.GetBankUserTypeEle().click();
		managerpage.BankMagType().click();
		Thread.sleep(2000);
	}
	
	//管理员新增-点击手机号，输入手机号
	public void InputBankUserPhone() throws Exception{
		logger.debug("管理员新增-点击手机号，输入手机号");
		managerpage.GetMobileEle().click();
		managerpage.GetMobileEle().sendKeys(managerpage.GetMobileSendKey());
		Thread.sleep(1000);
	}	
	
	//管理员新增-点击机构，输入机构
	public void InputBankUserIns() throws Exception{
		logger.debug("管理员新增-点击机构，输入机构");
		managerpage.GetBankUserInsEle().click();
		managerpage.GetBankInsEle().click();
		Thread.sleep(1000);
	}	
	//管理员新增-点击保存
	public void ClickSave() throws Exception{
		logger.debug("管理员新增-点击保存");
		managerpage.GetAddSaveEle().click();
		Thread.sleep(1000);
	}	
	//手机号输入框输入手机号
	public void SearchMobileUser() throws Exception{
		logger.debug("管理员页面，点击手机号输入框，输入手机号");
		managerpage.GetMobileBox().click();
		managerpage.GetMobileBox().sendKeys(managerpage.GetMobileSendKey());
		Thread.sleep(2000);
	} 
	//管理员页面-点击查询
	public void SearchUserMsg() throws Exception{
		logger.debug("管理员页面，点击查询");
		managerpage.SearchEle().click();
		Thread.sleep(2000);
	}
	/*
	 * 管理员编辑操作
	 */
	//管理员页面-点击选中
	public void ClickChoose() throws Exception{
		logger.debug("管理员页面-点击选中");
		String jsstring = "document.getElementsByClassName(\'el-radio__inner\')[0].click()";//因为是elements
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsstring);  
		Thread.sleep(2000);
	}
	//管理员页面-点击编辑
	public void ClickEdit() throws Exception{
		logger.debug("管理员页面-点击修改");
		managerpage.EditManagerEle().click();
	}
	//管理员编辑页面-修改银行管理员名称
	public void EditBankManagerName() throws Exception{
		logger.debug("管理员编辑页面-修改银行管理员名称");
		managerpage.EditManagerNameEle().click();
		Thread.sleep(1000);
		managerpage.EditManagerNameEle().clear();
		Thread.sleep(1000);
		managerpage.EditManagerNameEle().sendKeys(managerpage.EditManagerNameSendKey());
	}
	//管理员编辑页面-修改银行管理员机构
	public void EditBankManagerIns() throws Exception{
		logger.debug("管理员编辑页面-修改银行管理员机构");
		managerpage.EditManagerInsEle().click();
		Thread.sleep(1000);
		managerpage.EditManagerInsEle().clear();
		managerpage.EditManagerInsInputEle().click();
		Thread.sleep(1000);
	}	
	//管理员编辑页面-修改信息保存
	public void EditSave() throws Exception{
		logger.debug("管理员编辑页面-点击保存");
		managerpage.EditSaveEle().click();
		Thread.sleep(1000);
	}
	/*
	 * 管理员删除操作
	 */
	public void DeleteManagerHandle() throws Exception{
		logger.debug("管理员删除操作开始");
		managerpage.DeleteManagerEle().click();
		Thread.sleep(2000);
		managerpage.DaleteSureEle().click();
		Thread.sleep(1000);
	}

}

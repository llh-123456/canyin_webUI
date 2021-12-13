package com.icbc.Imoocweb.Case;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.icbc.Imoocweb.Handle.ManageHandle;
import com.icbc.Imoocweb.Util.ProUtil;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;


@Listeners(TestCaseListenerScreen.class)
public class ManagerCase extends BaseCase{
	public WebDriver driver;
	Logger logger = Logger.getLogger(ManagerCase.class);
	public ManageHandle managerhandle;
	String mall4url1;
	String mall4url2;
	public ManagerCase() {
		ProUtil proutil = new ProUtil("environment.properties");
		mall4url1 = proutil.GetPro("mall4_url1");
		mall4url2 = proutil.GetPro("mall4_url2");
	}
	
	
	@BeforeClass
	public void beforeclass() throws Exception{
		driver = GetDriver("chrome");
		managerhandle = new ManageHandle(driver); 
		driver.get(mall4url1);
		Thread.sleep(2000);
		driver.get(mall4url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);		
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	/*
	 * 1、打开管理员页面
	 */
	@Test
	public void OpenManagerPageCase() throws Exception{
		logger.debug("管理员页面case开始~~~~~");
		logger.debug("点击一级菜单case成功");
		managerhandle.ClickManagementMenu();
		logger.debug("点击二级菜单case成功");
		managerhandle.ClickManagerMenu();
	}
	/*
	 * 2、新增银行管理员
	 */
	@Test
	public void AddBankManagerCase() throws Exception{
		logger.debug("点击新增按钮case成功");
		managerhandle.ClickAddHandle();
		logger.debug("点击用户名、输入用户名case成功");
		managerhandle.InputBankUserName();
		logger.debug("点击用户类型、输入用户类型case成功");
		managerhandle.InputBankUserType();
		logger.debug("点击用户手机号、输入用户手机号case成功");
		managerhandle.InputBankUserPhone();
		logger.debug("点击用户机构、输入用户机构case成功");
		managerhandle.InputBankUserIns();
		logger.debug("点击保存case成功");
		managerhandle.ClickSave();	
	}
	/*
	 * 3、管理员查询
	 */
	@Test
	public void SearchManagerCase() throws Exception{
		logger.debug("管理员页面输入手机号查询case开始");
		managerhandle.SearchMobileUser();
		managerhandle.SearchUserMsg();
		System.out.println("查询case执行成功");
		
	}
	/*
	 * 4、管理员编辑
	 */
	@Test
	public void EditBankManagerCase() throws Exception {
		logger.debug("管理员编辑case开始");
		managerhandle.ClickChoose();
		managerhandle.ClickEdit();
		managerhandle.EditBankManagerName();
		managerhandle.EditBankManagerIns();
		managerhandle.EditSave();
		System.out.println("管理员信息编辑成功");
		
	}
	/*
	 * 5、管理员删除
	 */
	@Test
	public void DeleteManagerCase() throws Exception {
		logger.debug("管理员删除case开始");
		managerhandle.ClickChoose();
		managerhandle.DeleteManagerHandle();
		System.out.println("管理员删除成功");
	}
	}	



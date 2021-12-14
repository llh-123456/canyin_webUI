package com.icbc.Imoocweb.Case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Handle.FoodCompanyManageHandle;
import com.icbc.Imoocweb.Util.ProUtil;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;
@Listeners(TestCaseListenerScreen.class)
public class FoodCompanyMangeCase extends BaseCase{
	Logger logger = Logger.getLogger(FoodCompanyMangeCase.class);
	FoodCompanyManageHandle foodcompanyhandle;
	public WebDriver driver;
	String mall4_url1;
	String mall4_url2;
	public FoodCompanyMangeCase() {
		ProUtil pro = new ProUtil("environment.properties");
		mall4_url1 = pro.GetPro("mall4_url1");
		mall4_url2 = pro.GetPro("mall4_url2");
	}
	//case开始之前操作
	@BeforeClass
	public void beforeclass() throws Exception {
		driver=GetDriver("chrome");
		foodcompanyhandle = new FoodCompanyManageHandle(driver);
		driver.get(mall4_url1);
		driver.get(mall4_url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//case结束后操作
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	/*
	 * 打开配餐公司页面
	 */
	@Test(priority=0)
	public void OpenFoodCompanyPage() throws Exception {
		logger.debug("打开配餐公司页面case");
		foodcompanyhandle.ClickAreaMenu();
		Thread.sleep(2000);
		foodcompanyhandle.ClickFoodCompanyMenu();
		Thread.sleep(2000);
	}
	/*
	 * 新增配餐公司
	 */
	@Test(priority=1)
	public void AddFoodCompany() throws Exception {
		foodcompanyhandle.ClickAddFoodCompany();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyName();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyID();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyContact();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyMoible();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyMail();
		Thread.sleep(1000);
		foodcompanyhandle.ClickFoodCompanyAdress();
		Thread.sleep(1000);
		foodcompanyhandle.ClickAddSave();
		Thread.sleep(3000);
	}
	
	/*
	 * 查询配餐公司
	 */
	@Test(priority=2)
	public void SearchFoodCompany() throws Exception {
		foodcompanyhandle.ClickFoodCompanyBox();
		Thread.sleep(2000);
		foodcompanyhandle.ClickSearch();
		Thread.sleep(2000);
	}
	/*
	 * 修改配餐公司
	 */
	@Test(priority=3)
	public void EditFoodCompany() throws Exception {
		foodcompanyhandle.ClickChoose();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEdit();
		Thread.sleep(3000);
		foodcompanyhandle.ClickEditFoodCompName();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEditFoodCompContact();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEditFoodCompMobile();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEditFoodCompMail();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEditFoodCompAdress();
		Thread.sleep(1000);
		foodcompanyhandle.ClickEditSave();
		Thread.sleep(1000);
	}
	
	
}

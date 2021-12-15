package com.icbc.Imoocweb.Case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Handle.SchoolFoodManageHandle;
import com.icbc.Imoocweb.Util.ProUtil;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;
@Listeners(TestCaseListenerScreen.class)
public class SchoolFoodManageCase extends BaseCase{
	Logger logger = Logger.getLogger(SchoolFoodManageCase.class);
	public SchoolFoodManageHandle schoolfoodmanagehandle;
	public WebDriver driver;
	String mall4_url1;
	String mall4_url2;
	//构造器：初始化链接地址、driver
	public SchoolFoodManageCase() {
		ProUtil proutil = new ProUtil("environment.properties");
		mall4_url1 = proutil.GetPro(mall4_url1);
		mall4_url2 = proutil.GetPro(mall4_url2);
		
	}
	
	@BeforeClass
	public void beforeclass() throws Exception {
		//调用Driver初始化
		driver = GetDriver("chrome");
		schoolfoodmanagehandle = new SchoolFoodManageHandle(driver);
		driver.get(mall4_url1);
		driver.get(mall4_url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}

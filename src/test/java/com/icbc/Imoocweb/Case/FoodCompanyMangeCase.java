package com.icbc.Imoocweb.Case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Handle.FoodCompanyManageHandle;
import com.icbc.Imoocweb.Util.ProUtil;

public class FoodCompanyMangeCase extends BaseCase{
	Logger logger = Logger.getLogger(FoodCompanyMangeCase.class);
	FoodCompanyManageHandle foodcompanyhandle;
	public WebDriver driver;
	String mall4_url1;
	String mall4_url2;
	public FoodCompanyMangeCase() {
		ProUtil proutil = new ProUtil("environment.properties");
		mall4_url1 = proutil.GetPro(mall4_url1);
		mall4_url2 = proutil.GetPro(mall4_url2);
	}
	//case开始之前操作
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		driver=GetDriver("chrome");
		foodcompanyhandle = new FoodCompanyManageHandle(driver);
		driver.get(mall4_url1);
		driver.get(mall4_url2);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	//case结束后操作
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}

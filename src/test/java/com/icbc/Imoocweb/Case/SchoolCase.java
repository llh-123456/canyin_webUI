package com.icbc.Imoocweb.Case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Handle.SchoolHandle;
import com.icbc.Imoocweb.Util.ProUtil;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;

@Listeners(TestCaseListenerScreen.class)
public class SchoolCase extends BaseCase{
	public SchoolHandle schoolhandle;
	public WebDriver driver;
	Logger logger = Logger.getLogger(SchoolCase.class);
	String mall4_url1;
	String mall4_url2;
	//构造器：
	public SchoolCase() {
		ProUtil proutil = new ProUtil("environment.properties");
		mall4_url1 = proutil.GetPro(mall4_url1);
		mall4_url2 = proutil.GetPro(mall4_url2);
	}
	
	
	//前置条件:初始化浏览器
	@BeforeClass
	public void beforeclass() throws Exception  {
		driver = GetDriver("chrome");
		schoolhandle = new SchoolHandle(driver);
		driver.get(mall4_url1);
		driver.get(mall4_url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//结束条件
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}

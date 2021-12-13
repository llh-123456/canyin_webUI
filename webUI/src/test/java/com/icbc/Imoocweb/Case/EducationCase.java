package com.icbc.Imoocweb.Case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.icbc.Imoocweb.Handle.EducationHandle;
import com.icbc.Imoocweb.Util.ProUtil;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;

@Listeners(TestCaseListenerScreen.class)
public class EducationCase extends BaseCase{
	Logger logger = Logger.getLogger(EducationCase.class);
	public EducationHandle educationhandle;
	public WebDriver driver;
	String mall1_url1;
	String mall1_url2;
	//构造器：设置浏览器链接；读取配置文件
	public EducationCase() {
		ProUtil proutil = new ProUtil("environment.properties");
		mall1_url1 = proutil.GetPro("mall1_url1");
		mall1_url2 = proutil.GetPro("mall1_url2");		
	}
	//初始化开始
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		driver = GetDriver("chrome");//初始化driver--chrome
		educationhandle = new EducationHandle(driver);
		driver.get(mall1_url1);
		driver.get(mall1_url2);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	//Testcase结束
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	
	//打开教育局页面
	@Test(priority=0)
	public void OpenEducationCase() throws Exception {
		logger.debug("市场区域testcase");
		educationhandle.ClickEareMenu();
		Thread.sleep(1000);
		logger.debug("教育局testcase");
		educationhandle.ClickEducationMenu();
		Thread.sleep(2000);
	}	

	//新增教育局testcase
	@Test(priority=1)
	public void AddEducationCase() throws Exception {
		logger.debug("新增按钮testcase");
		educationhandle.ClickAddEducation();
		Thread.sleep(3000);
		logger.debug("教育局名称testcase");
		educationhandle.ClickEducatoidName();
		Thread.sleep(2000);
		logger.debug("教育局编号testcase");
		educationhandle.ClickEducationNumber();
		Thread.sleep(2000);
		logger.debug("教育局联系人testcase");
		educationhandle.ClickEducatoinContact();
		Thread.sleep(2000);
		logger.debug("教育局手机号testcase");
		educationhandle.ClickEducatoinMobile();
		Thread.sleep(2000);
		logger.debug("教育局邮箱testcase");
		educationhandle.ClickEducationEmail();
		Thread.sleep(2000);
		logger.debug("教育局地址testcase");
		educationhandle.ClickEducatoinAdress();
		Thread.sleep(2000);
		educationhandle.ClickSave();
		Thread.sleep(1000);
		
	}	
	//查看教育局
	@Test(priority=2)
	public void SearchEducation() throws Exception {
		educationhandle.ClickEducatoinBox();
		Thread.sleep(1000);
		educationhandle.ClickSearch();
		Thread.sleep(2000);
	}
	
	//修改教育局信息
	@Test(priority=3)
	public void EditEducationCase() throws Exception{
		educationhandle.ChooseEducation();
		Thread.sleep(2000);
		educationhandle.EditEducation();
		Thread.sleep(1000);
		educationhandle.EditEducationName();
		Thread.sleep(1000);
		educationhandle.EditEducationContact();
		Thread.sleep(1000);
		educationhandle.EditEducationMobile();
		Thread.sleep(1000);
		educationhandle.EditEducationMail();
		Thread.sleep(1000);
		educationhandle.EditEducationAdddress();
		Thread.sleep(1000);
		educationhandle.EditSave();
		Thread.sleep(1000);
		
	}
}

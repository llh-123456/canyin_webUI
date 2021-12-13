package com.icbc.Imoocweb.Case;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.icbc.Imoocweb.Handle.SureSubmitHandle;
import com.icbc.Imoocweb.Util.TestCaseListenerScreen;

@Listeners(TestCaseListenerScreen.class)
public class SubminCase extends BaseCase{
	Logger logger = Logger.getLogger(SubminCase.class);
	public WebDriver driver;
	public SureSubmitHandle suresubmithandle;
	@BeforeClass
	public void beforeclass() {
		PropertyConfigurator.configure("log4j.properties");//指定配置文件
		driver = GetDriver("chrome");
		//driver.get("https://order.imooc.com/pay/confirm/goods_ids/1-269");
		suresubmithandle = new SureSubmitHandle(driver); 
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	//登录成功后，点击提交订单按钮
	@Test
	public void LoginSureSubmit() throws Exception{
		logger.debug("正确提交订单");
		driver.get("https://www.imooc.com/");
		driver.manage().window().maximize();
		suresubmithandle.SetUserCookie();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.get("https://order.imooc.com/pay/confirm/goods_ids/1-269");
		String submit_title = suresubmithandle.GetTitle();
		boolean flag = submit_title.contains("确认订单");
		Assert.assertEquals(flag, true);
		suresubmithandle.ClickSureSubmit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("登录成功校验通过");
		
		//driver.close();
		
	}
	//未登录，点击提交订单按钮
	@Test
	public void SureSubmit() {
		logger.error("不到确认订单页面");
		System.out.println("开始第二个test");
		driver.manage().deleteAllCookies();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.get("https://order.imooc.com/pay/confirm/goods_ids/1-269");
		String submit_title = suresubmithandle.GetTitle();
		boolean flag = submit_title.contains("登录");
		System.out.println(flag);
		
		Assert.assertEquals(flag, false);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("未登录校验不通过");
	}
	

}

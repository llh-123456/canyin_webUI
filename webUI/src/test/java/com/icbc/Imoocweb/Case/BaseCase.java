package com.icbc.Imoocweb.Case;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

import com.icbc.Imoocweb.Util.TestCaseListenerScreen;

/*
 * 封装浏览器
 * */

public class BaseCase {
	Logger logger = Logger.getLogger(BaseCase.class);
	public WebDriver driver;

	public WebDriver GetDriver(String browser) {
		PropertyConfigurator.configure("log4j.properties");//指定配置文件
		logger.debug("打开浏览器：");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\PJ_Project\\software_file\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("XX", "E:\\PJ_Project\\software_file\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}



package com.icbc.Imoocweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CommonTest {
	WebDriver driver;
	@Test
	public void InitDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\PJ_Project\\software_file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/user/newlogin/from_url/1005/");
		driver.close();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CommonTest commontest = new CommonTest();
//		commontest.InitDriver();
//	}

}

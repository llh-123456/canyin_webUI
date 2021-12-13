package com.icbc.Imoocweb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HandleCookie {
	public WebDriver driver;
  @BeforeClass
	public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver", "E:\\PJ_Project\\software_file\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
  }
  @Test
  public void test01() {
	  Set<Cookie> before_cookie = driver.manage().getCookies();
	  System.out.println(before_cookie);
	  String apsid_value = "gzYzFlZjZlNjk4MzFlYjIzZTBiNmJiZGY4MjAwMTQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzQ1MTczMwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyOTczMDA2OTM3QHFxLmNvbQAAAAAAAAAAAAAAAAAAAGJlZjVkZTk0YWM3NjRkODYzYmM3NzZlNDFhNWM5MGJlueCZYbngmWE%3DMT";
	  for(Cookie cookie:before_cookie) {
		  if(cookie.getName().equals("apsid")) {
			  System.out.println("登录成功，获取到cookie------>"+cookie);
		  }else {
			  Cookie after_cookie = new Cookie("apsid", apsid_value, ".imooc.com", "/", null);
			  driver.manage().addCookie(after_cookie);
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  driver.navigate().refresh();
		  }
	  }

  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://coding.imooc.com/class/303.html");
	  driver.manage().window().maximize();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod  执行完毕");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest~~~");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest~~~");
  }

}

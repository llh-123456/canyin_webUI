package com.icbc.Imoocweb.Handle;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Util.ProUtil;

public class BaseHandle {
	public WebDriver driver;
	public BaseHandle(WebDriver driver) {
		this.driver = driver;
	}

	//植入cookie
	public void SteCookie() {
		System.out.println("SteCookie");
		 //Set<Cookie> before_cookie = driver.manage().getCookies();
		 String apsid_value = "gzYzFlZjZlNjk4MzFlYjIzZTBiNmJiZGY4MjAwMTQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzQ1MTczMwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAyOTczMDA2OTM3QHFxLmNvbQAAAAAAAAAAAAAAAAAAAGJlZjVkZTk0YWM3NjRkODYzYmM3NzZlNDFhNWM5MGJlueCZYbngmWE%3DMT";
		 driver.manage().deleteAllCookies();
		 Cookie after_cookie = new Cookie("apsid", apsid_value, ".imooc.com", "/", null);
		 driver.manage().addCookie(after_cookie);
		 try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}	
	//获取title
	public String GetTitle() {
		return driver.getTitle();
	}


}

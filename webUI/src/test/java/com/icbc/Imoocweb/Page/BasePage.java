package com.icbc.Imoocweb.Page;


import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.icbc.Imoocweb.Util.ProUtil;

public class BasePage {
	Logger logger = Logger.getLogger(BasePage.class);
	public static WebDriver driver;
	public String FilePath;
	public BasePage(WebDriver driver) {
		this.driver = driver;	
	}
	
	//获取元素方法封装
	public By GetByLocator(String key) {
		String element;
		String value;
		String element_value;
		String element_by;
		ProUtil proutil = new ProUtil(FilePath);
		element = proutil.GetPro(key);
		element_by = element.split(">")[0];//name
		element_value = element.split(">")[1];//email
		if(element_by.equals("id")) {
			return By.id(element_value);
		}else if(element_by.equals("name")) {
			return By.name(element_value);
		}else if(element_by.equals("className")) {
			return By.className(element_value);
		}else {
			return By.xpath(element_value);
		}
	}

	/*
	 * 获取用户名称输入框内容
	 */
	public String GetEleSendKey(String key) {
		String element_send;
		String send_key_value;
		ProUtil proutil1 = new ProUtil(FilePath);
		element_send = proutil1.GetPro(key);
		send_key_value = element_send.split(">")[2];
		System.out.println(send_key_value);
		return send_key_value;
	}
//	//显示等待
//	public WebElement WaitForElement(By locator,int waitTime) throws Exception{
//		WebElement waitelem;
//		WebDriverWait wait = new WebDriverWait(driver,waitTime);
//		waitelem = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		return waitelem;
//	}
	//获取单个元素的值
	public WebElement GetElement(String key) throws Exception{
		//this.WaitForElement(this.GetByLocator(key), 10);
		WebElement element1 = driver.findElement(this.GetByLocator(key));
		return element1;
	}

	/*
	 * 获取一组元素的值
	 */
	public List<WebElement> GetElements(String key) throws Exception{
		List<WebElement> elements = driver.findElements(this.GetByLocator(key));
		return elements;
	}
	/*
	 * 根据标签获取一组元素
	 */
	public WebElement GetTagNameElements(String key) throws Exception{
		WebElement tag_element = driver.findElement(this.GetByLocator(key));
		return tag_element;
	}
	public void MoveElement(WebElement ToElement) {
		Actions actoin = new Actions(driver);
		actoin.moveToElement(ToElement).perform();
	}
	
	//随机手机号
	public String PhoneNumber() {
		String after_eight;
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		for(int i=0;i<8;i++) {
			str.append(random.nextInt(10));
		}
		//after_eight = Integer.parseInt(str.toString());//toString()----返回String类型；返回对象的字符串；返回一个“以文本方式表示”此对象的字符串
		after_eight = str.toString();
		String mobile = "189"+after_eight;
		return mobile;
		
	}
	

}

package com.icbc.Imoocweb.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.google.common.io.Files;
import com.icbc.Imoocweb.Case.BaseCase;
import com.icbc.Imoocweb.Case.ManagerCase;

public class TestCaseListenerScreen extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult tr) {
		BaseCase sc = (BaseCase)tr.getInstance();
		WebDriver driver = sc.driver;
		this.TakeScreenShot(driver);
		super.onTestFailure(tr);
	    
	  }
	
	//截图方法
	public void TakeScreenShot(WebDriver driver) {
		//图片存放路径TestCaseScreen路径下
		//getAbsolutePath()和getCanonicalPath()的不同之处在于，getCanonicalPath()
//		System.out.println(cur_path.getAbsoluteFile());
//		System.out.println(filepath.getCanonicalFile());
//		String cur_path = System.getProperty("E:\\PJ_Project\\Java\\Selenium\\Seleniumimooc\\Imoocweb\\TestCaseScreen");
		//图片名字：类+时间戳
		File cur_path = new File("E:\\PJ_Project\\Java\\Selenium\\Seleniumimooc\\Imoocweb\\TestCaseScreen");
		//获取当前类
		String cur_class = this.getClass().getName();
		//获取时间戳
		SimpleDateFormat simpdate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String cur_time = simpdate.format(new Date());
		String png_path = cur_path + "\\" + cur_class + cur_time + ".png";
		File srcfile = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(srcfile,new File(png_path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

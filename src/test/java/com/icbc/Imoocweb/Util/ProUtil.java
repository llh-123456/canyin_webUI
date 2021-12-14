package com.icbc.Imoocweb.Util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Random;

public class ProUtil {
	//全局变量
	public Properties Pro;
	//构造方法 读取配置文件
	public ProUtil(String FilePath) {
		Pro = ReadProperties(FilePath);
	}
	//读取配置文件方法 读取.properties文件
	private Properties ReadProperties(String FilePath) {
		Properties properties = new Properties();
		FileInputStream fileinputstream;
		try {
//			fileinputstream = new FileInputStream(FilePath);
//			BufferedInputStream In = new BufferedInputStream(fileinputstream);
			BufferedInputStream In = new BufferedInputStream(new FileInputStream(FilePath));
			
			try {
				//properties.load(In);//文件中有汉字，则会乱码
				properties.load(new InputStreamReader(In, "utf-8"));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return properties;
	}
	//取文件 
	public String GetPro(String key) {
		String Value;
		if(Pro.containsKey(key)) {
			Value = Pro.getProperty(key);
			System.out.println(Value);
			return Value;
		}else {
			return "";
		}
	}
	

	


}

package com.icbc.Imoocweb;

import java.util.Random;

public class ListDayone {
	//获取随机数
	public void RandomNumber() {
		String after_eight;
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		for(int i=0;i<8;i++) {
			str.append(random.nextInt(10));
		}
		//after_eight = Integer.parseInt(str.toString());//toString()----返回String类型；返回对象的字符串；返回一个“以文本方式表示”此对象的字符串
		after_eight = str.toString();
		String mobile = "189"+after_eight;
		System.out.println(mobile);
	}
	
	public static void main(String[] args) {
		ListDayone rn = new ListDayone();
		rn.RandomNumber();
		
	}

}

package com.icbc.Imoocweb.Util;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.MimeUtility;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.IExecutionListener;

public class TestCaseListenerEmail implements IExecutionListener{
	  public void onExecutionStart() {
		    System.out.println("所有case开始~~~~");
		  }
	  public void onExecutionFinish() {
		  System.out.println("所有case结束：开始发送报告~~~~");
		//用什么发送
			HtmlEmail htmlemail = new HtmlEmail();
			htmlemail.setHostName("smtp.qq.com");
			//登录邮箱
			htmlemail.setAuthentication("946308446@qq.com", "leqdkyqxywxkbdch");
			//发送方是谁
			try {
				htmlemail.setFrom("946308446@qq.com");
				//接收方是谁
				htmlemail.addTo("2973006937@qq.com");
				//标题
				htmlemail.setSubject("自动化UI执行结果");//标题
				//设置utf-8
				htmlemail.setCharset("UTF-8");
				//内容---附件形式
				htmlemail.setHtmlMsg("<a href=\"\">测试报告见附件内容");//附件内容展示
				//附件如何传递
				EmailAttachment emailattachment = new EmailAttachment();
				emailattachment.setPath("E:\\PJ_Project\\Java\\Selenium\\Seleniumimooc\\Imoocweb\\report.html");
				
				//emailattachment.setFileName(MimeUtility.encodeText("Selenium_测试报告_下载.html", "UTF-8", "B"));
				emailattachment.setName("Selenium_TestSuite.html");//附件名称-----报告中的文字时乱码，解决方案如下
//				解决方法一：
//				 MimeUtility.encodeText(attach.getName())
//				法二：
//				 MimeUtility.encodeText(name, "UTF-8", "B")
				emailattachment.setDescription(EmailAttachment.ATTACHMENT);
				htmlemail.attach(emailattachment);
				htmlemail.send();
				
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

}

package com.icbc.Imoocweb.Util;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class SendFileMail{
	public void SendMail() {
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
			htmlemail.setHtmlMsg("<a href=\"\">测试报告见附件");//邮件内容展示
			//附件如何传递
			EmailAttachment emailattachment = new EmailAttachment();
			emailattachment.setPath("E:\\PJ_Project\\Java\\Selenium\\Seleniumimooc\\Imoocweb\\report.html");
			emailattachment.setName("Selenium_TestSuite.html");//附件名称
			emailattachment.setDescription(EmailAttachment.ATTACHMENT);
			htmlemail.attach(emailattachment);
			htmlemail.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

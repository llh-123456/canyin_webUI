package com.icbc.Imoocweb.Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Page.EducationPage;

public class EducationHandle extends BaseHandle{
	public EducationPage educationpage;
	public EducationHandle(WebDriver driver) {
		super(driver);
		educationpage = new EducationPage(driver);
		
	}
	//点击市场区域管理菜单
	public void ClickEareMenu() throws Exception {
		educationpage.GetEaraMenu().click();
	}
	//点击教育局管理菜单
	public void ClickEducationMenu() throws Exception{
		educationpage.GetEducationMenu().click();
	}	
	//点击新增按钮
	public void ClickAddEducation() throws Exception {
		educationpage.GetAddEducation().click();
	}	
	//点击输入教育局名称
	public void ClickEducatoidName() throws Exception {
		educationpage.GetEducationName().sendKeys(educationpage.SendKeyEducationName());
	}	
	//
	//点击输入教育局编号
	public void ClickEducationNumber() throws Exception {
		//educationpage.GetEducationNnbmer().sendKeys("AA01");
		educationpage.GetEducationNnbmer().sendKeys(educationpage.SendKeyEducationNumber());
	}	
	//点击输入联系人
	public void ClickEducatoinContact() throws Exception {
		//educationpage.GetEducationContact().sendKeys("HH教育局的联系人");
		educationpage.GetEducationContact().sendKeys(educationpage.SendKeyEducationContact());
	}	
	//点击输入手机号
	public void ClickEducatoinMobile() throws Exception {
		educationpage.GetEducationMobile().sendKeys(educationpage.PhoneNumber());
	}	
	//点击输入邮箱
	public void ClickEducationEmail() throws Exception {
		//educationpage.GetEducationEmail().sendKeys("11@ww.xm");
		educationpage.GetEducationEmail().sendKeys(educationpage.SendKeyEducationMail());
	}	
	//点击输入地址
	public void ClickEducatoinAdress() throws Exception {
		//educationpage.GetEducationAdress().sendKeys("教育局地址");
		educationpage.GetEducationAdress().sendKeys(educationpage.SendKeyEducationAdress());
	}	
	//点击保存
	public void ClickSave() throws Exception {
		educationpage.GetSave().click();
	}	
	/*
	 * 搜索
	 */
	//点击输入框
	public void ClickEducatoinBox() throws Exception {
		educationpage.GetEducationNameBox().sendKeys(educationpage.SendKeyEducationName());
	}	
	//点击搜索
	public void ClickSearch() throws Exception {
		educationpage.GetSearchEle().click();
	}	
	/*
	 * 修改教育局
	 * 
	 */
	//点击选中
	public void ChooseEducation() throws Exception {
		educationpage.GetEChooseEle().click();
	}	
	//点击修改
	public void EditEducation() throws Exception {
		educationpage.GetEditEle().click();
	}	
	//修改教育局名称
	public void EditEducationName() throws Exception {
		educationpage.GetEditEduNameEle().clear();
		educationpage.GetEditEduNameEle().sendKeys(educationpage.SendKeyEditEduName());
	}	
	//修改教育局联系人
	public void EditEducationContact() throws Exception {
		educationpage.GetEditEduContactEle().clear();
		educationpage.GetEditEduContactEle().sendKeys(educationpage.SendKeyEditEduContact());
	}		
	//修改教育局手机号
	public void EditEducationMobile() throws Exception {
		educationpage.GetEditEduMobileEle().clear();
		educationpage.GetEditEduMobileEle().sendKeys(educationpage.PhoneNumber());
	}		
	//修改教育局邮箱
	public void EditEducationMail() throws Exception {
		educationpage.GetEditEduEmailEle().clear();
		educationpage.GetEditEduEmailEle().sendKeys(educationpage.SendKeyEditEduMail());
	}		
	//修改教育局地址
	public void EditEducationAdddress() throws Exception {
		educationpage.GetEditEduAdressEle().clear();
		educationpage.GetEditEduAdressEle().sendKeys(educationpage.SendKeyEditEduAdress());
	}	
	//修改完成-保存按钮
	
	public void EditSave() throws Exception {
		educationpage.GetEditSave().click();
	}
}

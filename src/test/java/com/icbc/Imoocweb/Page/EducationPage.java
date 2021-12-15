package com.icbc.Imoocweb.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EducationPage extends BasePage{
	Logger logger = Logger.getLogger(EducationPage.class);
	public EducationPage(WebDriver driver) {
		super(driver);
		super.FilePath = "element\\education.properties";
	}
	//获取市场区域管理菜单元素位置
	public WebElement GetEaraMenu()throws Exception {
		logger.debug("市场区域管理菜单");
		return GetElement("areamanagementmenu");
	}
	
	
	//获取区教育局管理二级菜单位置
	public WebElement GetEducationMenu() throws Exception {
		logger.debug("教育局管理二级菜单");
		return GetElement("educationmanagementmenu");
	}	
	
	//获取“新增”元素位置
	public WebElement GetAddEducation()throws Exception {
		logger.debug("新增元素");
		return GetElement("add_education_ele");
	}	
	
	//区教育局名称元素位置
	public WebElement GetEducationName()throws Exception {
		logger.debug("教育局名称元素");
		return GetElement("education_name_ele");
	}	
	//区教育局名称元素信息
	public String SendKeyEducationName() {
		return GetEleSendKey("education_name_ele");
	}
	
	//区教育局编号元素位置
	public WebElement GetEducationNnbmer()throws Exception {
		logger.debug("教育局编号元素");
		return GetElement("education_number_ele");
	}	
	//区教育局编号元素信息
	public String SendKeyEducationNumber() {
		return GetEleSendKey("education_number_ele");
	}	
	//联系人元素位置
	public WebElement GetEducationContact() throws Exception{
		logger.debug("联系人元素");
		return GetElement("contact_person_ele");
	}
	//区教育局联系人元素信息
	public String SendKeyEducationContact() {
		return GetEleSendKey("contact_person_ele");
	}
	//手机号元素位置
	public WebElement GetEducationMobile()throws Exception {
		logger.debug("手机号元素");
		return GetElement("mobile_ele");
	}
	//邮箱位置
	public WebElement GetEducationEmail() throws Exception{
		logger.debug("邮箱位置");
		return GetElement("email_ele");
	}	
	//区教育局邮箱元素信息
	public String SendKeyEducationMail() {
		return GetEleSendKey("email_ele");
	}	
	//详细地址位置
	public WebElement GetEducationAdress() throws Exception{
		logger.debug("详细地址");
		return GetElement("address_ele");
	}
	//区教育局地址元素信息
	public String SendKeyEducationAdress() {
		return GetEleSendKey("address_ele");
	}	
	//保存按钮
	public WebElement GetSave() throws Exception{
		logger.debug("点击保存按钮");
		return GetElement("save_ele");
	}	
	
	//搜索
	//区教育局名称搜索框元素
	public WebElement GetEducationNameBox() throws Exception{
		logger.debug("教育局名称搜索框");
		return GetElement("education_name_box");
	}
	//搜索框按钮元素
	public WebElement GetSearchEle() throws Exception{
		logger.debug("搜索框按钮元素");
		return GetElement("search_ele");
	}
	
	//修改教育局信息
	//选中按钮元素
	public WebElement GetEChooseEle() throws Exception{
		logger.debug("选中按钮元素");
		return GetElement("edit_choose_ele");
	}	
	//修改按钮元素
	public WebElement GetEditEle() throws Exception{
		logger.debug("修改框按钮元素");
		return GetElement("edit_ele");
	}	
	//修改教育局名称
	public WebElement GetEditEduNameEle() throws Exception{
		logger.debug("修改页面教育局名称元素");
		return GetElement("edit_name");
	}	
	//输入教育局修改名称
	public String SendKeyEditEduName() throws Exception{
		return GetEleSendKey("edit_name");
	}
	//修改教育局联系人
	public WebElement GetEditEduContactEle() throws Exception{
		logger.debug("修改页面教育局联系人元素");
		return GetElement("edit_contact");
	}
	public String SendKeyEditEduContact() throws Exception{
		return GetEleSendKey("edit_contact");
	}
	//修改教育局手机
	public WebElement GetEditEduMobileEle() throws Exception{
		logger.debug("修改页面教育局手机号元素");
		return GetElement("edit_mobile");
	}
	//修改教育局邮箱
	public WebElement GetEditEduEmailEle() throws Exception{
		logger.debug("修改页面教育局邮箱元素");
		return GetElement("edit_email");
	}
	public String SendKeyEditEduMail() throws Exception{
		return GetEleSendKey("edit_email");
	}
	//修改教育局地址
	public WebElement GetEditEduAdressEle() throws Exception{
		logger.debug("修改页面教育局地址元素");
		return GetElement("edit_adress");
	}
	public String SendKeyEditEduAdress() throws Exception{
		return GetEleSendKey("edit_adress");
	}
	//修改-保存
	public WebElement GetEditSave() throws Exception{
		logger.debug("修改页面保存按钮");
		return GetElement("edit_save");
	}
}

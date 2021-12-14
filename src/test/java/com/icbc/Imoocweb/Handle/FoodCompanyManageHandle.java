package com.icbc.Imoocweb.Handle;

import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Page.FoodCompanyManagePage;

public class FoodCompanyManageHandle extends BaseHandle{
	FoodCompanyManagePage foodcompanypage;
	//构造器；初始化page页面
	public FoodCompanyManageHandle(WebDriver driver) {
		super(driver);
		foodcompanypage = new FoodCompanyManagePage(driver);
	}
	//点击市场区域菜单
	public void ClickAreaMenu() throws Exception {
		foodcompanypage.GetAreaMenuEle().click();
	}
	//点击配餐公司菜单
	public void ClickFoodCompanyMenu() throws Exception {
		foodcompanypage.GetFoodCompMenuEle().click();
	}
	//点击新增配餐公司按钮
	public void ClickAddFoodCompany() throws Exception {
		foodcompanypage.GetAddFoodCompEle().click();
	}
	//点击输入配餐公司名称
	public void ClickFoodCompanyName() throws Exception {
		foodcompanypage.GetFoodCompNameEle().sendKeys(foodcompanypage.SendkeyFoodCompName());
	}
	//点击输入配餐公司子商户id
	public void ClickFoodCompanyID() throws Exception{
		foodcompanypage.GetFoodCompNnmberEle().sendKeys(foodcompanypage.Merchant_ID());
	}
	//点击输入配餐公司联系人
	public void ClickFoodCompanyContact() throws Exception {
		foodcompanypage.GetFoodCompContactEle().sendKeys(foodcompanypage.SendkeyFoodCompContact());
	}
	//点击输入配餐公司手机号
	public void ClickFoodCompanyMoible() throws Exception {
		foodcompanypage.GetFoodCompMobileEle().sendKeys(foodcompanypage.PhoneNumber());
	}
	//点击输入配餐公司邮箱
	public void ClickFoodCompanyMail() throws Exception {
		foodcompanypage.GetFoodCompEmailEle().sendKeys(foodcompanypage.RandomEmail());
	}
	
	//点击输入配餐公司地址
	public void ClickFoodCompanyAdress() throws Exception {
		foodcompanypage.GetFoodCompAddressEle().sendKeys(foodcompanypage.SendkeyFoodCompAdress());
	}
	//点击新增-保存
	public void ClickAddSave() throws Exception {
		foodcompanypage.GetFoodCompSaveEle().click();
	}
	//点击输入框
	public void ClickFoodCompanyBox() throws Exception {
		foodcompanypage.GetFoodCompBoxEle().sendKeys(foodcompanypage.SendkeyFoodCompName());
	}
	//点击搜索
	public void ClickSearch() throws Exception {
		foodcompanypage.GetFoodCompSearchEle().click();
	}
	
	//点击选中
	public void ClickChoose() throws Exception {
		foodcompanypage.GetFoodCompChooseEle().click();
	}
	//点击修改
	public void ClickEdit() throws Exception {
		foodcompanypage.GetFoodCompEditEle().click();
	}
	//点击修改配餐公司名称
	public void ClickEditFoodCompName() throws Exception {
		foodcompanypage.GetEditFoodCompNameEle().clear();
		foodcompanypage.GetEditFoodCompNameEle().sendKeys(foodcompanypage.SendkeyEditFoodCompName());
	}
	//点击修改配餐公司联系人
	public void ClickEditFoodCompContact() throws Exception {
		foodcompanypage.GetEditFoodCompContactEle().clear();
		foodcompanypage.GetEditFoodCompContactEle().sendKeys(foodcompanypage.SendkeyEditFoodCompContact());
	}
	
	//点击修改配餐公司手机号
	public void ClickEditFoodCompMobile() throws Exception {
		foodcompanypage.GetEditFoodCompMobileEle().clear();
		foodcompanypage.GetEditFoodCompMobileEle().sendKeys(foodcompanypage.PhoneNumber());
	}
	//点击修改配餐公司邮箱
	public void ClickEditFoodCompMail() throws Exception {
		foodcompanypage.GetEditFoodCompMailEle().clear();
		foodcompanypage.GetEditFoodCompMailEle().sendKeys(foodcompanypage.RandomEmail());
	}
	//点击修改配餐公司地址
	public void ClickEditFoodCompAdress() throws Exception {
		foodcompanypage.GetEditFoodCompAddressEle().clear();
		foodcompanypage.GetEditFoodCompAddressEle().sendKeys(foodcompanypage.SendkeyEditFoodCompAdress());
	}
	//点击保存
	public void ClickEditSave() throws Exception {
		foodcompanypage.GetEditFoodCompSaveEle().click();
	}

}

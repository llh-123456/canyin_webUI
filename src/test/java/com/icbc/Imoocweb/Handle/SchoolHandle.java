package com.icbc.Imoocweb.Handle;

import org.openqa.selenium.WebDriver;

import com.icbc.Imoocweb.Page.SchoolPage;

public class SchoolHandle extends BaseHandle{
	SchoolPage schoolpage;
	public SchoolHandle(WebDriver driver) {
		super(driver);
		schoolpage = new SchoolPage(driver);
	}

}

package com.icbc.Imoocweb.Page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SchoolPage extends BasePage{
	Logger logger = Logger.getLogger(SchoolPage.class);
	public SchoolPage(WebDriver driver) {
		super(driver);
		super.FilePath = "school.properties";
	}

}

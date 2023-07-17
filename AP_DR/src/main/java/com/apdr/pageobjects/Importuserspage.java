package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class Importuserspage extends TestBase {

	public Importuserspage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));

	@FindBy(linkText = "Import/Notify Users")
	WebElement ClicktabImportUsers;

	@FindBy(linkText = "Import CSV")
	WebElement ClickImportCSV;

	public void Click_Importusertab() {
		wait.until(ExpectedConditions.elementToBeClickable(ClicktabImportUsers));
		ClicktabImportUsers.click();
	}

	public void Click_Importfile() {
		wait.until(ExpectedConditions.elementToBeClickable(ClickImportCSV));
		ClickImportCSV.click();
	}

}

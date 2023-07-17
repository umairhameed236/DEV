package com.apdr.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class Adduploadcsvpage extends TestBase {

	public Adduploadcsvpage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	Actions builder = new Actions(driver);

	@FindBy(linkText = "Upload User's CSV")
	WebElement Uploaduserscsvfile;

	@FindBy(xpath = "//input[@id='edit-field-media-document-0-upload']")
	WebElement selecfileBtn;

	public void Uploaduserscsvfile() {
		wait.until(ExpectedConditions.elementToBeClickable(Uploaduserscsvfile));
		Uploaduserscsvfile.click();
	}

	public void FileClickable() throws AWTException {
		builder.moveToElement(selecfileBtn).click().build().perform();
		//First line for Server side
		//selecfileBtn.sendKeys("/home/AdminAccount/QA_Automation_AP/AP_DR/AudioVideo/TEstUserfile.csv");
		 selecfileBtn.sendKeys("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\TEstUserfile.csv");

	}

}

package com.nxtgenai.registerdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterDemoFlow {

	// 26 Nov 2023 - Code is added by Vinoth in github
	// 27 Nov 2023 - Updated the edge driver version by Vinoth R
	public WebDriver driver;

	// Parameterize all the Input Values
	String url = "https://vinothqaacademy.com/";
	String firstNameValue = "Vinoth";
	String lastNameValue = "R";
	String streetAddressValue = "xyZ";
	String aptBuildingValue = "S1";
	String stateValue = "Tamil Nadu";
	String cityValue = "Chennai";
	String postalCodeValue = "560078";
	String country = "India";
	String emailId = "ra@aol.com";
	String dateOfDemo = "01/27/2023";
	String timeInHour = "09";
	String timeInMinute = "30";
	String mobileNumber = "123456789";
	String enterYourQueryValue = "Registration is done successfully without any error";
	String successfulMessageText = "Registration Form is Successfully Submitted.";

	// Parameterized all The WebElement Path
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleGenderLocator = "vfb-31-1";
	String addressNameLocator = "vfb-13[address]";
	String streetAddressNameLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13[city]";
	String stateLocator = "vfb-13[state]";
	String postalCodeLocator = "vfb-13[zip]";
	String countryLocator = "vfb-13[country]";
	String emailIdLocator = "vfb-14";
	String dateOfDemoLocator = "vfb-18";
	String hourLocator = "vfb-16[hour]";
	String minuteLocator = "vfb-16[min]";
	String mobileNumberLocator = "vfb-19";
	String uftLocator = "//input[@id='vfb-20-1']";
	String seleniumWebDriverLocator = "//input[@id='vfb-20-0']";
	String enterYourQueryLocator = "//textarea[@id='vfb-23']";
	String enterTwoDigitsLocator = "vfb-3";
	String submitBtnLocator = "vfb-submit";
	String successfulMsgTextLocator = "elementor-widget-container";

	@Test(priority = 1)
	public void launchApplication() {
		// Set the system property for the chrome driver 
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

		
		// Create the object instance for the chrome brower in the webdrive interface
	    driver = new EdgeDriver();

		// Launch the application
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();
		Reporter.log("Application is launched");
		
	}

	@Test(priority = 2)
	public void navigateToRegisterDemoPage() {
		// Navigate to RegisterDemo Page
		// Create the object instance for Actions Class
		Actions action = new Actions(driver);

		// Mousehover above Demo Sites 
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));		
		action.moveToElement(demoSites).perform();

		// Mousehover above the Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		// Click on Demo Site – Registration Form link
		WebElement registerDemo = driver.findElement(By.partialLinkText("Registration Form"));
		registerDemo.click();

		Reporter.log("Register Demo Page is displayed");
	}

	@Test(priority = 3)
	public void registerDemo() {
		// Fill the Registration form by entering the all fields

		// First name
		WebElement firstName = driver.findElement(By.name(firstNameLocator));

		// Verify the First Name is displayed or not
		if (firstName.isDisplayed()) {
			Reporter.log("First Name is Displayed");

		} else {
			Reporter.log("First Name is not Displayed");
		}


		// Verify the First Name is Enabled or not
		if (firstName.isEnabled()) {
			Reporter.log("First Name is Enabled");
			// Enter First Name
			firstName.sendKeys(firstNameValue);
			Reporter.log("First Name Value is: " + firstNameValue);
		} else {
			Reporter.log("First Name is not Enabled");
		}

		// Last Name
		WebElement lastName = driver.findElement(By.name(lastNameLocator));
		// Verify the First Name is displayed or not
		if (lastName.isDisplayed()) {
			Reporter.log("Last Name is Displayed");
		} else {
			Reporter.log("Last Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (lastName.isEnabled()) {
			Reporter.log("Last Name is Enabled");
			// Enter Last Name
			lastName.sendKeys(lastNameValue);
			Reporter.log("Last Name Value is: " + lastNameValue);
		} else {
			Reporter.log("Last Name is not Enabled");
		}

		// Thread.sleep(2000);

		// Gender
		// Male Radio Button
		WebElement maleradioBtn = driver.findElement(By.id(maleGenderLocator));
		// Verify Male Radio Button is Displayed or not
		if (maleradioBtn.isDisplayed()) {
			Reporter.log("Male Radio Button is Displayed");
		} else {
			Reporter.log("Male Radio Button is not Displayed");
		}

		// Verify male Radio Button is Enabled or not
		if (maleradioBtn.isEnabled()) {
			Reporter.log("Male Radio Button is enabled");
		} else {
			Reporter.log("Male Radio Button is not enabled");
		}

		// Verify Male Radio Button is Selected
		if (maleradioBtn.isSelected()) {
			Reporter.log("Male Radio Button is selected");
		} else {
			Reporter.log("Male Radio Button is not selected");
			// Click on the Radio Button - Male
			maleradioBtn.click();
			Reporter.log("Male Radio Button is selected");
		}

		// Address
		// Street Address
		WebElement streetAddr = driver.findElement(By.name(addressNameLocator));
		// Verify the Street Address is displayed or not
		if (streetAddr.isDisplayed()) {
			Reporter.log("Street Address is Displayed");
		} else {
			Reporter.log("Street Address is not Displayed");
		}

		// Verify the Street Address is enabled or not
		if (streetAddr.isEnabled()) {
			Reporter.log("Street Address is Enabled");
			// Enter Street Address
			streetAddr.sendKeys(streetAddressValue);
			Reporter.log("Street Address Value is: " + streetAddressValue);
		} else {
			Reporter.log("Street Address is not Enabled");
		}

		// Apartment Number
		WebElement apartmentNo = driver.findElement(By.id(streetAddressNameLocator));
		// Verify the Apartment Number is displayed or not
		if (apartmentNo.isDisplayed()) {
			Reporter.log("Apartment Number is Displayed");
		} else {
			Reporter.log("Apartment Number is not Displayed");
		}

		// Verify the Apartment Number is enabled or not
		if (apartmentNo.isEnabled()) {
			Reporter.log("Apartment Number is Enabled");
			// Enter Apartment Number
			apartmentNo.sendKeys(aptBuildingValue);
			Reporter.log("Apartment Number Value is : " + aptBuildingValue);
		} else {
			Reporter.log("Apartment Number is not Enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.name(cityLocator));
		// Verify the City Name is displayed or not
		if (cityName.isDisplayed()) {
			Reporter.log("City Name is Displayed");

		} else {
			Reporter.log("City Name is not Displayed");
		}

		// Verify the City Name is enabled or not
		if (cityName.isEnabled()) {
			Reporter.log("City Name is enabled");
			// Enter City Name
			cityName.sendKeys(cityValue);
			Reporter.log("City Name Value is : " + cityValue);
		} else {
			Reporter.log("City Name is not enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.name(stateLocator));
		// Verify the State is displayed or not
		if (stateName.isDisplayed()) {
			Reporter.log("State is Displayed");
		} else {
			Reporter.log("State is not Displayed");
		}

		// Verify the State is enabled or not
		if (stateName.isEnabled()) {
			Reporter.log("State is enabled");
			// Enter State Name
			stateName.sendKeys(stateValue);
			Reporter.log("State Value is : " + stateValue);
		} else {
			Reporter.log("State is not Enabled");
		}

		// Postal code
		WebElement postalCode = driver.findElement(By.name(postalCodeLocator));
		// Verify the Postal Code is displayed or not
		if (postalCode.isDisplayed()) {
			Reporter.log("Postal Code is Displayed");
		} else {
			Reporter.log("Postal Code is not Displayed");
		}

		// Verify the Postal Code is enabled or not
		if (postalCode.isEnabled()) {
			Reporter.log("Postal Code is Enabled");
			// Enter Postal Code
			postalCode.sendKeys(postalCodeValue);
			Reporter.log("Postal Code Value is : " + postalCodeValue);
		} else {
			Reporter.log("Postal Code is not Enabled");
		}
		// Country Drop Down
		WebElement countryDropDown = driver.findElement(By.name(countryLocator));
		// Verify Country Drop Down is displayed or not
		if (countryDropDown.isDisplayed()) {
			Reporter.log("Country Drop Down is Displayed");
		} else {
			Reporter.log("Country Drop Down is not Displayed");
		}

		// Verify Country Drop Down is enabled or not
		if (countryDropDown.isEnabled()) {
			Reporter.log("Country Drop Down is Enabled");
		} else {
			Reporter.log("Country Drop Down is not Enabled");
		}

		// Select the Item from country DropDown
		WebElement countryDD = driver.findElement(By.name(countryLocator));
		// Create the object of the select
		Select countryDropDownValue = new Select(countryDD);
		countryDropDownValue.selectByVisibleText(country);

		// Email
		WebElement email = driver.findElement(By.name(emailIdLocator));
		// Verify the Email is Displayed or not
		if (email.isDisplayed()) {
			Reporter.log("Email is Displayed");
		} else {
			Reporter.log("Email is not Displayed");
		}

		// Verify the Email is enabled or not
		if (email.isEnabled()) {
			Reporter.log("Email is Enabled");
			// Enter Email Id
			email.sendKeys(emailId);
			Reporter.log("Email Id is: " + emailId);
		} else {
			Reporter.log("Email is not Enabled");
		}

		// Date of Demo
		WebElement demoDate = driver.findElement(By.name(dateOfDemoLocator));
		// Verify the Demo Date is Displayed or not
		if (demoDate.isDisplayed()) {
			Reporter.log("Date of Demo is Displayed");
		} else {
			Reporter.log("Date of Demo is not Displayed");
		}

		// Verify the Date of Demo is enabled or not
		if (demoDate.isEnabled()) {
			Reporter.log("Date of Demo is Enabled");
			// Enter Date of Demo Value
			demoDate.sendKeys(dateOfDemo);
			Reporter.log("Date of Demo Value is : " + dateOfDemo);
		} else {
			Reporter.log("Date of Demo is not Enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHour = driver.findElement(By.name(hourLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or not
		if (convenientTimeHour.isDisplayed()) {
			Reporter.log("Hour DropDown is Displayed");
		} else {
			Reporter.log("Hour DropDown is not Displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or not
		if (convenientTimeHour.isEnabled()) {
			Reporter.log("Hour DropDown is Enabled");
			/*
			 * To Select the Item from Convenient Time Hour DropDown. Create the object of
			 * the Select class
			 */
			Select hourDropDown = new Select(convenientTimeHour);
			// Select Using Visible Text
			hourDropDown.selectByVisibleText(timeInHour);
			Reporter.log("Hour dropdown value is: " + timeInHour);
		} else {
			Reporter.log("Hour DropDown is not Enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinute = driver.findElement(By.name(minuteLocator));
		// Verify MM Drop Down is Displayed or not
		if (convenientTimeMinute.isDisplayed()) {
			Reporter.log("Minute DropDown is Displayed");
		} else {
			Reporter.log("Minute DropDown is not Displayed");
		}

		// Verify Minute Drop Down is Enabled or not
		if (convenientTimeMinute.isEnabled()) {
			Reporter.log("Minute DropDown is Enabled");

			// To Select the Item from Minute DropDown, Create the Select Object
			Select minuteDropDown = new Select(convenientTimeMinute);
			// Select Using Visible Text
			minuteDropDown.selectByVisibleText(timeInMinute);
			Reporter.log("Minute Drop Down Value is : " + timeInMinute);

		} else {
			Reporter.log("Minute DropDown is not Enabled");
		}

		// Mobile Number
		WebElement mobileNum = driver.findElement(By.name(mobileNumberLocator));
		// Verify the Mobile Number is Displayed or not
		if (mobileNum.isDisplayed()) {
			Reporter.log("Mobile Number is Displayed");
		} else {
			Reporter.log("Mobile Number is not Displayed");
		}

		// Verify the Mobile Number is enabled or not
		if (mobileNum.isEnabled()) {
			Reporter.log("Mobile Number is Enabled");
			// Enter Mobile Number
			mobileNum.sendKeys(mobileNumber);
			Reporter.log("Mobile Number Value is : " + mobileNumber);
		} else {
			Reporter.log("Mobile Number is not Enabled");
		}

		// Course Interested
		// UFT Testing Check Box
		WebElement uftChk = driver.findElement(By.xpath(uftLocator));
		// Verify The Functional Testing Check Box is displayed or Not
		if (uftChk.isDisplayed()) {
			Reporter.log("UFT Check Box is Displayed");
		} else {
			Reporter.log("UFT Check Box is not Displayed");
		}

		// Verify UFT Check Box is Enabled or Not
		if (uftChk.isEnabled()) {
			Reporter.log("UFT Check Box is Enabled");
		} else {
			Reporter.log("UFT Check Box is NOT Enabled");
		}

		// Verify Functional Testing Check Box Selected or Not-Initial State(not
		// Selected)
		if (uftChk.isSelected()) {
			Reporter.log("UFT Check Box is selected");
		} else {
			Reporter.log("UFT Check Box is not selected");
			// Click on UFT check Box
			uftChk.click();
			Reporter.log("UFT Check Box is selected");
		}

		// Selenium WebDriver Check Box
		WebElement seleniumWebDriverCheck = driver.findElement(By.xpath(seleniumWebDriverLocator));
		// Verify Selenium WebDriver Check Box is displayed or Not
		if (seleniumWebDriverCheck.isDisplayed()) {
			Reporter.log("Selenium WebDriver Check Box is Displayed");
		} else {
			Reporter.log("Selenium WebDriver Check Box is not Displayed");
		}

		// Verify Selenium WebDriver Check Box is Enabled or Not
		if (seleniumWebDriverCheck.isEnabled()) {
			Reporter.log("Selenium WebDriver Check Box is Enabled");
		} else {
			Reporter.log("Selenium WebDriver Check Box is not Enabled");
		}

		// Verify Selenium WebDriver Check Box Selected or Not
		if (seleniumWebDriverCheck.isSelected()) {
			Reporter.log("Selenium WebDriver Check Box is Selectedh");
		} else {
			Reporter.log("Selenium WebDriver Check Box is not selected");
			// Click on Selenium WebDriver check Box
			seleniumWebDriverCheck.click();
			Reporter.log("Selenium WebDriver Check Box is Selected");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify the Enter Your Query is Displayed or not
		if (enterYourQuery.isDisplayed()) {
			Reporter.log("Enter Your Query is Displayed");
		} else {
			Reporter.log("Enter Your Query is not Displayed");
		}
		// Verify the Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			Reporter.log("Enter Your Query is Enabled");
			// Enter Your Query Value
			enterYourQuery.sendKeys(enterYourQueryValue);
			Reporter.log("Enter Your Query is: " + enterYourQueryValue);
		} else {
			Reporter.log("Enter Your Query is not Enabled");
		}

		// Enter Any Two Digits
		WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
		// Verify the Enter Any Two Digits is Displayed or not
		if (enterTwoDigits.isDisplayed()) {
			Reporter.log("Enter Any Two Digits is Displayed");
		} else {
			Reporter.log("Enter Any Two Digits is not Displayed");
		}

		// Verify whether Enter Any Two Digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			Reporter.log("Enter Any Two Digits is Enabled");
			// Retrieve the Verification Number
			String verificationText = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"))
					.getText();
			String number[] = verificationText.split(":");
			enterTwoDigits.sendKeys(number[1].trim());
			// Remove spaces before and after digits and display 2 digits
			Reporter.log("Enter Any Two Digits is: " + number[1].trim());
		} else {
			Reporter.log("Enter Any Two Digits is not Enabled");
		}

		// Submit button
		WebElement submitButton = driver.findElement(By.name(submitBtnLocator));
		// Click on Submit Button
		submitButton.click();
		Reporter.log("Submit Button is Clicked");

		// Thread.sleep(3000);

		// Submit the Form

	}

	@Test(priority = 4)
	public void validateSuccessfulMessage() {
		
		WebElement successfulMsgText = driver.findElement(By.className(successfulMsgTextLocator));
		// Verify Successful message Text displayed or not
		if (successfulMsgText.isDisplayed()) {
			Reporter.log("Successful Message Text is Displayed");
		} else {
			Reporter.log("Successful Message Text is not Displayed");
		}
		Reporter.log("User is registered successfully");
		
		// Validating Successful registration message text
		String actualSuccessfulMsgText = successfulMsgText.getText();
		String expectedSuccessfulMsgText = successfulMessageText;

		if (actualSuccessfulMsgText.contains(expectedSuccessfulMsgText)) {
			Reporter.log("Actual and expected Successful Msg Text are the same");
			Reporter.log("The Successful Message Text is : " + actualSuccessfulMsgText);
		} else {
			Reporter.log("Actual and expected Successful Msg Text are not same");
			Reporter.log("Actual Text is : " + actualSuccessfulMsgText);
			Reporter.log("Expected Text is : " + expectedSuccessfulMsgText);
		} 

		Reporter.log("Successful Message is validated");
	}

	@Test(priority = 5)
	public void closeApplication() {
		driver.quit();
		Reporter.log("Application is closed");
	}

}

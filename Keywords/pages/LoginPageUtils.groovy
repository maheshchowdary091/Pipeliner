package pages
import lib.Page
import lib.Actions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class LoginPageUtils extends Page{
	/**
	 * Login page reusable methods
	 */
	Page element = new Page()


	def page = "In the sign in page, "

	@Keyword
	def verifyRedirectionOfLoginPageWhenNavigateToAppUrlBeforeLogin() {
		WebUI.waitForPageLoad(GlobalVariable.defaultWaitTime)
		def currentPageUrl = WebUI.getUrl()
		if(!(currentPageUrl.startsWith(GlobalVariable.loginPageUrl))){
			WebUI.takeScreenshot()
			KeywordUtil.markFailedAndStop("When navigate to application url before login, the Sign in page is not shown")
		}
	}

	@Keyword
	def verifyLoginPage() {
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Email/SigninHeader'), page+"the 'Sign In' header is not present")
		element.verifyElementPresent(findTestObject('Login Page/Email/SignInPageDescription'), page+"'Continue to Pipeliner CRM' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Email/EmailTextBox'), page+"the Email textbox is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Email/EmailLabel'), page+"the Email label is not presen above the email textbox")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Email/SignUpForFreeTrailLink'), page+"the 'Signup for free trail' link is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Email/ContinueButton'), page+"the Continue button is not present")
	}

	@Keyword
	def verifyValidationsOfEmailField() {
		WebUI.clearText(findTestObject('Object Repository/Login Page/Email/EmailTextBox'))
		element.click(findTestObject('Object Repository/Login Page/Email/ContinueButton'))
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/ValidationError'), page+"When click Continue button without entering email in email field, the validations error message is not shown")
	}

	@Keyword
	def verifyPasswordPage() {
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/WelcomeHeaderIn'), "In the welcome page, the 'Welcome' header is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/UserEmailInPasswordPage'), "In the welcome page, Email id is not present")
		def email = element.getText(findTestObject('Object Repository/Login Page/Password/UserEmailInPasswordPage'))
		element.verifyTextMatch(email, GlobalVariable.userName, "The email present in password page does not match with the email entered in Sign in page")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/EditEmailIcon'), "In the welcome page, Edit icon is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/PasswordLabel'), "In the welcome page, Password label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/PasswordTextBox'), "In the welcome page, Password textbox is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/RememberMeCheckbox'), "In the welcome page, RememberMe checkbox is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/ForgotPasswordLink'), "In the welcome page, Forgot Password link is not present")
		element.verifyElementPresent(findTestObject('Object Repository/Login Page/Password/SignInButton'), "In the welcome page, the Sign In button is not present")
	}

	@Keyword
	def login(String email = GlobalVariable.userName, String password = GlobalVariable.passWord) {
		element.sendKeys(findTestObject('Object Repository/Login Page/Email/EmailTextBox'), email)
		element.click(findTestObject('Object Repository/Login Page/Email/ContinueButton'))
		element.sendKeysEncrypted(findTestObject('Object Repository/Login Page/Password/PasswordTextBox'), password)
		element.click(findTestObject('Object Repository/Login Page/Password/SignInButton'))
		element.verifyElementVisible(findTestObject('Object Repository/CRM Home Page/SearchBox'), "search field not present after login")
	}
}
























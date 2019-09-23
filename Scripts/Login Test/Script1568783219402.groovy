import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebDriver driver = DriverFactory.getWebDriver()


CustomKeywords.'lib.Navigations.navigateToCrmHomePageBeforeLogin'()

CustomKeywords.'pages.LoginPageUtils.verifyRedirectionOfLoginPageWhenNavigateToAppUrlBeforeLogin'()

CustomKeywords.'pages.LoginPageUtils.verifyLoginPage'()

CustomKeywords.'pages.LoginPageUtils.verifyValidationsOfEmailField'()

CustomKeywords.'lib.Actions.sendKeys'(findTestObject('Object Repository/Login Page/Email/EmailTextBox'), GlobalVariable.userName)

CustomKeywords.'lib.Actions.click'(findTestObject('Object Repository/Login Page/Email/ContinueButton'))

CustomKeywords.'pages.LoginPageUtils.verifyPasswordPage'()

CustomKeywords.'lib.Actions.sendKeysEncrypted'(findTestObject('Object Repository/Login Page/Password/PasswordTextBox'), GlobalVariable.passWord)

CustomKeywords.'lib.Actions.click'(findTestObject('Object Repository/Login Page/Password/SignInButton'))

CustomKeywords.'lib.Page.verifyElementVisible'(findTestObject('Object Repository/CRM Home Page/SearchBox'), "search field not present after login")






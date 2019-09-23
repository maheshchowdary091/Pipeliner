package pages
import lib.Page
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.stringtemplate.v4.compiler.STParser.element_return

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class NewOpportunityPageUtils {

	Page element = new Page()

	@Keyword
	def verifyElementsInNewOpportunityModal() {

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/NewOpportunityTitle'), "The title 'New Opportunity' is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/GeneralInformationHeader'), "The header 'General Information' is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityNameLabel'), "The 'Opportunity Name' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityNameTextBox'), "The 'Opportunity name' text box is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityValueLabel'), "The 'Opportunity value' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityValueTextbox'), "The 'Opportunity Value' text box is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/CurrencyDropdownInOpportunityValue'), "Currency dropdown is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ClosingDateLabel'), "'Closing Date' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ClosingDateTextBox'), "The 'Closing Date' text box is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/CalenderIcon'), "The 'Calender' icon is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/SetRecurrenceButton'), "The 'Set Reoccurence' button is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/RankingLabel'), "The 'Ranking' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/RankingTextBox'), "The 'Ranking' text box is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/SalesUnitLabel'), "The 'Sales Unit' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/SalesUnitDropdown'), "The 'Sales Unit' dropdown is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/AccountsAndContactsHeader'), "The 'Accounts and Contacts' header is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/PrimaryAccountNameLabel'), "The 'Primary account name' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ClickHereToAddLinkFromPrimaryAccountName'), "The 'Click here to add' link is not in 'Primary Account Name'")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/CreateLinkFromPrimaryAccountName'), "The 'create' link is not in 'Primary Account Name'")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/PrimaryContactNameLabel'), "The 'Primary contact name' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ClickHereToAddLinkFromPrimaryContactName'), "The 'create' link is not in 'Primary contact Name'")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ProductAndServicesHeader'), "The 'Product and Services' header is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ProductAndServicesLabel'), "The 'Product & Services' label is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ProductSearchTextBox'), "The 'Product Search' text field is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ProductSearchIcon'), "The search icon is not present in the 'Prodct Search' text field")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/PriceListLabel'), "The 'Price List' label is not present")

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/PriceListDropdownInProductsAndServices'), "In the New opportunity modal, the Price list dropdown is not present in Products&services section")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ResetPricesIcon'), "In the New opportunity modal, the Reset prices dropdown is not present in Products&services section")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/CurrencyDropdownInProductsAndServices'), "In the New opportunity modal, the Currency dropdown is not present in Products&services section")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ClickHereToAddLinkFromProductAndServices'), "The 'Click here to add' link is not in 'Product and Services'")

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/DescriptionHeader'), "The 'Description' header is not present")

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityDescriptionLabel'), "The 'Opportunity Description' label is not present")

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/OpportunityDescriptionTextArea'), "The 'Opportunity Description' text area is not present")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/SaveButton'), "Save button is not present in the New opportunity modal")
	}

	@Keyword
	def checkValidationsInNewOpportunityModal() {

		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Opportunity name"]), "In the New opportunity modal, when click Save button before entering data, the validation error message is not shown for 'Opportunity name' field")
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Closing date"]), "In the New opportunity modal, when click Save button before entering data, the validation error message is not shown for 'Closing date' field")
		//element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Opportunity value"]), "In the New opportunity modal, when click Save button before entering data, the validation error message is not shown for 'Opportunity value' field")
		element.sendKeys(findTestObject('Object Repository/NewOpportunity/OpportunityNameTextBox'), "test")
		element.verifyElementNotPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Opportunity name"]), "In the New opportunity modal, validation error message is shown for the Opportunity name field even after entering data")
		WebUI.clearText(findTestObject('Object Repository/NewOpportunity/OpportunityValueTextbox'))
		element.sendKeys(findTestObject('Object Repository/NewOpportunity/OpportunityValueTextbox'), '10')
		element.verifyElementNotPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Opportunity value"]), "In the New opportunity modal, validation error message is shown for the Opportunity value field even after entering data")
		element.click(findTestObject('Object Repository/NewOpportunity/CalenderIcon'))
		element.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/FirstDayInCalendar'), "When click on Closing Date calendar icon then the calendar is not shown")
		element.click(findTestObject('Object Repository/NewOpportunity/FirstDayInCalendar'))
		element.verifyElementNotPresent(findTestObject('Object Repository/NewOpportunity/ValidationError(field)', ["field":"Closing date"]), "In the New opportunity modal, validation error message is shown for the Closing date field even after entering data")
	}

	@Keyword
	def selectPipelineTypeInSelectPipelineModal(String type="Basic Pipeline") {

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/NewOpportunity/Select Pipeline Modal/BasicPipelineOption'), 5)) {
			if(type=="Basic Pipeline"){
				element.click(findTestObject('Object Repository/NewOpportunity/Select Pipeline Modal/BasicPipelineOption'))
			}
			else{
				element.click(findTestObject('Object Repository/NewOpportunity/Select Pipeline Modal/DirectSalesOption'))
			}
			element.click(findTestObject('Object Repository/NewOpportunity/Select Pipeline Modal/OkButton'))
			element.verifyElementNotPresent(findTestObject('Object Repository/NewOpportunity/Select Pipeline Modal/OkButton'), "When select "+type+" option and clicking Ok button in 'Select Pipeline' modal then the modal is not getting closed")
		}
	}

	@Keyword
	def enterGeneralInformation() {

		element.sendKeys(findTestObject('Object Repository/NewOpportunity/OpportunityNameTextBox'), GlobalVariable.basicPipelineDetails.opportunityName)
		WebUI.clearText(findTestObject('Object Repository/NewOpportunity/OpportunityValueTextbox'))
		element.sendKeys(findTestObject('Object Repository/NewOpportunity/OpportunityValueTextbox'), GlobalVariable.basicPipelineDetails.opportunityValue)
		element.sendKeys(findTestObject('Object Repository/NewOpportunity/ClosingDateTextBox'), GlobalVariable.basicPipelineDetails.closingDate)
	}
}









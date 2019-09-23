
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}

def static "pages.NewOpportunityPageUtils.verifyElementsInNewOpportunityModal"() {
    (new pages.NewOpportunityPageUtils()).verifyElementsInNewOpportunityModal()
}

def static "pages.NewOpportunityPageUtils.checkValidationsInNewOpportunityModal"() {
    (new pages.NewOpportunityPageUtils()).checkValidationsInNewOpportunityModal()
}

def static "pages.NewOpportunityPageUtils.selectPipelineTypeInSelectPipelineModal"(
    	String type	) {
    (new pages.NewOpportunityPageUtils()).selectPipelineTypeInSelectPipelineModal(
        	type)
}

def static "pages.NewOpportunityPageUtils.enterGeneralInformation"() {
    (new pages.NewOpportunityPageUtils()).enterGeneralInformation()
}

def static "pages.NewOpportunityPageUtils.selectPipelineTypeInSelectPipelineModal"() {
    (new pages.NewOpportunityPageUtils()).selectPipelineTypeInSelectPipelineModal()
}

def static "lib.Navigations.navigateToCrmHomePageWhenLogin"() {
    (new lib.Navigations()).navigateToCrmHomePageWhenLogin()
}

def static "lib.Navigations.navigateToCrmHomePageBeforeLogin"() {
    (new lib.Navigations()).navigateToCrmHomePageBeforeLogin()
}

def static "lib.Actions.click"(
    	TestObject element	) {
    (new lib.Actions()).click(
        	element)
}

def static "lib.Actions.sendKeys"(
    	TestObject element	
     , 	String text	) {
    (new lib.Actions()).sendKeys(
        	element
         , 	text)
}

def static "lib.Actions.sendKeysEncrypted"(
    	TestObject element	
     , 	String encryptedText	) {
    (new lib.Actions()).sendKeysEncrypted(
        	element
         , 	encryptedText)
}

def static "lib.Actions.getText"(
    	TestObject element	
     , 	int maxWaitTime	) {
    (new lib.Actions()).getText(
        	element
         , 	maxWaitTime)
}

def static "lib.Actions.wait"(
    	TestObject element	
     , 	int maxWaitTime	) {
    (new lib.Actions()).wait(
        	element
         , 	maxWaitTime)
}

def static "lib.Actions.getElementCount"(
    	TestObject element	) {
    (new lib.Actions()).getElementCount(
        	element)
}

def static "lib.Actions.getText"(
    	TestObject element	) {
    (new lib.Actions()).getText(
        	element)
}

def static "lib.Actions.wait"(
    	TestObject element	) {
    (new lib.Actions()).wait(
        	element)
}

def static "pages.LoginPageUtils.verifyRedirectionOfLoginPageWhenNavigateToAppUrlBeforeLogin"() {
    (new pages.LoginPageUtils()).verifyRedirectionOfLoginPageWhenNavigateToAppUrlBeforeLogin()
}

def static "pages.LoginPageUtils.verifyLoginPage"() {
    (new pages.LoginPageUtils()).verifyLoginPage()
}

def static "pages.LoginPageUtils.verifyValidationsOfEmailField"() {
    (new pages.LoginPageUtils()).verifyValidationsOfEmailField()
}

def static "pages.LoginPageUtils.verifyPasswordPage"() {
    (new pages.LoginPageUtils()).verifyPasswordPage()
}

def static "pages.LoginPageUtils.login"(
    	String email	
     , 	String password	) {
    (new pages.LoginPageUtils()).login(
        	email
         , 	password)
}

def static "pages.LoginPageUtils.login"(
    	String email	) {
    (new pages.LoginPageUtils()).login(
        	email)
}

def static "pages.LoginPageUtils.login"() {
    (new pages.LoginPageUtils()).login()
}

def static "lib.Page.verifyElementPresent"(
    	TestObject element	
     , 	String failureDescription	
     , 	int maxWaitTime	) {
    (new lib.Page()).verifyElementPresent(
        	element
         , 	failureDescription
         , 	maxWaitTime)
}

def static "lib.Page.verifyElementPresentAndContinueOnFailure"(
    	TestObject element	
     , 	String failureDescription	
     , 	int maxWaitTime	) {
    (new lib.Page()).verifyElementPresentAndContinueOnFailure(
        	element
         , 	failureDescription
         , 	maxWaitTime)
}

def static "lib.Page.verifyElementNotPresent"(
    	TestObject element	
     , 	String failureDescription	
     , 	int maxWaitTime	) {
    (new lib.Page()).verifyElementNotPresent(
        	element
         , 	failureDescription
         , 	maxWaitTime)
}

def static "lib.Page.verifyElementNotPresentAndContinuewOnFailure"(
    	TestObject element	
     , 	String failureDescription	
     , 	int maxWaitTime	) {
    (new lib.Page()).verifyElementNotPresentAndContinuewOnFailure(
        	element
         , 	failureDescription
         , 	maxWaitTime)
}

def static "lib.Page.verifyTextMatch"(
    	String actual	
     , 	String expected	
     , 	String failureDescription	) {
    (new lib.Page()).verifyTextMatch(
        	actual
         , 	expected
         , 	failureDescription)
}

def static "lib.Page.verifyElementVisible"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementVisible(
        	element
         , 	failureDescription)
}

def static "lib.Page.verifyElementNotVisible"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementNotVisible(
        	element
         , 	failureDescription)
}

def static "lib.Page.verifyElementPresent"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementPresent(
        	element
         , 	failureDescription)
}

def static "lib.Page.verifyElementPresentAndContinueOnFailure"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementPresentAndContinueOnFailure(
        	element
         , 	failureDescription)
}

def static "lib.Page.verifyElementNotPresent"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementNotPresent(
        	element
         , 	failureDescription)
}

def static "lib.Page.verifyElementNotPresentAndContinuewOnFailure"(
    	TestObject element	
     , 	String failureDescription	) {
    (new lib.Page()).verifyElementNotPresentAndContinuewOnFailure(
        	element
         , 	failureDescription)
}

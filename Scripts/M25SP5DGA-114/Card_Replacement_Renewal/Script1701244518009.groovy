import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/01_VerifyElementText - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981422395934138400.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/02_VerifyElementText_Module- Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/03_UserTapsOn - Card ReplacementRenewal'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/04_VerifyElementText - Card ReplacementRenewal'),
	'Card Replacement/Renewal')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/05_VerifyElementText_PopUp_Body - Please note that you will be charged with RM0.00 for the card replacementrenewal fee. Click continue if you agree to proceed'),
	'Please note that you will be charged with RM8.00 for the card replacement/renewal fee. Click continue if you agree to proceed.')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/07_UserTapsOn_ContinueButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/12_VerifyElement - ReplaceRenew Maybank MasterCard Global Access World Debit Card'),
	'Replace/Renew Maybank MasterCard Global Access World Debit Card')

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/13_VerifyElementText - Where do you want us to deliver your card'),
	'Where do you want us to deliver your card?')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/14_VerifyElementText - Address Line 1'), 'Address Line 1')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/15_UserTapsOn_i_Button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-114/16_VerifyElementText - Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted'),
	'Please ensure that the mailing address entered is accurate. The use of P.O. boxes is not permitted.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3386172015849461908.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/17_UserTapsOnCloseButton'), 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/18_AddressLine1Set'), 'This is Address Line 1', 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/19_StreetNameSet'), 'This is Street Name', 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/20_CityNameSet'), 'Kuala Lumpur', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/22_SetKualaLumpur - WP KUALA LUMPUR'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3387560337901007479.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/23_TapOnDone'), 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-114/24_SetPostCode'), '00001', 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/25_TapOnTermsRadioButton'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1965691438582709916.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-114/26_UserTapsOnContinueButton'), 0)

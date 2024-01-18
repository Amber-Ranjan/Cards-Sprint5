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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the card manegement screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4384473632079081717.png')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/02_VerifyCardName - Maybank MasterCard Global Access World Debit Card'),
	'Maybank MasterCard Global Access World Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/01_VerifyText - E-Commerce Activation'), 'E-Commerce Activation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/02_VerifyText - Enable your online transaction'),
	'Enable your online transaction')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')

//-----------------------------------------------------------S2U Expire------------------------------------------------------------------------------------------

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/18_TapOnCrossIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/19_UserTapsOnCancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')

Mobile.delay(50)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'),
	'Your Secure Verification authorisation was expired.')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/25_TransactionType - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12_DecisionScreenDoneButton'), 0)

//------------------------------------------------------------------Secure2U Rejected---------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/13_UserTapsOnReject'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'),
	'Your Secure Verification authorisation was rejected.')


Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12_DecisionScreenDoneButton'), 0)

//----------------------------------------------------------------------Approve S2U----------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'),
	'Are you sure you want to deactivate e-commerce?')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/15_ApproveButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/26_DecisionScreen - E-commerce successfully deactivated'),
	'E-commerce successfully deactivated')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/27_VerifyText - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/28_VerifyText- Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12_DecisionScreenDoneButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')


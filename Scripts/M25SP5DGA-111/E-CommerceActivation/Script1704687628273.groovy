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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')

Mobile.delay(49)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'),
	'Your Secure Verification authorisation was expired.')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/11_TransactionType - Activate E-Commerce'), 'Activate E-Commerce')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12_DecisionScreenDoneButton'), 0)

//----------------------------------------------------------S2U Reject------------------------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/13_UserTapsOnReject'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'),
	'Your Secure Verification authorisation was rejected.')


Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/11_TransactionType - Activate E-Commerce'), 'Activate E-Commerce')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12_DecisionScreenDoneButton'), 0)

//----------------------------------------------------------S2U Approve-----------------------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/15_ApproveButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'E-commerce successfully activated')








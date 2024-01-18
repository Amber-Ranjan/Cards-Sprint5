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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/01_UserOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8888572485234762783.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/02_VerifyList- Overseas Debit'), 'Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/03_VerifyText - Enable your foreign currency spend and overseas ATM withdrawals'),
	'Enable your foreign currency spend and overseas ATM withdrawals')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/04_TapOn- Overseas Debit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/06_VerifyText - Start Date'), 'Start Date')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/10_TapOn - 31'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/12_SelectFirstElementYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/15_Verify Text - End Date'), 'End Date')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/16UserTapsOnEndDate - Enter end date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5774500733089938403.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/17_TapOnNextYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/18_UserTapsOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/23_Secure2UText - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/24_VerifySecure2UText- Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/25_VerifyText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6336049849610961480.png')

Mobile.delay(50)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/26_Timeout - Overseas debit request is unsuccessful. Please try again or you can also activate your card by visting our nearest Maybank ATM or calling us at 1-300-88-6688'),
	'Overseas debit request is unsuccessful. Please try again or you can also activate your card by visting our nearest Maybank ATM or calling us at 1-300-88-6688')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/20_VerifyText - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/21_VerifyText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6838951156749311258.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/22_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/01_UserOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8888572485234762783.png')

//------------------------------------------Secure2U Reject--------------------------------------------------------------------------------------------


Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/04_TapOn- Overseas Debit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/06_VerifyText - Start Date'), 'Start Date')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/10_TapOn - 31'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/12_SelectFirstElementYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/15_Verify Text - End Date'), 'End Date')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/16UserTapsOnEndDate - Enter end date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5774500733089938403.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/17_TapOnNextYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/18_UserTapsOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/23_Secure2UText - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/24_VerifySecure2UText- Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/25_VerifyText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6336049849610961480.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/27_Reject'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/26_Timeout - Overseas debit request is unsuccessful. Please try again or you can also activate your card by visting our nearest Maybank ATM or calling us at 1-300-88-6688'),
	'Overseas debit request is unsuccessful. Please try again or you can also activate your card by visting our nearest Maybank ATM or calling us at 1-300-88-6688')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/20_VerifyText - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/21_VerifyText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6838951156749311258.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/22_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/01_UserOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8888572485234762783.png')

//--------------------------------------------------------------Secure2U Approve-----------------------------------------------------------------------------------


Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/04_TapOn- Overseas Debit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/06_VerifyText - Start Date'), 'Start Date')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/07TapOn- Enter start date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7175177134931168031.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/10_TapOn - 31'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/12_SelectFirstElementYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/15_Verify Text - End Date'), 'End Date')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot898145141276045888.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/16UserTapsOnEndDate - Enter end date'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5774500733089938403.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/14_UserTapsOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/08_TapOnMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1313454608465721249.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/09_TapOnDecMonth'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5093622031315853623.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/11_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/17_TapOnNextYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5916236547212003103.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/13_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/05_VerifyElementText - Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6066942533805992981.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-0112/18_UserTapsOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/23_Secure2UText - Secure2u authorisation'), 'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/24_VerifySecure2UText- Activate Overseas Debit'),
	'Activate Overseas Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-0112/25_VerifyText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6336049849610961480.png')


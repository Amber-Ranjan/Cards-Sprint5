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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/01_UserOn - CARDS'), 'CARDS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot328892508546459756.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/02_VerifyCardName- Maybank MasterCard Global Access World Debit Card'), 
    'Maybank MasterCard Global Access World Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/03_VerifyActivateNowText - Activate Now'), 'Activate Now')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/04_UserTapsOn - Maybank MasterCard Global Access World Debit Card'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/05_VerifyText - Verify Card'), 'Verify Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/06_VerifyText - Enter your cards last 8 digits'), 
    'Enter your card\'s last 8 digits')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/07_VerifyText - Make sure youve received your physical card before activating it'), 
    'Make sure you\'ve received your physical card before activating it.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8570284591004330778.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/08_Tap - 0'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/09_Tap - 0'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/10_Tap- 0'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/11_Tap - 2'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/12_Tap - 2'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/13_Tap- 9'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/14_Tap - 0'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/15_Tap - 8'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2277066751499245059.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/16_Tap_Check'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/17_VerifyText - Enter your 6-digit PIN'), 'Enter your 6-digit PIN')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/18_VerifyText - This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
	//Tap on Number 6 times
	Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/16_Tap_Check'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4863104808322153449.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/19_VerifyText - Re-enter your 6-digit PIN'), 'Re-enter your 6-digit PIN')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
	//Tap on Number 6 times
	Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/16_Tap_Check'), 0)


Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/20_S2U- Activate Debit Card'), 'Activate Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/21_S2u - Card'), 'Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/22_VerifyCardName - Maybank MasterCard Debit'), 
    'Maybank MasterCard Debit')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/23_VerifyDateTime - Date  time'), 'Date & time')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/24_TapOnApproveButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/25_DecisionSCreen - Activation Successful'), 'Activation Successful')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/26_Verify - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/27_Verify - Date  time'), 'Date & time')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/28_TapOnDoneButton'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4011542426673988013.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/29_VerifyText - ACCOUNTS'), 'ACCOUNTS')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/30_UserTapOnAccounts'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/31_VerifyUserOn - ACCOUNTS'), 'ACCOUNTS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8871550037121322942.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/32_UserTapOn - CARDS'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/33_VerifyG1ACard - Maybank MasterCard Global Access World Debit Card'),
	'Maybank MasterCard Global Access World Debit Card')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/32_VerifyExpiry - Valid Thru 0130'), 'Valid Thru 01/30')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/33_VerifyCardNumber-    2908'), '**** **** **** 2908')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5031966513145022761.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/34_UserTapOn - Maybank MasterCard Global Access World Debit Card'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/35_UserNavigatedInside - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3616449720108366488.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/36_UserTapOnBackButton'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1243/37_UserTapsOnHome'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1243/38_VerifyText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6912529033235009301.png')


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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1538/01_VerifyText- ACCOUNTS'), 'ACCOUNTS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6399272154176829945.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1538/02_VerifyElementText - Activate Now'), 'Activate Now')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-1538/03_TapOn - Global Access Account-i'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-1538/04_VerifyElementText - Kindly make an initial deposit of RM50 to activate this account'),
	'Kindly make an initial deposit of RM50 to activate this account.')




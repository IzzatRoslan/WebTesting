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

WebUI.callTestCase(findTestCase('3.Pay_Grade_Feature/Add Pay Grades/Add Pay Grades'), [('name') : 'Gred N3'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3.Pay_Grade_Feature/Add Currency/Add_Currency_Button'))

WebUI.click(findTestObject('3.Pay_Grade_Feature/Add Currency/Currency_Selection'))

WebUI.click(findTestObject('3.Pay_Grade_Feature/Add Currency/Select', [('currency') : currency]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3.Pay_Grade_Feature/Add Currency/Input_Minimum_Salary'), '2000')

WebUI.setText(findTestObject('3.Pay_Grade_Feature/Add Currency/Input_Maximum_Salary'), '1500')

WebUI.click(findTestObject('3.Pay_Grade_Feature/Add Currency/button_Save'))

WebUI.verifyElementPresent(findTestObject('3.Pay_Grade_Feature/Add Currency/span_Should be higher than Minimum Salary'), 
    0)

WebUI.closeBrowser()


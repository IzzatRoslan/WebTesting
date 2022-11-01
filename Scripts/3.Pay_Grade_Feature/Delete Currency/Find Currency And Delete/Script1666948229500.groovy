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

Currency_Name = WebUI.getText(findTestObject('3.Pay_Grade_Feature/Delete Currency/Currency_List', [('Index') : Index]))

println(Currency_Name)

while(Find_Currency != Currency_Name) { 
        Index++

        Currency_Name = WebUI.getText(findTestObject('3.Pay_Grade_Feature/Delete Currency/Currency_List', [('Index') : Index]))
		println(Currency_Name)
    }

Index_Currency = Index

print(Index_Currency)

WebUI.click(findTestObject('3.Pay_Grade_Feature/Delete Currency/Delete_Currency_Button (1)', [('Index_Currency') : Index_Currency]))

WebUI.click(findTestObject('3.Pay_Grade_Feature/Delete Currency/Confirm'))

WebUI.verifyElementNotPresent(findTestObject('3.Pay_Grade_Feature/Delete Currency/Verify_Currency', [('Find_Currency') : Find_Currency]), 
    0)


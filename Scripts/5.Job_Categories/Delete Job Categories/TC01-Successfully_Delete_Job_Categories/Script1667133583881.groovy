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

WebUI.callTestCase(findTestCase('5.Job_Categories/Add Categories/Add Job Categories'), [('jobname') : 'HouseWife'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Admin_Function'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job'))

WebUI.click(findTestObject('5.Job_Categories/Add Categories/li_Job Categories'))

Job_Name = WebUI.getText(findTestObject('5.Job_Categories/Delete Job Categories/Find_Job_Categories', [('Index') : Index]))

while (Find_Job != Job_Name) {
    Index++

    Job_Name = WebUI.getText(findTestObject('5.Job_Categories/Delete Job Categories/Find_Job_Categories', [('Index') : Index]))
}

Index_Job = Index

WebUI.click(findTestObject('5.Job_Categories/Delete Job Categories/Delete_Button', [('Index_Job') : Index_Job]))

WebUI.click(findTestObject('5.Job_Categories/Delete Job Categories/Confirm Delete Button'))

WebUI.verifyElementNotPresent(findTestObject('5.Job_Categories/Delete Job Categories/Verify Job', [('Find_Job') : Find_Job]), 
    0)

WebUI.closeBrowser()


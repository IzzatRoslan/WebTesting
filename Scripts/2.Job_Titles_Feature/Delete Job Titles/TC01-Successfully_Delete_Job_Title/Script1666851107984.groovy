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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1.User_Management_Feature/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Admin_Function'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job Titles'))

detected_title = WebUI.getText(findTestObject('2.Job_Title_Feature/Delete Job Titles/Jobtitle', [('Index') : Index]))

println(detected_title)

while (desired_title != detected_title) {
    Index++

    detected_title = WebUI.getText(findTestObject('2.Job_Title_Feature/Delete Job Titles/Jobtitle', [('Index') : Index]))

    println(detected_title)
}

Index_Delete = Index

println(Index_Delete)

WebUI.click(findTestObject('2.Job_Title_Feature/Delete Job Titles/Delete_Title_Buttons', [('Index_Delete') : Index_Delete]))

WebUI.click(findTestObject('2.Job_Title_Feature/Delete Job Titles/Confirm_Delete_Title'))

WebUI.verifyElementNotPresent(findTestObject('2.Job_Title_Feature/Delete Job Titles/Verify_Element', [('desired_title') : desired_title]), 10)

WebUI.closeBrowser()


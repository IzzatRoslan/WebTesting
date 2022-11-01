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

WebUI.callTestCase(findTestCase('1.User_Management_Feature/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Add Employment Status/Add New Employement'), [('status_name') : 'Test1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Add Employment Status/Add New Employement'), [('status_name') : 'Test2'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Add Employment Status/Add New Employement'), [('status_name') : 'Test3'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Add Employment Status/Add New Employement'), [('status_name') : 'Test4'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Delete Employement Status/Delete Employement Status'), [('Index') : 1
        , ('Index_Status') : 0, ('Status_Name') : '', ('Find_Name') : 'Test1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Delete Employement Status/Delete Employement Status'), [('Index') : 1
        , ('Index_Status') : 0, ('Status_Name') : '', ('Find_Name') : 'Test2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Delete Employement Status/Delete Employement Status'), [('Index') : 1
        , ('Index_Status') : 0, ('Status_Name') : '', ('Find_Name') : 'Test3'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('4.Employment_Status_Feature/Delete Employement Status/Delete Employement Status'), [('Index') : 1
        , ('Index_Status') : 0, ('Status_Name') : '', ('Find_Name') : 'Test4'], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


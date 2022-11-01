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

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Admin_Function'))

WebUI.click(findTestObject('1.User_Management_Feature/Admin/User_Management_DropDown_Menu'))

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Users_Option'))

WebUI.click(findTestObject('1.User_Management_Feature/AddUser/Add_Button'))

WebUI.setText(findTestObject('1.User_Management_Feature/AddUser/Employee_Name'), '')

WebUI.setText(findTestObject('1.User_Management_Feature/AddUser/Username'), '')

WebUI.setText(findTestObject('1.User_Management_Feature/AddUser/Password'), '')

WebUI.setText(findTestObject('1.User_Management_Feature/AddUser/Confirm_Password'), '')

WebUI.click(findTestObject('1.User_Management_Feature/AddUser/button_Save'))

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/Username_Blank'), 0)

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/Password_Blank'), 0)

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/Confirm_Password_Blank'), 0)

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/Employee_Name_Blank'), 0)

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/Status_Blank'), 0)

WebUI.verifyElementPresent(findTestObject('1.User_Management_Feature/AddUser/UserRole_Blank'), 0)

WebUI.closeBrowser()


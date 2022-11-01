import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('1.User_Management_Feature/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Admin_Function'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job Titles'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/Add_Jobtitle_Button'))

WebUI.setText(findTestObject('2.Job_Title_Feature/Add Job Title/Input_Jobtitle'), desired_title)

WebUI.setText(findTestObject('2.Job_Title_Feature/Add Job Title/Input_Job_Description'), Job_Description)

WebUI.uploadFile(findTestObject('2.Job_Title_Feature/Add Job Title/Input'), GlobalVariable.file)

WebUI.setText(findTestObject('2.Job_Title_Feature/Add Job Title/Input_Notes'), Notes)

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/Save_Button'))

WebUI.verifyElementPresent(findTestObject('2.Job_Title_Feature/Add Job Title/Check_Jobtitle_Present', [('Jobtitle') : desired_title]), 10)

WebUI.closeBrowser()


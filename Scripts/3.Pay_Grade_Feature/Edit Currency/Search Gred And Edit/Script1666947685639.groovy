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

WebUI.click(findTestObject('1.User_Management_Feature/Admin/Admin_Function'))

WebUI.click(findTestObject('2.Job_Title_Feature/Add Job Title/li_Job'))

WebUI.click(findTestObject('3.Pay_Grade_Feature/Add Pay Grades/li_Pay Grades'))

Gred_Name = WebUI.getText(findTestObject('3.Pay_Grade_Feature/Delete Currency/Check_Currency_Name', [('Index_Name') : Index_Name]))

println(Gred_Name)

while (Find_Name != Gred_Name) {
    Index_Name++

    Gred_Name = WebUI.getText(findTestObject('3.Pay_Grade_Feature/Delete Currency/Check_Currency_Name', [('Index_Name') : Index_Name]))

    println(Gred_Name)
}

Index_Edit = Index_Name

println(Index_Edit)

WebUI.click(findTestObject('3.Pay_Grade_Feature/Delete Currency/Edit_Button', [('Index_Edit') : Index_Edit]))


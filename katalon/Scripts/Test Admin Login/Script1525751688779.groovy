import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.209.48.20:9089/')

WebUI.click(findTestObject('Admin Login/h1_SE 234 Project'))

WebUI.click(findTestObject('Admin Login/p_This is the mock app for the'))

WebUI.click(findTestObject('Admin Login/h2_Login'))

WebUI.click(findTestObject('Admin Login/label_Username'))

WebUI.click(findTestObject('Admin Login/label_Password'))

WebUI.click(findTestObject('Admin Login/div_Login'))

WebUI.setText(findTestObject('Admin Login/input_username'), 'admin')

WebUI.setText(findTestObject('Admin Login/input_password'), 'admin')

WebUI.click(findTestObject('Admin Login/button_Login'))

WebUI.click(findTestObject('Admin Login/div_Products'))

WebUI.click(findTestObject('Admin Login/a_Total Transaction'))

WebUI.click(findTestObject('Admin Login/h2_Transaction List'))

WebUI.click(findTestObject('Admin Login/th_Transaction ID'))

WebUI.click(findTestObject('Admin Login/th_'))

WebUI.click(findTestObject('Admin Login/th_1'))

WebUI.click(findTestObject('Admin Login/td_1'))

WebUI.click(findTestObject('Admin Login/td_Garden Papaya'))

WebUI.click(findTestObject('Admin Login/td_20120 THB'))

WebUI.click(findTestObject('Admin Login/th_2'))

WebUI.click(findTestObject('Admin Login/td_2'))

WebUI.click(findTestObject('Admin Login/td_Banana Garden Banana Rambut'))

WebUI.click(findTestObject('Admin Login/td_60570 THB'))

WebUI.click(findTestObject('Admin Login/p_Total price  80690 THB'))

WebUI.closeBrowser()


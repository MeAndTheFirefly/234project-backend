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

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/h1_SE 234 Project'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/p_This is the mock app for the'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/h2_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/div_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/div_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/div_Login'), 0)

WebUI.setText(findTestObject('Page_ProjectBackend (3)/input_username'), username)

WebUI.setText(findTestObject('Page_ProjectBackend (3)/input_password'), password)

WebUI.click(findTestObject('Page_ProjectBackend (3)/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/p_This is the mock app for the'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/div_Products'), 0)

WebUI.click(findTestObject('Page_ProjectBackend (3)/a_Total Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_ProjectBackend (3)/div_Transaction List'), 0)

WebUI.closeBrowser()


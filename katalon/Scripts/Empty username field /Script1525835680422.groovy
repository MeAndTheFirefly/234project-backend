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

WebUI.verifyElementPresent(findTestObject('Front Page Objects/header'), 0)

WebUI.verifyElementPresent(findTestObject('Front Page Objects/p_header_description'), 0)

WebUI.verifyElementPresent(findTestObject('Front Page Objects/h2_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Login Objects /label_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Objects /label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Login Objects /div_Login'), 0)

not_run: WebUI.setText(findTestObject('Login Objects /input_username'), '')

WebUI.setText(findTestObject('Login Objects /input_password'), password)

WebUI.click(findTestObject('Login Objects /button_Login_2'))

WebUI.verifyElementPresent(findTestObject('Login Objects /label_Username is required'), 0)

WebUI.closeBrowser()


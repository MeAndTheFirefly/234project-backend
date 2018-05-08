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

WebUI.verifyElementPresent(findTestObject('all_Objects/header'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/p_header_description'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/h2_Login'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/label_Username'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/div_Login'), 0)

WebUI.setText(findTestObject('all_Objects/input_username'), username)

WebUI.setText(findTestObject('all_Objects/input_password'), password)

WebUI.click(findTestObject('all_Objects/button_Login'))

WebUI.verifyElementPresent(findTestObject('all_Objects/header'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/p_header_description'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/div_add to cart'), 0)

WebUI.click(findTestObject('all_Objects/button_Carts'))

WebUI.verifyElementPresent(findTestObject('all_Objects/User_Shopping Cart_header'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/th_Product Name'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/th_Price'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/th_amount'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/p_Total price  0 THB'), 0)

WebUI.verifyElementPresent(findTestObject('all_Objects/div_confirm'), 0)

WebUI.closeBrowser()


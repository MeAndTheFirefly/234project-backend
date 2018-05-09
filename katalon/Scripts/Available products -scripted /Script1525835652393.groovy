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

def data = TestDataFactory.findTestData("Data Files/data.product")


WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.209.48.20:9089/')

WebUI.verifyElementPresent(findTestObject('Front Page Objects/header'), 0)

WebUI.verifyElementPresent(findTestObject('Front Page Objects/p_header_description'), 0)

WebUI.verifyElementPresent(findTestObject('Front Page Objects/h2_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Login Objects /label_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Objects /label_Password'), 0)

WebUI.click(findTestObject('Front Page Objects/h2_Login'))

WebUI.setText(findTestObject('Login Objects /input_username'), username)

WebUI.setText(findTestObject('Login Objects /input_password'), password)

WebUI.click(findTestObject('Login Objects /button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Product Objects/h5_Garden'), data.getValue(2, 1))

WebUI.verifyElementText(findTestObject('Product Objects/p_The garden which you can gro'),data.getValue(3, 1))

WebUI.verifyElementText(findTestObject('Product Objects/h6_Price is 20000.00 THB'), String.format('Price is %,.2f THB', Double.parseDouble(data.getValue(5, 1))))

WebUI.verifyElementText(findTestObject('Product Objects/h5_Banana'), data.getValue(2, 2))

WebUI.verifyElementText(findTestObject('Product Objects/p_A good fruit with very cheap'), data.getValue(3, 2))

WebUI.verifyElementText(findTestObject('Product Objects/h6_Price is 150.00 THB'), String.format('Price is %,.2f THB', Double.parseDouble(data.getValue(5, 2))))

WebUI.verifyElementText(findTestObject('Product Objects/h5_Orange'), data.getValue(2, 3))

WebUI.verifyElementText(findTestObject('Product Objects/p_Nothing good about it'), data.getValue(3, 3))

WebUI.verifyElementText(findTestObject('Product Objects/h6_Price is 280.00 THB'), String.format('Price is %,.2f THB', Double.parseDouble(data.getValue(5, 3))))

WebUI.verifyElementText(findTestObject('Product Objects/h5_Papaya'), data.getValue(2, 4))

WebUI.verifyElementText(findTestObject('Product Objects/p_Use for papaya salad'), data.getValue(3, 4))

WebUI.verifyElementText(findTestObject('Product Objects/h6_Price is 12.00 THB'), String.format('Price is %,.2f THB', Double.parseDouble(data.getValue(5, 4))))

WebUI.verifyElementText(findTestObject('Product Objects/h5_Rambutan'), data.getValue(2, 5))

WebUI.verifyElementText(findTestObject('Product Objects/p_An expensive fruit from the'), data.getValue(3, 5))

WebUI.verifyElementText(findTestObject('Product Objects/h6_Price is 20.00 THB'), String.format('Price is %,.2f THB', Double.parseDouble(data.getValue(5, 5))))

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('input_username (4)'), 'user')

WebUI.setText(findTestObject('input_password (3)'), 'user')

WebUI.click(findTestObject('button_Login (3)'))

WebUI.click(findTestObject('a_Carts (1)'))

WebUI.click(findTestObject('a_Products (1)'))

WebUI.click(findTestObject('button_add to cart (2)'))

WebUI.click(findTestObject('div_already added (2)'))

WebUI.click(findTestObject('button_add to cart (2)'))

WebUI.click(findTestObject('div_already added (2)'))

WebUI.click(findTestObject('a_Carts            2 (1)'))

WebUI.click(findTestObject('td_Garden (2)'))

WebUI.click(findTestObject('td_20000 THB (2)'))

WebUI.click(findTestObject('td (2)'))

WebUI.click(findTestObject('td_Banana (1)'))

WebUI.click(findTestObject('td_150 THB (1)'))

WebUI.click(findTestObject('td_1 (1)'))

WebUI.click(findTestObject('p_Total price  20150 THB (1)'))

WebUI.click(findTestObject('div_confirm'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('User Login/h1_SE 234 Project'))

WebUI.click(findTestObject('User Login/p_This is the mock app for the'))

WebUI.click(findTestObject('User Login/h2_Login'))

WebUI.click(findTestObject('User Login/label_Username'))

WebUI.click(findTestObject('User Login/label_Password'))

WebUI.click(findTestObject('User Login/div_Login'))

WebUI.setText(findTestObject('User Login/input_username'), 'user')

WebUI.setText(findTestObject('User Login/input_password'), 'user')

WebUI.click(findTestObject('User Login/button_Login'))

WebUI.click(findTestObject('User Login/h1_SE 234 Project'))

WebUI.click(findTestObject('User Login/p_This is the mock app for the'))

WebUI.click(findTestObject('User Login/div_Products'))

WebUI.click(findTestObject('User Login/a_Carts'))

WebUI.click(findTestObject('User Login/h2_Shopping Cart'))

WebUI.click(findTestObject('User Login/th_'))

WebUI.click(findTestObject('User Login/th_Product Name'))

WebUI.click(findTestObject('User Login/th_Price'))

WebUI.click(findTestObject('User Login/th_amount'))

WebUI.click(findTestObject('User Login/p_Total price  0 THB'))

WebUI.click(findTestObject('User Login/div_confirm'))

WebUI.click(findTestObject('User Login/a_Products'))

WebUI.click(findTestObject('User Login/h2_Products'))

WebUI.click(findTestObject('User Login/div_add to cart'))

WebUI.click(findTestObject('User Login/div_add to cart'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('change quantity/h1_SE 234 Project'))

WebUI.click(findTestObject('change quantity/p_This is the mock app for the'))

WebUI.click(findTestObject('change quantity/h2_Login'))

WebUI.click(findTestObject('change quantity/div_Username'))

WebUI.click(findTestObject('change quantity/div_Password'))

WebUI.click(findTestObject('change quantity/div_Login'))

WebUI.setText(findTestObject('change quantity/input_username'), 'user')

WebUI.setText(findTestObject('change quantity/input_password'), 'user')

WebUI.click(findTestObject('change quantity/button_Login'))

WebUI.click(findTestObject('change quantity/div_Products'))

WebUI.click(findTestObject('change quantity/div_Garden            The gard'))

WebUI.click(findTestObject('change quantity/button_add to cart'))

WebUI.click(findTestObject('change quantity/div_already added'))

WebUI.click(findTestObject('change quantity/div_Banana            A good f'))

WebUI.click(findTestObject('change quantity/button_add to cart'))

WebUI.click(findTestObject('change quantity/div_already added'))

WebUI.click(findTestObject('change quantity/a_Carts            2'))

WebUI.click(findTestObject('change quantity/div_Shopping Cart'))

WebUI.click(findTestObject('change quantity/th_'))

WebUI.click(findTestObject('change quantity/th_Product Name'))

WebUI.click(findTestObject('change quantity/th_Price'))

WebUI.click(findTestObject('change quantity/th_amount'))

WebUI.click(findTestObject('change quantity/th_1'))

WebUI.click(findTestObject('change quantity/td_Garden'))

WebUI.click(findTestObject('change quantity/td_20000 THB'))

WebUI.click(findTestObject('change quantity/td'))

WebUI.click(findTestObject('change quantity/th_2'))

WebUI.click(findTestObject('change quantity/td_Banana'))

WebUI.click(findTestObject('change quantity/td_150 THB'))

WebUI.click(findTestObject('change quantity/td_1'))

WebUI.click(findTestObject('change quantity/p_Total price  20150 THB'))

WebUI.click(findTestObject('change quantity/div_confirm'))

WebUI.setText(findTestObject('change quantity/input_amount'), '2')

WebUI.click(findTestObject('change quantity/div_Total price  40150 THB'))

WebUI.closeBrowser()


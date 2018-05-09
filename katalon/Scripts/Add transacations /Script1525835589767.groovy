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

WebUI.click(findTestObject('test add transcation/h1_SE 234 Project'))

WebUI.click(findTestObject('test add transcation/p_This is the mock app for the'))

WebUI.click(findTestObject('test add transcation/h2_Login'))

WebUI.click(findTestObject('test add transcation/div_Username'))

WebUI.click(findTestObject('test add transcation/div_Password'))

WebUI.click(findTestObject('test add transcation/div_Login'))

WebUI.setText(findTestObject('test add transcation/input_username'), 'user')

WebUI.setText(findTestObject('test add transcation/input_password'), 'user')

WebUI.click(findTestObject('test add transcation/button_Login'))

WebUI.click(findTestObject('test add transcation/div_Products'))

WebUI.click(findTestObject('test add transcation/h2_Products'))

WebUI.click(findTestObject('test add transcation/div_Garden            The gard'))

WebUI.click(findTestObject('test add transcation/button_add to cart'))

WebUI.click(findTestObject('test add transcation/div_already added'))

WebUI.click(findTestObject('test add transcation/div_Banana            A good f'))

WebUI.click(findTestObject('test add transcation/button_add to cart'))

WebUI.click(findTestObject('test add transcation/div_already added'))

WebUI.click(findTestObject('test add transcation/div_Products                  _1'))

WebUI.click(findTestObject('test add transcation/a_Carts            2'))

WebUI.click(findTestObject('test add transcation/div_Shopping Cart'))

WebUI.click(findTestObject('test add transcation/th_'))

WebUI.click(findTestObject('test add transcation/th_Product Name'))

WebUI.click(findTestObject('test add transcation/th_Price'))

WebUI.click(findTestObject('test add transcation/th_amount'))

WebUI.click(findTestObject('test add transcation/th_1'))

WebUI.click(findTestObject('test add transcation/td_Garden'))

WebUI.click(findTestObject('test add transcation/td_20000 THB'))

WebUI.click(findTestObject('test add transcation/td'))

WebUI.click(findTestObject('test add transcation/th_2'))

WebUI.click(findTestObject('test add transcation/td_Banana'))

WebUI.click(findTestObject('test add transcation/td_150 THB'))

WebUI.click(findTestObject('test add transcation/td_1'))

WebUI.click(findTestObject('test add transcation/p_Total price  20150 THB'))

WebUI.click(findTestObject('test add transcation/div_confirm'))

WebUI.click(findTestObject('test add transcation/button_confirm'))

WebUI.acceptAlert()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.209.48.20:9089/')

WebUI.click(findTestObject('Page_ProjectBackend/h1_SE 234 Project'))

WebUI.click(findTestObject('Page_ProjectBackend/p_This is the mock app for the'))

WebUI.click(findTestObject('Page_ProjectBackend/h2_Login'))

WebUI.click(findTestObject('Page_ProjectBackend/div_Username'))

WebUI.click(findTestObject('Page_ProjectBackend/div_Password'))

WebUI.click(findTestObject('Page_ProjectBackend/div_Login'))

WebUI.setText(findTestObject('Page_ProjectBackend/input_username'), 'admin')

WebUI.setText(findTestObject('Page_ProjectBackend/input_password'), 'admin')

WebUI.click(findTestObject('Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend/div_Products'))

WebUI.click(findTestObject('Page_ProjectBackend/a_Total Transaction'))

WebUI.click(findTestObject('Page_ProjectBackend/td_Garden Banana'))

WebUI.click(findTestObject('Page_ProjectBackend/td_20150 THB'))

WebUI.closeBrowser()


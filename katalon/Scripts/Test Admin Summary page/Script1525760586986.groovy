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

WebUI.click(findTestObject('Page_ProjectBackend (2)/h1_SE 234 Project'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/p_This is the mock app for the'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/h2_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/div_Username'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/div_Password'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/div_Login'))

WebUI.setText(findTestObject('Page_ProjectBackend (2)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_ProjectBackend (2)/input_password'), 'admin')

WebUI.click(findTestObject('Page_ProjectBackend (2)/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/div_Products'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/a_Total Transaction'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/div_Transaction List'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/th_'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/th_Transaction ID'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/th_Products'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/th_1'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_1'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_Garden Papaya'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/th_2'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_2'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_Banana Garden Banana Rambut'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_20120 THB'))

WebUI.click(findTestObject('Page_ProjectBackend (2)/td_60570 THB'))

WebUI.closeBrowser()


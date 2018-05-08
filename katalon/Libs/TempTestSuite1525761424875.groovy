import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Test Suite 1')

suiteProperties.put('name', 'Test Suite 1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/snailwalker/Documents/workspace/backend/katalon/Reports/Test Suite 1/20180508_133704/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test Suite 1', suiteProperties, [new TestCaseBinding('Test Cases/Test User Logout', 'Test Cases/Test User Logout',  null), new TestCaseBinding('Test Cases/Test Admin Login', 'Test Cases/Test Admin Login',  null), new TestCaseBinding('Test Cases/Test All Login Page elements present', 'Test Cases/Test All Login Page elements present',  null), new TestCaseBinding('Test Cases/Test User Login Fail', 'Test Cases/Test User Login Fail',  null), new TestCaseBinding('Test Cases/Test Available Products for Users', 'Test Cases/Test Available Products for Users',  null), new TestCaseBinding('Test Cases/Test Empty Password Field', 'Test Cases/Test Empty Password Field',  null), new TestCaseBinding('Test Cases/Test User change quantity', 'Test Cases/Test User change quantity',  null), new TestCaseBinding('Test Cases/Test Admin Summary page', 'Test Cases/Test Admin Summary page',  null), new TestCaseBinding('Test Cases/Test add Transacation with confirm button', 'Test Cases/Test add Transacation with confirm button',  null), new TestCaseBinding('Test Cases/Test Empty Username field', 'Test Cases/Test Empty Username field',  null), new TestCaseBinding('Test Cases/Test User Login', 'Test Cases/Test User Login',  null), new TestCaseBinding('Test Cases/Test user add products to cart', 'Test Cases/Test user add products to cart',  null)])

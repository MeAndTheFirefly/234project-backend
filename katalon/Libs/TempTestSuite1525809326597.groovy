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


suiteProperties.put('id', 'Test Suites/Data-Driven Test Suites')

suiteProperties.put('name', 'Data-Driven Test Suites')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/snailwalker/Documents/workspace/backend/katalon/Reports/Data-Driven Test Suites/20180509_025526/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Data-Driven Test Suites', suiteProperties, [new TestCaseBinding('Test Cases/Test User Login - Iteration 1', 'Test Cases/Test User Login',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test User Login - Iteration 2', 'Test Cases/Test User Login',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test Admin Login', 'Test Cases/Test Admin Login',  [ 'password' : 'admin' , 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test Available Products for Users - Scripted - Iteration 1', 'Test Cases/Test Available Products for Users - Scripted',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test Available Products for Users - Scripted - Iteration 2', 'Test Cases/Test Available Products for Users - Scripted',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test All Login Page elements present', 'Test Cases/Test All Login Page elements present',  null), new TestCaseBinding('Test Cases/Test User Logout - Iteration 1', 'Test Cases/Test User Logout',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test User Logout - Iteration 2', 'Test Cases/Test User Logout',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Test User Login Fail', 'Test Cases/Test User Login Fail',  [ 'wrong_password' : 'wrongpass' , 'incorrect_user' : 'firefly' ,  ]), new TestCaseBinding('Test Cases/Test Empty Password Field - Iteration 1', 'Test Cases/Test Empty Password Field',  [ 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Test Empty Password Field - Iteration 2', 'Test Cases/Test Empty Password Field',  [ 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Test Empty Password Field - Iteration 3', 'Test Cases/Test Empty Password Field',  [ 'username' : 'hello' ,  ])])

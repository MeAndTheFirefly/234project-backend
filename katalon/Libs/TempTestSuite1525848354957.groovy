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


suiteProperties.put('id', 'Test Suites/Data-Driven Tests Suite')

suiteProperties.put('name', 'Data-Driven Tests Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/snailwalker/Documents/workspace/backend/katalon/Reports/Data-Driven Tests Suite/20180509_134554/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Data-Driven Tests Suite', suiteProperties, [new TestCaseBinding('Test Cases/User Login - Iteration 1', 'Test Cases/User Login',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/User Login - Iteration 2', 'Test Cases/User Login',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Admin login ', 'Test Cases/Admin login ',  [ 'password' : 'admin' , 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Available products -scripted  - Iteration 1', 'Test Cases/Available products -scripted ',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Available products -scripted  - Iteration 2', 'Test Cases/Available products -scripted ',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Login page ', 'Test Cases/Login page ',  null), new TestCaseBinding('Test Cases/User logout  - Iteration 1', 'Test Cases/User logout ',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/User logout  - Iteration 2', 'Test Cases/User logout ',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/User login fail ', 'Test Cases/User login fail ',  [ 'wrong_password' : 'wrongpass' , 'incorrect_user' : 'firefly' ,  ]), new TestCaseBinding('Test Cases/Empty password field  - Iteration 1', 'Test Cases/Empty password field ',  [ 'username' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Empty password field  - Iteration 2', 'Test Cases/Empty password field ',  [ 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Empty password field  - Iteration 3', 'Test Cases/Empty password field ',  [ 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Empty username field  - Iteration 1', 'Test Cases/Empty username field ',  [ 'password' : 'admin' ,  ]), new TestCaseBinding('Test Cases/Empty username field  - Iteration 2', 'Test Cases/Empty username field ',  [ 'password' : 'user' ,  ]), new TestCaseBinding('Test Cases/Empty username field  - Iteration 3', 'Test Cases/Empty username field ',  [ 'password' : 'hello' ,  ]), new TestCaseBinding('Test Cases/User change item quantity  - Iteration 1', 'Test Cases/User change item quantity ',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/User change item quantity  - Iteration 2', 'Test Cases/User change item quantity ',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/User add products - Iteration 1', 'Test Cases/User add products',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/User add products - Iteration 2', 'Test Cases/User add products',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Add transacations  - Iteration 1', 'Test Cases/Add transacations ',  [ 'password' : 'user' , 'username' : 'user' ,  ]), new TestCaseBinding('Test Cases/Add transacations  - Iteration 2', 'Test Cases/Add transacations ',  [ 'password' : 'hello' , 'username' : 'hello' ,  ]), new TestCaseBinding('Test Cases/Admin summary page ', 'Test Cases/Admin summary page ',  [ 'password' : 'admin' , 'username' : 'admin' ,  ])])

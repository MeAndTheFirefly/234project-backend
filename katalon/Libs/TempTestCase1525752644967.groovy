import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/hk/nwr1mc4d5rqfft5wmcyrv_0r0000gn/T/Katalon/Test Cases/Test Empty Username field/20180508_111044/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Test Empty Username field', new TestCaseBinding('Test Cases/Test Empty Username field', [:]), FailureHandling.STOP_ON_FAILURE , false)
    

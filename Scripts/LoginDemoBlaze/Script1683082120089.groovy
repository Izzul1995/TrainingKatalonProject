import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Initialize test data
TestData data = TestDataFactory.findTestData('Data Files/LoginData')

// Get username and password from test data
String username = data.getValue('username', 1)
String password = data.getValue('password', 1)

// Open browser and navigate to login page
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.baseUrl)

// Enter username and password
WebUI.setText(findTestObject('Page_Login/txt_izz'), username)
WebUI.setText(findTestObject('Page_Login/txt_sirvenchota'), password)

// Click on login button
WebUI.click(findTestObject('Page_Login/btn_Login'))

// Verify that user is logged in
WebUI.verifyElementVisible(findTestObject('Page_Home/txt_WelcomeMessage'))

// Logout
WebUI.click(findTestObject('Page_Home/btn_Logout'))

// Verify that user is logged out
WebUI.verifyElementVisible(findTestObject('Page_Login/txt_izz'))
WebUI.verifyElementVisible(findTestObject('Page_Login/txt_sirvenchota'))

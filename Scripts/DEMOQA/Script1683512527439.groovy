import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Name_firstName'), 'IZZUL')

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Name_lastName'), 'MUSTAQIM')

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Email_userEmail'), 'izzul@gmail')

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Email_userEmail'), 'izzulmustaqim95@gmail.com')

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_(10 Digits)_userNumber'), '0143169151')

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '08 May 2023')

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2014', true)

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_14'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/input_Subjects_subjectsInput'), 'ma')

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/label_Music'))

WebUI.setText(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/textarea_Current Address_currentAddress'), 'bumi')

WebUI.scrollToElement(findTestObject('DEMOQA1/Page_DEMOQA/div_Select State'), 0)

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/svg_Select City_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/div_Delhi'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/DEMOQA1/Page_DEMOQA/button_Close'))


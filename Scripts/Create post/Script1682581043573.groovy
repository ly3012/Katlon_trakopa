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

WebUI.navigateToUrl('http://localhost:32000/login')

WebUI.setText(findTestObject('Page_Social Network/input_Phone_phone'), '036 767 306 8')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Social Network/input_Phone_password'), '8hpL1O2nqpDAgR9zh5PFjQ==')

WebUI.click(findTestObject('Object Repository/Page_Social Network/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/button_Chia s cm ngh ca bn'))

WebUI.setText(findTestObject('Object Repository/Page_Social Network/textarea_kim th chc nng ng bi'), 'Test create post')

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_Th loi'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/span_Vn phng'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/button_ng'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/div_Check in'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/h4_Thnh ph H Ni'))

WebUI.click(findTestObject('Object Repository/Page_Social Network/button_ng bi vit'))

WebUI.closeBrowser()

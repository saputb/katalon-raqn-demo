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

WebUI.navigateToUrl('https://www-beta-henkel-adhesives-com.ref.web.raqn.io/us/en.html/please-log-me-in')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/Text_Cookies_Adhesive'))

WebUI.click(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/button_Accept All Cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/heliux-icon'))

WebUI.click(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/a_LOG IN'))

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.getWindowTitle()

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Program Now Login/p_Login to enter your account'))

WebUI.setText(findTestObject('Object Repository/Page_Program Now Login/input_Email Address_Email Address'), 'programnow-ah@10minmail.de ')

WebUI.setText(findTestObject('Object Repository/Page_Program Now Login/input_Forgot your password_Password'), 'Test12345')

WebUI.click(findTestObject('Object Repository/Page_Program Now Login/button_Sign in'))

WebUI.getWindowTitle()

WebUI.switchToWindowIndex(0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/heliux-icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/h1_Hello Testing Account2'), 
    'Hello Testing Account2!')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/a_Products'), 'Products')

WebUI.click(findTestObject('Object Repository/Page_Henkel Adhesive Technologies/a_Products'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Products/a_COMPARE_teaserlist__item-link'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Products/a_VIEW'))

WebUI.click(findTestObject('Object Repository/Page_Products/a_VIEW'))


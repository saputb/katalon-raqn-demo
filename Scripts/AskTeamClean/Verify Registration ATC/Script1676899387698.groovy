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

WebUI.navigateToUrl('https://www.askteamclean.com/us/en.html')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Ask Team Clean/button_Accept Cookies'), 5)

WebUI.click(findTestObject('Object Repository/Page_Ask Team Clean/button_Accept Cookies'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Ask Team Clean/span_Sign Up NOW'), 'Sign Up NOW!')

WebUI.click(findTestObject('Object Repository/Page_Ask Team Clean/a_Sign Up NOW'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Registration_AskTeamClean/div_or                                     _9ec5d2'), 
    5)

WebUI.setText(findTestObject('Object Repository/Page_Registration_AskTeamClean/input_or_profile.firstName'), 'Henkel')

WebUI.setText(findTestObject('Object Repository/Page_Registration_AskTeamClean/input_or_profile.lastName'), 'Tester')

int RN

RN = ((Math.random() * 1000) as int)

WebUI.setText(findTestObject('Page_Registration_AskTeamClean/input_or_email'), ('dontobono+' + RN) + '@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Registration_AskTeamClean/input_or_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.setEncryptedText(findTestObject('Page_Registration_AskTeamClean/input_or_passwordRetype'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.verifyElementText(findTestObject('Page_Registration_AskTeamClean/span_Yes, Id like to sign up to receive the latest news, special offers, and promotions from Ask Team Clean and other Henkel Brands. I can opt-out at any time'), 
    'Yes, I’d like to sign up to receive the latest news, special offers, and promotions from Ask Team Clean and other Henkel Brands. I can opt-out at any time.')

WebUI.verifyElementPresent(findTestObject('Page_Registration_AskTeamClean/span_Yes, I accept the Terms of Use. For information on purposes for which we use your information, see our Privacy Policy and CA Privacy Notice'), 
    0)

WebUI.click(findTestObject('Page_Registration/input_Indicates a required field_gigya-input-submit'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Welcome_AskTeamClean/h1_Check your emails'), 'Check your emails')

WebUI.waitForElementPresent(findTestObject('Page_Welcome_AskTeamClean/span_We have sent you a verification email'), 0)

WebUI.closeBrowser()


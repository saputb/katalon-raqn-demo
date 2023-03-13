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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www-program-now-test-com.dev2.web.raqn.io/us/en/contact-us/newsletter-registration.html/please-log-me-in')

WebUI.click(findTestObject('Object Repository/Page_Landing page/button_Accept Cookies'))

int RN

RN = ((Math.random() * 1000) as int)

WebUI.setText(findTestObject('Page_Landing page/input_Email address_user.email'), ('dontobono+' + RN) + '@gmail.com')

WebUI.verifyElementClickable(findTestObject('Page_Landing page/label_Mr'))

WebUI.scrollToElement(findTestObject('Page_Landing page/input_Company name_organization.name'), 0)

WebUI.check(findTestObject('Page_Landing page/input_Salutation_user.salutation'))

WebUI.setText(findTestObject('Object Repository/Page_Landing page/input_First name_user.firstName'), 'testing123')

WebUI.setText(findTestObject('Object Repository/Page_Landing page/input_Last name_user.surname'), 'Doe')

WebUI.scrollToElement(findTestObject('Page_Landing page/input_First name_user.firstName'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Landing page/input_Company name_organization.name'), 'Henkel ')

WebUI.click(findTestObject('Object Repository/Page_Landing page/p_Henkel of America, Inc'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Landing page/div_United States'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Landing page/input_State_organization.address.state'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Landing page/input_Street_organization.address.street'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Landing page/input_Zip Code_organization.address.zipCode'), 
    0)

WebUI.scrollToElement(findTestObject('Page_Landing page/input_Select all_user.consent'), 0)

WebUI.click(findTestObject('Object Repository/Page_Landing page/div_'))

WebUI.click(findTestObject('Object Repository/Page_Landing page/div_Industrial Manufacturing'))

WebUI.click(findTestObject('Object Repository/Page_Landing page/div_'))

WebUI.click(findTestObject('Page_Landing page/div_3d Printing'))

WebUI.click(findTestObject('Object Repository/Page_Landing page/input_Accessibility-Adhesiveshenkel.com_sel_358937'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Landing page/input_Select all_user.consent'))

WebUI.click(findTestObject('Object Repository/Page_Landing page/button_SIGN UP'))

WebUI.click(findTestObject('Object Repository/Page_Just one more step/button_Accept Cookies'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Just one more step/h3_Thanks so much for your interest in Henk_3a507b'), 
    'Thanks so much for your interest in Henkel Adhesive Technologies. Keep an eye on your inbox for next steps.')

WebUI.closeBrowser()


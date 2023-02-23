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

WebUI.navigateToUrl('https://www.askteamclean.com/us/en/profile/login.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Login/div_This website uses cookies to optimize y_323297'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Login/div_This website uses cookies to optimize y_323297'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/button_Accept Cookies'), 0)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Accept Cookies'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/div_or                                I for_5fcb69'), 
    0)

WebUI.setEncryptedText(findTestObject('Page_Login/input_or_username'), '13kZ8gQ78EDBcCNmg339zDKsqBmecz/GYnEFWYF0PJ8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_or_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/input_I forgot my password_gigya-input-submit'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Login/input_I forgot my password_gigya-input-submit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/div_Edit Profile                           _ac1949'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/label_Hi Bobby,'), 
    'Hi Bobby,')

WebUI.mouseOver(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Tips  Tricks'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/button_Laundry  Cleaning'), 
    'Laundry & Cleaning')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Laundry'), 'Laundry')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Cleaning'), 'Cleaning')

WebUI.mouseOver(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Benefits  Offers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Laundry Symbol Scanner'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/a_Free Persil Sample'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/button_BS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Welcome back Explore Ask Team Clean now/div_Logout'))


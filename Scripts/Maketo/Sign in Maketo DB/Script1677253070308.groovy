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

WebUI.navigateToUrl('https://engage-nld1.marketo.com/')

WebUI.click(findTestObject('Object Repository/Page_Adobe Marketo Engage/span_Visit login page'))

WebUI.setText(findTestObject('Object Repository/Page_Login  Marketo/input_Sign in_username'), 'bobby.saputra@henkel.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Marketo/input_Sign in_passwd'), 'Yfa5TRcb5gPSXG6kNMVWvg==')

WebUI.click(findTestObject('Object Repository/Page_Login  Marketo/input_Forgot Password_loginButton'))

WebUI.click(findTestObject('Object Repository/Page_Mein Marketo/span_Datenbank_homeTile-1030-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Page_UhlmannTest  Datenbank/svg_Smart Lists fr Gruppen_TreeNodeContent__c54355'))

WebUI.click(findTestObject('Object Repository/Page_Global  Datenbank/a_Alle Personen'))

WebUI.click(findTestObject('Object Repository/Page_Alle Personen  Smart Lists fr System  _a162ad/span_Personal'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Alle Personen  Smart Lists fr System  _a162ad/input_von 2126_ext-comp-1132'), 
    'dontobono')

WebUI.click(findTestObject('Object Repository/Page_Alle Personen  Smart Lists fr System  _a162ad/img_von 2126_ext-gen298'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Alle Personen  Smart Lists fr System  _a162ad/div_testing123'))

WebUI.switchToWindowTitle('Alle Personen • Smart Lists für System • Datenbank')

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_testing123 Doe - Skidmore, Owings  Mer_6f5e0f/input_Zuerst_First Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_testing123 Doe - Skidmore, Owings  Mer_6f5e0f/input_Zuletzt_Last Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_testing123 Doe - Skidmore, Owings  Mer_6f5e0f/input_E-Mail_Email Address'), 
    0)


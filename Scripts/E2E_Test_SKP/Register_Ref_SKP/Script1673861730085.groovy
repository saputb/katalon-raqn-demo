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

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/enregistrer.html/please-log-me-in')

WebUI.verifyElementVisible(findTestObject('Page_Senregistrer/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Page_Senregistrer/button_Autoriser tous les cookies'))

WebUI.setText(findTestObject('Page_Senregistrer/input_E-mail_email'), 'dontobono@gmail.com')

WebUI.setText(findTestObject('Page_Senregistrer/input_Mot de passe_password'), 'Test123!!!')

String Ms = WebUI.verifyTextPresent('invalid email address', false)

if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 500) as int)

    WebUI.setText(findTestObject('Page_Senregistrer/input_E-mail_email'), ('dontobono' + RN) + '@gmail.com')

    WebUI.click(findTestObject('Page_Senregistrer/input_Prfrences de communication_gigya-input-submit'))

} else {
    WebUI.comment('Registration Successful')
}


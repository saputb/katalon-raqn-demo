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

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/enregistrer.html/please-log-me-in')

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input'))

// WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_E-mail_email'), 'dontobono@gmail.com')
int RN

RN = ((Math.random() * 1000) as int)

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_E-mail_email'), ('dontobono+' + RN) + '@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Senregistrer/input_Mot de passe_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Senregistrer/input_Confirmer le mot de passe_passwordRetype'), 
    'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Senregistrer/select_Mme.M.Div'), 'mr', true)

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Prnom_profile.firstName'), 'Bobby')

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Nom_profile.lastName'), 'Saputra')

WebUI.setText(findTestObject('Page_Senregistrer/input_Date de naissance_local.birthday'), '27/11/1980')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Senregistrer/select_Propritaire de salonChane de salonsS_4b2a29'), 
    'salon_owner', true)

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Nom du salon ou dnomination commercia_86907a'))

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Nom du salon ou dnomination commercia_86907a'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input__data.SKP.ID'), '1444669')

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Ligne dadresse 1_data.SKP.billingAddr_94b9a1'), 
    '42 rue Michel Ange')

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Ville_data.SKP.billingAddress.city'), 'Le Havre')

WebUI.setText(findTestObject('Object Repository/Page_Senregistrer/input_Code postal_data.SKP.billingAddress.zip'), '76610')

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Pays_preferences.terms.HenkelSKPeAcad_dba1a9'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_11c1ef'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_c9f577'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_0ddd69'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_gigya-inpu_cec64f'))

WebUI.getUrl()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Senregistrer/h2_Profitez des avantages de'), 'Profitez des avantages de')

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input'))

WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/heliux-grid_section-f47ba71989           --_0c9352'))

WebUI.closeBrowser()


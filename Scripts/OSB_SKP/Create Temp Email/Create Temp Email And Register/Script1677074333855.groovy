import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.minuteinbox.com/')

WebUI.waitForPageLoad(5)

GlobalVariable.varTemEmail = WebUI.getText(findTestObject('Page_MinuteInbox  10 Minute Mail Service/placeholder_temp_email'))

println(GlobalVariable.varTemEmail)

WebUI.waitForPageLoad(5)

//WebUI.switchToWindowIndex(1)
String currentPage = WebUI.getUrl()

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl(currentPage)

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/enregistrer.html/please-log-me-in')

// WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/enregistrer.html/please-log-me-in')
WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'), 0)

WebUI.click(findTestObject('Object Repository/Page_Welcome_AskTeamClean/button_Autoriser tous les cookies'))

WebUI.verifyElementPresent(findTestObject('Page_Senregistrer/div_Interests, skills and knowledgeStartYou can quit anytime and Continue later'), 
    0)

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input'))

WebUI.setText(findTestObject('Page_Senregistrer/input_E-mail_email'), GlobalVariable.varTemEmail)

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

WebUI.click(findTestObject('Page_Senregistrer/input_Pays_preferences.terms.HenkelSKPeAcad_dba1a9'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_11c1ef'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_c9f577'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_subscripti_0ddd69'))

WebUI.click(findTestObject('Object Repository/Page_Senregistrer/input_Prfrences de communication_gigya-inpu_cec64f'))

WebUI.getUrl()

WebUI.verifyElementText(findTestObject('Object Repository/Page_Senregistrer/h2_Profitez des avantages de'), 'Profitez des avantages de')

WebUI.delay(10)

WebUI.switchToWindowIndex(currentTab + 0)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_MinuteInbox  10 Minute Mail Service/td_Schwarzkopf Professional'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_MinuteInbox  10 Minute Mail Address/a_VRIFIER VOTRE COMPTE'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_MinuteInbox  10 Minute Mail Address/a_VRIFIER VOTRE COMPTE'))

WebUI.delay(10)

WebUI.switchToWindowIndex(currentTab + 0)

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/login.html/please-log-me-in')

WebUI.delay(3)

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Senregistrer/div_Interests, skills and knowledgeStartYou can quit anytime and Continue later'), 
    0)

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_E-mail_username'), GlobalVariable.varTemEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Mot de passe_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Page_Accueil/span_BS'))

WebUI.click(findTestObject('Page_Welcome/a_Profil'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('Page_Profile/span_SUPPRIMER LE COMPTE'))

WebUI.click(findTestObject('Page_Profile/span_CONFIRMER'))

WebUI.closeBrowser()


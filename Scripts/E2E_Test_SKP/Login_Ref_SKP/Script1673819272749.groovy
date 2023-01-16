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

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue.html/please-log-me-in')

WebUI.verifyElementVisible(findTestObject('Page_Welcome/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Page_Welcome/button_Autoriser tous les cookies'))

WebUI.mouseOver(findTestObject('Page_Welcome/button__login__button login__button--login cta'))

WebUI.click(findTestObject('Page_Welcome/a_CONNEXION'))

WebUI.getWindowTitle()

WebUI.verifyElementVisible(findTestObject('Page_Login/div_BIENVENUE  NOUVEAU               Connectez-vous  votre compte                    E-mail                                                                    Mot de passe'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Login/input_E-mail_username'), 'bobby.saputra@henkel.com')

WebUI.setText(findTestObject('Page_Login/input_Mot de passe_password'), 'Test123!!!')

WebUI.click(findTestObject('Page_Login/input_Vous avez oubli votre mot de passe_gigya-input-submit'))

WebUI.verifyElementPresent(findTestObject('Page_Login/h2_Login in progress Title FR'), 0)

WebUI.delay(5)

WebUI.delay(5)

WebUI.getWindowTitle()

WebUI.verifyElementVisible(findTestObject('Page_Accueil/a_ACCUEIL'))

WebUI.verifyElementVisible(findTestObject('Page_Accueil/a_MON APPRENTISSAGE'))

WebUI.verifyElementVisible(findTestObject('Page_Accueil/a_CATALOGUE'))

WebUI.verifyElementVisible(findTestObject('Page_Accueil/h1_ASK EDUCATION'))

WebUI.verifyElementVisible(findTestObject('Page_Accueil/h1_BIENVENUE SUR LA NOUVELLE eACADEMY'))

WebUI.verifyElementClickable(findTestObject('Page_Accueil/a_QUAIMERIEZ-VOUS APPRENDRE'))

WebUI.click(findTestObject('Page_Accueil/a_QUAIMERIEZ-VOUS APPRENDRE'))

WebUI.getWindowTitle()

WebUI.verifyElementVisible(findTestObject('Page_Catalogue/h1_APPRENDRE ET PROGRESSER'))

WebUI.mouseOver(findTestObject('Page_Catalogue/button_BS'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Page_Catalogue/button_SE DCONNECTER'))

WebUI.click(findTestObject('Page_Catalogue/button_SE DCONNECTER'))

WebUI.getWindowTitle()

WebUI.closeBrowser()


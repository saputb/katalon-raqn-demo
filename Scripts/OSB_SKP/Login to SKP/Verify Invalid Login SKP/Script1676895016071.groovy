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

WebUI.navigateToUrl('https://eacademy-schwarzkopf-professional-com.ref.web.raqn.io/fr/fr/bienvenue/login.html/please-log-me-in')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'), 0)

WebUI.click(findTestObject('Object Repository/Page_Welcome_AskTeamClean/button_Autoriser tous les cookies'))

WebUI.verifyElementPresent(findTestObject('Page_Login/div_Interests, skills and knowledgeStartYou can quit anytime and Continue later'), 
    0)

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_E-mail_username'), '13kZ8gQ78EDBcCNmg339zDKsqBmecz/GYnEFWYF0PJ8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Mot de passe_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/div_Identifiant ou mot de passe non valide'), 'Identifiant ou mot de passe non valide')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/div_Identifiant ou mot de passe non valide'), 'Identifiant ou mot de passe non valide')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/div_Identifiant ou mot de passe non valide'), 'Identifiant ou mot de passe non valide')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Mot de passe_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.mouseOver(findTestObject('Object Repository/Page_Accueil/button_BS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Accueil/button_SE DCONNECTER'))

WebUI.click(findTestObject('Object Repository/Page_Accueil/button_SE DCONNECTER'))

WebUI.closeBrowser()


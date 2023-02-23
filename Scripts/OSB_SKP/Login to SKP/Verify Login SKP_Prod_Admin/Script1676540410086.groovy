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

WebUI.navigateToUrl('https://eacademy.schwarzkopf-professional.com/fr/fr/bienvenue/login.html')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login/div_Merci daccepter les cookies pour bnfici_96c076'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'), 'Autoriser tous les cookies')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_E-mail_username'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_E-mail_username'), 'p.koehler90@gmx.de')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Mot de passe_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('https://eacademy.schwarzkopf-professional.com/fr/fr/bienvenue/sso/initsso.html')

WebUI.getUrl()

WebUI.switchToWindowTitle('Administrateur - Prise en main')

WebUI.click(findTestObject('Object Repository/Page_Administrateur - Prise en main/div_Afficher toutes les notifications_userS_5bf2a2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Administrateur - Prise en main/a_Se dconnecter'))

WebUI.click(findTestObject('Object Repository/Page_Administrateur - Prise en main/a_Se dconnecter'))

WebUI.closeBrowser()


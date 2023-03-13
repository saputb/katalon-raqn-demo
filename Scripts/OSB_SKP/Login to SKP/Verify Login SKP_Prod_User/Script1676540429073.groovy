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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Object Repository/Page_Login/button_Autoriser tous les cookies'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_E-mail_username'), '13kZ8gQ78EDBcCNmg339zDKsqBmecz/GYnEFWYF0PJ8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Mot de passe_password'), 'DwTTIjmC6TIdOW0tF9H0lw==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.click(findTestObject('Object Repository/Page_Login/input_Vous avez oubli votre mot de passe_gi_d5d053'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login/div_Close the notifications    Login in pro_505b5f'), 
    0)

WebUI.getUrl()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Accueil/span_DCOUVREZ LA NOUVELLE GAMME BONACURE'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Accueil/h4_Stage  Atelier Nouveauts Couleurs'), 'Stage : Atelier Nouveautés Couleurs')

WebUI.click(findTestObject('Object Repository/Page_Accueil/a_EXPLORER'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/h2_Recevez les nouveauts, actus et offres S_1af23e'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/input_Tout savoir sur lutilisation de vos d_eb78b4'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/input_Tout savoir sur lutilisation de vos d_eb78b4'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/h2_Merci pour votre inscription  notre news_44bed9'), 
    'Merci pour votre inscription à notre newsletter ! À très vite :)')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/h2_Merci pour votre inscription  notre news_44bed9'))

WebUI.click(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/button_Confirmer la slection_btn__calltoact_eb17b8'))

WebUI.mouseOver(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/button_BS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/span_SE DCONNECTER'))

WebUI.click(findTestObject('Object Repository/Page_E-Learning Course Page  Stage  Atelier_4e4b6e/span_SE DCONNECTER'))

WebUI.closeBrowser()


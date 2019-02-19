import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wow-healthcare.com/wow/')

WebUI.setText(findTestObject('Object Repository/tom/Page_Wowhealth/input_Login_username'), 'maheenxahmad@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tom/Page_Wowhealth/input_Login_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Object Repository/tom/Page_Wowhealth/input_Login_password'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/tom/Page_Wowhealth/input_Login_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.sendKeys(findTestObject('Object Repository/tom/Page_Wowhealth/input_Login_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/tom/Page_Wowhealth/img_Logout_notificationsimg'))

WebUI.click(findTestObject('Object Repository/tom/Page_Wowhealth/img_Logout_notificationsimg'))

WebUI.click(findTestObject('Object Repository/tom/Page_Wowhealth/img_Logout_notificationsimg'))

WebUI.click(findTestObject('Object Repository/tom/Page_Wowhealth/img_Hi UCLA _profileimg'))

WebUI.click(findTestObject('Object Repository/tom/Page_Wowhealth/a_Logout'))


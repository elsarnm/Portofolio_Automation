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

WebUI.navigateToUrl('https://www.fifgroup.co.id/')

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/span_'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_LAYANAN KAMI'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_FIFASTRA'))

WebUI.click(findTestObject('Object Repository/Page_FIFASTRA  FIFGROUP - PT. Federal Inter_00087e/div_Lihat Promo'))

WebUI.click(findTestObject('Object Repository/Page_Program FIFASTRA Motor Baru Cashback A_7607a2/a_Beranda'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/span_'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_INFORMASI PERUSAHAAN'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_INFORMASI PERUSAHAAN'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_LAYANAN KAMI'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP - PT. Federal International Finance/a_FIFGROUP MOBILE CUSTOMER'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP MOBILE CUSTOMER  FIFGROUP - P_4cd0e5/a_INDONESIA'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP MOBILE CUSTOMER  FIFGROUP - P_4cd0e5/a_INDONESIA'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP MOBILE CUSTOMER  FIFGROUP - P_4cd0e5/a_Karir'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_SEE MORE'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/i_Head Office_fa fa-eye'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_2'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_1'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_VACANCY'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/i_Branch Office_fa fa-eye'))

WebUI.setText(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/input_Vacancy by Location_q'), 'jakarta')

WebUI.sendKeys(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/input_Vacancy by Location_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_JAKARTA PUSAT 2 BRANCH_btn btn-xs btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_HOME'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_SEE MORE_1'))

WebUI.click(findTestObject('Object Repository/Page_FIFGROUP e-Recruitment/a_HOME'))

WebUI.closeBrowser()


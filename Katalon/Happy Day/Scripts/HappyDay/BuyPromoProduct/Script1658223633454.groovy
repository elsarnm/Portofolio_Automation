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

Mobile.startApplication(GlobalVariable.appHap, false)

Mobile.tap(findTestObject('TugasHappyDay/flashsale-Menu'), 50000)

Mobile.pressBack()

Mobile.tap(findTestObject('TugasHappyDay/flashsale-Menu'), 0)

Mobile.tap(findTestObject('TugasHappyDay/flashsale-Product'), 10000)

Mobile.tap(findTestObject('Object Repository/TugasHappyDay/android.widget.EditText - 1'), 0)

Mobile.setText(findTestObject('Object Repository/TugasHappyDay/android.widget.EditText - 1 (1)'), '5', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.view.ViewGroup add to bag'), 0)

Mobile.tap(findTestObject('TugasHappyDay/More proccess/android.widget.ImageView your bag'), 0)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.widget.TextView - Checkout'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TugasHappyDay/More proccess/android.widget.CheckBox - Receive your order confirmation and updates on WhatsApp'), 
    0)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.widget.Button - Checkout'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.widget.Button - Continue shipping'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.widget.Button - Continue'), 0)

Mobile.tap(findTestObject('TugasHappyDay/More proccess/android.widget.RadioButton - Bank Transfer'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('How did you find us?', FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('TugasHappyDay/More proccess/android.widget.EditText how you find us'), 0)

Mobile.selectListItemByLabel(findTestObject('TugasHappyDay/More proccess/android.widget.EditText how you find us'), label2, 
    0)

Mobile.tap(findTestObject('TugasHappyDay/More proccess/android.widget.Button - Place Order'), 0)


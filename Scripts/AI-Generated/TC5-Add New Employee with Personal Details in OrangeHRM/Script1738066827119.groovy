import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to web/index.php/*/index"

TrueTestScripts.navigate("web/index.php/${GlobalVariable.index_php_id}/index")

"Step 2: Click on link PIM -> Navigate to page 'employee management#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link PIM - Navigate to page employee managementwebindexphpviewEmployeeList.png')

"Step 3: Click on button Add -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on button Add - Navigate to page dynamic contentwebindexphp.png')

"Step 4: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on input FirstName.png')

"Step 5: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Enter input value in input FirstName.png')

"Step 6: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Enter input value in input LastName.png')

"Step 7: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on input object.png')

"Step 8: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Enter input value in input object.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on span object.png')

"Step 10: Click on input Checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_Checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on input Checkbox.png')

"Step 11: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on input object2.png')

"Step 12: Enter input value in input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_object2'), input_object2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Enter input value in input object2.png')

"Step 13: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on input Password.png')

"Step 14: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Enter input value in input Password.png')

"Step 15: Enter input value in input Password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_Password2'), input_Password2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Enter input value in input Password2.png')

"Step 16: Click on button Save -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button Save - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 17: Click on label Male"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/label_Male'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on label Male.png')

"Step 18: Click on i Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/i_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on i Icon.png')

"Step 19: Click on button Save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on button Save - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add New Employee with Personal Details in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
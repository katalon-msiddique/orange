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

"Step 1: Navigate to web/index.php/auth/login"

TrueTestScripts.navigate("web/index.php/auth/login")

"Step 2: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on input Username.png')

"Step 3: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Enter input value in input Username.png')

"Step 4: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Enter input value in input Password.png')

"Step 5: Click on button Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button Login.png')

"Step 6: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on input Username.png')

"Step 7: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_1)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Enter input value in input Username.png')

"Step 8: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_1)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Enter input value in input Password.png')

"Step 9: Click on button Login -> Navigate to page 'internal service#web/index.php/*/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on button Login - Navigate to page internal servicewebindexphpindex.png')

"Step 10: Click on link Admin -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link Admin - Navigate to page dynamic contentwebindexphp.png')

"Step 11: Click on link PIM -> Navigate to page 'employee management#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on link PIM - Navigate to page employee managementwebindexphpviewEmployeeList.png')

"Step 12: Click on input Hints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/input_Hints'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on input Hints.png')

"Step 13: Click on link employeeActions (Admin) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/link_employeeActions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on link employeeActions Admin - Navigate to page dynamic contentwebindexphp.png')

"Step 14: Click on link dynamicActions (Leave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on link dynamicActions Leave.png')

"Step 15: Click on link dynamicActions (Time)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on link dynamicActions Time.png')

"Step 16: Click on link dynamicActions (Recruitment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on link dynamicActions Recruitment.png')

"Step 17: Click on link MyInfo -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on link MyInfo - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 18: Click on link Performance -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_Performance'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on link Performance - Navigate to page dynamic contentwebindexphp.png')

"Step 19: Click on link Dashboard -> Navigate to page 'internal service#web/index.php/*/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on link Dashboard - Navigate to page internal servicewebindexphpindex.png')

"Step 20: Click on link MyInfo -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on link MyInfo - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 21: Click on image ProfilePicture -> Navigate to page 'photo view#web/index.php/*/viewPhotograph/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/image_ProfilePicture'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on image ProfilePicture - Navigate to page photo viewwebindexphpviewPhotographempNumber.png')

"Step 22: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_photo_view/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on button object.png')

"Step 23: Click on input File"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_photo_view/input_File'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on input File.png')

"Step 24: Click on link Directory -> Navigate to page 'directory view#web/index.php/*/viewDirectory'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_photo_view/link_Directory'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on link Directory - Navigate to page directory viewwebindexphpviewDirectory.png')

"Step 25: Click on link directoryActions (Maintenance) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_directory_view/link_directoryActions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on link directoryActions Maintenance - Navigate to page dynamic contentwebindexphp.png')

"Step 26: Enter input value in input Password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_Password3'), input_Password3)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Enter input value in input Password3.png')

"Step 27: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on button Confirm.png')

"Step 28: Click on link dynamicActions (Claim)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_4'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Click on link dynamicActions Claim.png')

"Step 29: Click on link dynamicActions (Performance)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_5'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on link dynamicActions Performance.png')

"Step 30: Click on link dynamicActions (Admin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on link dynamicActions Admin.png')

"Step 31: Click on link PIM -> Navigate to page 'employee management#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on link PIM - Navigate to page employee managementwebindexphpviewEmployeeList.png')

"Step 32: Click on link employeeActions (Leave) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/link_employeeActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Click on link employeeActions Leave - Navigate to page dynamic contentwebindexphp.png')

"Step 33: Click on link dynamicActions (Time)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on link dynamicActions Time.png')

"Step 34: Click on link dynamicActions (Recruitment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on link dynamicActions Recruitment.png')

"Step 35: Click on link MyInfo -> Navigate to page 'personal details view#web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on link MyInfo - Navigate to page personal details viewwebindexphpviewPersonalDetailsempNumber.png')

"Step 36: Click on link Performance -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_personal_details_view/link_Performance'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on link Performance - Navigate to page dynamic contentwebindexphp.png')

"Step 37: Click on link Dashboard -> Navigate to page 'internal service#web/index.php/*/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on link Dashboard - Navigate to page internal servicewebindexphpindex.png')

"Step 38: Click on link Directory -> Navigate to page 'directory view#web/index.php/*/viewDirectory'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_Directory'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Click on link Directory - Navigate to page directory viewwebindexphpviewDirectory.png')

"Step 39: Click on link directoryActions (Admin) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewDirectory?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_directory_view/link_directoryActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on link directoryActions Admin - Navigate to page dynamic contentwebindexphp.png')

"Step 40: Click on link PIM -> Navigate to page 'employee management#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on link PIM - Navigate to page employee managementwebindexphpviewEmployeeList.png')

"Step 41: Click on link employeeActions (Leave) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/link_employeeActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Click on link employeeActions Leave - Navigate to page dynamic contentwebindexphp.png')

"Step 42: Click on link dynamicActions (Maintenance)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_6'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on link dynamicActions Maintenance.png')

"Step 43: Enter input value in input Password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/input_Password3'), input_Password3_1)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Enter input value in input Password3.png')

"Step 44: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Click on button Confirm.png')

"Step 45: Click on link dynamicActions (Claim)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_4'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45-Click on link dynamicActions Claim.png')

"Step 46: Click on link dynamicActions (Buzz)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_7'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46-Click on link dynamicActions Buzz.png')

"Step 47: Click on link dynamicActions (Admin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 47-Click on link dynamicActions Admin.png')

"Step 48: Click on link PIM -> Navigate to page 'employee management#web/index.php/*/viewEmployeeList'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_PIM'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 48-Click on link PIM - Navigate to page employee managementwebindexphpviewEmployeeList.png')

"Step 49: Click on link employeeActions (Leave) -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/viewEmployeeList?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/link_employeeActions_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 49-Click on link employeeActions Leave - Navigate to page dynamic contentwebindexphp.png')

"Step 50: Click on link dynamicActions (Time)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 50-Click on link dynamicActions Time.png')

"Step 51: Click on link dynamicActions (Performance)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions_5'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 51-Click on link dynamicActions Performance.png')

"Step 52: Click on link Directory -> Navigate to page 'directory view#web/index.php/*/viewDirectory'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Directory'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 52-Click on link Directory - Navigate to page directory viewwebindexphpviewDirectory.png')

"Step 53: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Employee Directory and Actions in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
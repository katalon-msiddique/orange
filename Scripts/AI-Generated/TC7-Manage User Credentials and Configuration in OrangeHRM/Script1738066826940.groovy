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

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on input Username.png')

"Step 3: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Enter input value in input Username.png')

"Step 4: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on input Password.png')

"Step 5: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Enter input value in input Password.png')

"Step 6: Click on button Login -> Navigate to page 'internal service#web/index.php/*/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button Login - Navigate to page internal servicewebindexphpindex.png')

"Step 7: Click on link Admin -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on link Admin - Navigate to page dynamic contentwebindexphp.png')

"Step 8: Click on item managementOptions (UserManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_managementOptions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on item managementOptions UserManagement.png')

"Step 9: Click on item qualificationsJobs (Job)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_qualificationsJobs'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on item qualificationsJobs Job.png')

"Step 10: Click on item managementOptions (Organization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_managementOptions_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on item managementOptions Organization.png')

"Step 11: Click on item qualificationsJobs (Qualifications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_qualificationsJobs_1'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on item qualificationsJobs Qualifications.png')

"Step 12: Click on item Nationalities"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_Nationalities'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on item Nationalities.png')

"Step 13: Click on item CorporateBranding -> Navigate to page 'admin action#web/index.php/*/addTheme'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_CorporateBranding'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on item CorporateBranding - Navigate to page admin actionwebindexphpaddTheme.png')

"Step 14: Click on i Configuration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/addTheme?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_action/i_Configuration'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on i Configuration.png')

"Step 15: Click on item UserManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/addTheme?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_action/item_UserManagement'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on item UserManagement.png')

"Step 16: Click on item UserManagementUsers -> Navigate to page 'authentication page#web/index.php/auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/addTheme?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_action/item_UserManagementUsers'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on item UserManagementUsers - Navigate to page authentication pagewebindexphpauthlogin.png')

"Step 17: Click on div LoginUsernamePassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication_page/div_LoginUsernamePassword'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on div LoginUsernamePassword.png')

"Step 18: Click on div LoginDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication_page/div_LoginDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on div LoginDetails.png')

"Step 19: Click on div LoginDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication_page/div_LoginDetails'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on div LoginDetails.png')

"Step 20: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on input Username.png')

"Step 21: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_1)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Enter input value in input Username.png')

"Step 22: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_1)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Enter input value in input Password.png')

"Step 23: Click on button Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on button Login.png')

"Step 24: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on input Username.png')

"Step 25: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Enter input value in input Username.png')

"Step 26: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Click on input Password.png')

"Step 27: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27-Enter input value in input Password.png')

"Step 28: Click on button Login -> Navigate to page 'internal service#web/index.php/*/index'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 28-Click on button Login - Navigate to page internal servicewebindexphpindex.png')

"Step 29: Click on i Dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/i_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29-Click on i Dashboard.png')

"Step 30: Click on link Admin -> Navigate to page 'dynamic content#web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_service/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30-Click on link Admin - Navigate to page dynamic contentwebindexphp.png')

"Step 31: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31-Click on button Add.png')

"Step 32: Click on div Select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_Select'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32-Click on div Select.png')

"Step 33: Click on input Hints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_Hints'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 33-Click on input Hints.png')

"Step 34: Click on link dynamicActions (Admin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_dynamicActions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 34-Click on link dynamicActions Admin.png')

"Step 35: Click on item managementOptions (UserManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/item_managementOptions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 35-Click on item managementOptions UserManagement.png')

"Step 36: Click on list object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/list_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 36-Click on list object.png')

"Step 37: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 37-Click on button Add.png')

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Manage User Credentials and Configuration in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
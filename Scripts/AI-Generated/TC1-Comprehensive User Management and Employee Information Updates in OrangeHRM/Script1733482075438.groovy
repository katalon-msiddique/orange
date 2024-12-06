import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to orangehrm/web/index.php/auth/login"

TrueTestScripts.navigate("orangehrm/web/index.php/auth/login")

"Step 2: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on input Username.png')

"Step 3: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Enter input value in input Username.png')

"Step 4: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Enter input value in input Password.png')

"Step 5: Click on button Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button Login.png')

"Step 6: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input Username.png')

"Step 7: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input Password.png')

"Step 8: Click on button Login -> Navigate to page 'internal web application#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button Login - Navigate to page internal web applicationorangehrmwebindexphp.png')

"Step 9: Click on link Admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_web_application/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link Admin.png')

"Step 10: Click on link Admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_web_application/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link Admin.png')

"Step 11: Click on link Admin -> Navigate to page 'admin panel#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_web_application/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link Admin - Navigate to page admin panelorangehrmwebindexphp.png')

"Step 12: Click on icon adminPanelOptions (Configuration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions', ['icon_adminPanelOptions_internalHasText': icon_adminPanelOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on icon adminPanelOptions Configuration.png')

"Step 13: Click on link adminSettings (Modules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_admin_panel/link_adminSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/link_adminSettings', ['link_adminSettings_internalRoleMenuitemName': link_adminSettings_internalRoleMenuitemName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link adminSettings Modules.png')

"Step 14: Click on span Mobile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/span_Mobile'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on span Mobile.png')

"Step 15: Click on input MobileCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/input_MobileCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input MobileCheckbox.png')

"Step 16: Click on span ClaimModule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/span_ClaimModule'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on span ClaimModule.png')

"Step 17: Click on input ClaimModuleCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/input_ClaimModuleCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input ClaimModuleCheckbox.png')

"Step 18: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button Save.png')

"Step 19: Click on icon adminPanelOptions (Configuration2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on icon adminPanelOptions Configuration2.png')

"Step 20: Click on icon adminPanelOptions (Configuration2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on icon adminPanelOptions Configuration2.png')

"Step 21: Click on link adminSettings (EmailConfiguration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_admin_panel/link_adminSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/link_adminSettings', ['link_adminSettings_internalRoleMenuitemName': link_adminSettings_internalRoleMenuitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link adminSettings EmailConfiguration.png')

"Step 22: Click on icon adminPanelOptions (UserManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions', ['icon_adminPanelOptions_internalHasText': icon_adminPanelOptions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on icon adminPanelOptions UserManagement.png')

"Step 23: Click on item Users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/item_Users'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on item Users.png')

"Step 24: Click on input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/input_Textbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on input Textbox.png')

"Step 25: Enter input value in input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_panel/input_Textbox'), input_Textbox)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in input Textbox.png')

"Step 26: Click on div Select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/div_Select'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on div Select.png')

"Step 27: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on input TypeForHints.png')

"Step 28: Enter input value in input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_panel/input_TypeForHints'), input_TypeForHints)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Enter input value in input TypeForHints.png')

"Step 29: Click on div EmployeeNameInvalid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/div_EmployeeNameInvalid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div EmployeeNameInvalid.png')

"Step 30: Click on div EmployeeNameInvalid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/div_EmployeeNameInvalid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on div EmployeeNameInvalid.png')

"Step 31: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on input TypeForHints.png')

"Step 32: Enter input value in input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_admin_panel/input_TypeForHints'), input_TypeForHints_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Enter input value in input TypeForHints.png')

"Step 33: Click on div ResetSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/div_ResetSearch'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on div ResetSearch.png')

"Step 34: Click on button Add -> Navigate to page 'web application#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on button Add - Navigate to page web applicationorangehrmwebindexphp.png')

"Step 35: Click on div Select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_Select'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on div Select.png')

"Step 36: Click on header AddUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/header_AddUser'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on header AddUser.png')

"Step 37: Click on div Select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_Select'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on div Select.png')

"Step 38: Click on div Select2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_Select2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on div Select2.png')

"Step 39: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on input Password.png')

"Step 40: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on input TypeForHints.png')

"Step 41: Enter input value in input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'), input_TypeForHints_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Enter input value in input TypeForHints.png')

"Step 42: Click on div UserRole"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_UserRole'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on div UserRole.png')

"Step 43: Click on header AddUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/header_AddUser'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on header AddUser.png')

"Step 44: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on input TypeForHints.png')

"Step 45: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on input TypeForHints.png')

"Step 46: Click on div EmployeeNameInvalid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_EmployeeNameInvalid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on div EmployeeNameInvalid.png')

"Step 47: Click on input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_Textbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on input Textbox.png')

"Step 48: Enter input value in input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_Textbox'), input_Textbox_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Enter input value in input Textbox.png')

"Step 49: Click on div UsernameError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_UsernameError'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on div UsernameError.png')

"Step 50: Click on div PasswordError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_PasswordError'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Click on div PasswordError.png')

"Step 51: Click on item UserManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/item_UserManagement'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on item UserManagement.png')

"Step 52: Click on i Job"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/i_Job'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Click on i Job.png')

"Step 53: Click on link Leave"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/link_Leave'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Click on link Leave.png')

"Step 54: Click on link Recruitment -> Navigate to page 'admin panel#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/link_Recruitment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on link Recruitment - Navigate to page admin panelorangehrmwebindexphp.png')

"Step 55: Click on link MyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Click on link MyInfo.png')

"Step 56: Click on link MyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Click on link MyInfo.png')

"Step 57: Click on link MyInfo -> Navigate to page 'employee details view#orangehrm/web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Click on link MyInfo - Navigate to page employee details vieworangehrmwebindexphpviewPersonalDetailsempNumber.png')

"Step 58: Click on image profilePicture (ProfilePicture) -> Navigate to page 'employee photo view#orangehrm/web/index.php/*/viewPhotograph/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_employee_details_view/image_profilePicture'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Click on image profilePicture ProfilePicture - Navigate to page employee photo vieworangehrmwebindexphpviewPhotographempNumber.png')

"Step 59: Click on button Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/button_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Click on button Unknown.png')

"Step 60: Click on input FileUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/input_FileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Click on input FileUpload.png')

"Step 61: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Click on button Save.png')

"Step 62: Click on link PersonalDetails -> Navigate to page 'employee details view#orangehrm/web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/link_PersonalDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Click on link PersonalDetails - Navigate to page employee details vieworangehrmwebindexphpviewPersonalDetailsempNumber.png')

"Step 63: Click on input DriversLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/input_DriversLicenseNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Click on input DriversLicenseNumber.png')

"Step 64: Enter input value in input DriversLicenseNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_details_view/input_DriversLicenseNumber'), input_DriversLicenseNumber)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Enter input value in input DriversLicenseNumber.png')

"Step 65: Click on i DriversLicense"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_DriversLicense'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Click on i DriversLicense.png')

"Step 66: Click on i EmployeeId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_EmployeeId'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Click on i EmployeeId.png')

"Step 67: Click on div Year"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/div_Year'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Click on div Year.png')

"Step 68: Click on item Year"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/item_Year'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on item Year.png')

"Step 69: Click on div Day"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/div_Day'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Click on div Day.png')

"Step 70: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Click on i Unknown.png')

"Step 71: Click on i Unknown2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_Unknown2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on i Unknown2.png')

"Step 72: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on i Unknown.png')

"Step 73: Click on span Male"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/span_Male'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on span Male.png')

"Step 74: Click on input MaleRadio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/input_MaleRadio'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Click on input MaleRadio.png')

"Step 75: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Click on button Save.png')

"Step 76: Click on link ContactDetails -> Navigate to page 'employee information#orangehrm/web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/link_ContactDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Click on link ContactDetails - Navigate to page employee informationorangehrmwebindexphpempNumber.png')

"Step 77: Click on input Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/input_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Click on input Unknown.png')

"Step 78: Enter input value in input Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown'), input_Unknown)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Enter input value in input Unknown.png')

"Step 79: Enter input value in input Unknown2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown2'), input_Unknown2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Enter input value in input Unknown2.png')

"Step 80: Enter input value in input Unknown3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown3'), input_Unknown3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Enter input value in input Unknown3.png')

"Step 81: Click on input Unknown4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/input_Unknown4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on input Unknown4.png')

"Step 82: Enter input value in input Unknown4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown4'), input_Unknown4)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 82-Enter input value in input Unknown4.png')

"Step 83: Enter input value in input Unknown5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown5'), input_Unknown5)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 83-Enter input value in input Unknown5.png')

"Step 84: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 84-Click on i Unknown.png')

"Step 85: Click on input Unknown6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/input_Unknown6'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 85-Click on input Unknown6.png')

"Step 86: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 86-Click on button Save.png')

"Step 87: Click on link employeeResources (EmergencyContacts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_employee_information/link_employeeResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_employee_information/link_employeeResources', ['link_employeeResources_internalRoleLinkName': link_employeeResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 87-Click on link employeeResources EmergencyContacts.png')

"Step 88: Click on link Dependents -> Navigate to page 'employee management#orangehrm/web/index.php/*/viewDependents/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/link_Dependents'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 88-Click on link Dependents - Navigate to page employee managementorangehrmwebindexphpviewDependentsempNumber.png')

"Step 89: Click on link Immigration -> Navigate to page 'employee information#orangehrm/web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewDependents/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_management/link_Immigration'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 89-Click on link Immigration - Navigate to page employee informationorangehrmwebindexphpempNumber.png')

"Step 90: Click on div App"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/div_App'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 90-Click on div App.png')

"Step 91: Click on div ImmigrationTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/div_ImmigrationTab'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 91-Click on div ImmigrationTab.png')

"Step 92: Click on link Job -> Navigate to page 'job details view#orangehrm/web/index.php/*/viewJobDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/link_Job'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 92-Click on link Job - Navigate to page job details vieworangehrmwebindexphpviewJobDetailsempNumber.png')

"Step 93: Click on i Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/i_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 93-Click on i Icon.png')

"Step 94: Click on div SelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_SelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 94-Click on div SelectOption.png')

"Step 95: Click on div SelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/div_SelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 95-Click on div SelectOption.png')

"Step 96: Click on link Salary -> Navigate to page 'dynamic content#orangehrm/web/index.php/*/viewSalaryList/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewJobDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_job_details_view/link_Salary'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 96-Click on link Salary - Navigate to page dynamic contentorangehrmwebindexphpviewSalaryListempNumber.png')

"Step 97: Click on link ReportTo -> Navigate to page 'report view#orangehrm/web/index.php/*/viewReportToDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewSalaryList/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_ReportTo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 97-Click on link ReportTo - Navigate to page report vieworangehrmwebindexphpviewReportToDetailsempNumber.png')

"Step 98: Click on link Qualifications -> Navigate to page 'employee information#orangehrm/web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewReportToDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_view/link_Qualifications'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 98-Click on link Qualifications - Navigate to page employee informationorangehrmwebindexphpempNumber.png')

"Step 99: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 99-Click on button Add.png')

"Step 100: Click on link employeeResources (Memberships)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_employee_information/link_employeeResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_employee_information/link_employeeResources', ['link_employeeResources_internalRoleLinkName': link_employeeResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 100-Click on link employeeResources Memberships.png')

"Step 101: Click on link PersonalDetails -> Navigate to page 'employee details view#orangehrm/web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/link_PersonalDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 101-Click on link PersonalDetails - Navigate to page employee details vieworangehrmwebindexphpviewPersonalDetailsempNumber.png')

"Step 102: Click on span EmployeeName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/span_EmployeeName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 102-Click on span EmployeeName.png')

"Step 103: Click on link Logout -> Navigate to page 'authentication page#orangehrm/web/index.php/auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 103-Click on link Logout - Navigate to page authentication pageorangehrmwebindexphpauthlogin.png')

"Step 104: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 104-Click on input Username.png')

"Step 105: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 105-Enter input value in input Username.png')

"Step 106: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 106-Enter input value in input Password.png')

"Step 107: Click on button Login -> Navigate to page 'internal web application#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 107-Click on button Login - Navigate to page internal web applicationorangehrmwebindexphp.png')

"Step 108: Click on div noPendingActions (NoPendingActions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_web_application/div_noPendingActions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 108-Click on div noPendingActions NoPendingActions.png')

"Step 109: Click on image noContent (NoContent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_web_application/image_noContent'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 109-Click on image noContent NoContent.png')

"Step 110: Click on div leavePeriodStatus (LeavePeriodNotDefined)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_web_application/div_leavePeriodStatus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 110-Click on div leavePeriodStatus LeavePeriodNotDefined.png')

"Step 111: Click on link Admin -> Navigate to page 'admin panel#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_web_application/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 111-Click on link Admin - Navigate to page admin panelorangehrmwebindexphp.png')

"Step 112: Click on link Nationalities"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_Nationalities'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 112-Click on link Nationalities.png')

"Step 113: Click on link MyInfo -> Navigate to page 'employee details view#orangehrm/web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/link_MyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 113-Click on link MyInfo - Navigate to page employee details vieworangehrmwebindexphpviewPersonalDetailsempNumber.png')

"Step 114: Click on link PersonalDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/link_PersonalDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 114-Click on link PersonalDetails.png')

"Step 115: Click on image profilePicture (ProfilePicture) -> Navigate to page 'employee photo view#orangehrm/web/index.php/*/viewPhotograph/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_employee_details_view/image_profilePicture'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 115-Click on image profilePicture ProfilePicture - Navigate to page employee photo vieworangehrmwebindexphpviewPhotographempNumber.png')

"Step 116: Click on button Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/button_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 116-Click on button Unknown.png')

"Step 117: Click on input FileUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/input_FileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 117-Click on input FileUpload.png')

"Step 118: Click on button Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/button_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 118-Click on button Unknown.png')

"Step 119: Click on input FileUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/input_FileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 119-Click on input FileUpload.png')

"Step 120: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 120-Click on button Save.png')

"Step 121: Click on link ContactDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/link_ContactDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 121-Click on link ContactDetails.png')

"Step 122: Click on link PersonalDetails -> Navigate to page 'employee details view#orangehrm/web/index.php/*/viewPersonalDetails/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPhotograph/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_photo_view/link_PersonalDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 122-Click on link PersonalDetails - Navigate to page employee details vieworangehrmwebindexphpviewPersonalDetailsempNumber.png')

"Step 123: Click on i DriversLicense"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_DriversLicense'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 123-Click on i DriversLicense.png')

"Step 124: Click on i YearIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_YearIcon'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 124-Click on i YearIcon.png')

"Step 125: Click on div NationalityMarital"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/div_NationalityMarital'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 125-Click on div NationalityMarital.png')

"Step 126: Click on i DriversLicense"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/i_DriversLicense'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 126-Click on i DriversLicense.png')

"Step 127: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 127-Click on button ActionButton.png')

"Step 128: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 128-Click on button ActionButton.png')

"Step 129: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 129-Click on button ActionButton.png')

"Step 130: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 130-Click on button ActionButton.png')

"Step 131: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 131-Click on button ActionButton.png')

"Step 132: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 132-Click on button ActionButton.png')

"Step 133: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 133-Click on button ActionButton.png')

"Step 134: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 134-Click on button ActionButton.png')

"Step 135: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 135-Click on button ActionButton.png')

"Step 136: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 136-Click on button ActionButton.png')

"Step 137: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 137-Click on button ActionButton.png')

"Step 138: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 138-Click on button ActionButton.png')

"Step 139: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 139-Click on button ActionButton.png')

"Step 140: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 140-Click on button ActionButton.png')

"Step 141: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 141-Click on button ActionButton.png')

"Step 142: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 142-Click on button ActionButton.png')

"Step 143: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 143-Click on button ActionButton.png')

"Step 144: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 144-Click on button ActionButton.png')

"Step 145: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 145-Click on button ActionButton.png')

"Step 146: Click on button ActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_ActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 146-Click on button ActionButton.png')

"Step 147: Click on div Day"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/div_Day'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 147-Click on div Day.png')

"Step 148: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 148-Click on button Save.png')

"Step 149: Click on link ContactDetails -> Navigate to page 'employee information#orangehrm/web/index.php/*/*/empNumber/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/viewPersonalDetails/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_details_view/link_ContactDetails'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 149-Click on link ContactDetails - Navigate to page employee informationorangehrmwebindexphpempNumber.png')

"Step 150: Click on input Unknown6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/input_Unknown6'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 150-Click on input Unknown6.png')

"Step 151: Enter input value in input Unknown6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_Unknown6'), input_Unknown6)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 151-Enter input value in input Unknown6.png')

"Step 152: Enter input value in input EmployeeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_employee_information/input_EmployeeInput'), input_EmployeeInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 152-Enter input value in input EmployeeInput.png')

"Step 153: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 153-Click on button Save.png')

"Step 154: Click on i EmployeeIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/i_EmployeeIcon'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 154-Click on i EmployeeIcon.png')

"Step 155: Click on link Logout -> Navigate to page 'authentication page#orangehrm/web/index.php/auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*/empNumber/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_employee_information/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 155-Click on link Logout - Navigate to page authentication pageorangehrmwebindexphpauthlogin.png')

"Step 156: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 156-Click on input Username.png')

"Step 157: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 157-Enter input value in input Username.png')

"Step 158: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 158-Enter input value in input Password.png')

"Step 159: Click on button Login -> Navigate to page 'internal web application#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/auth/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 159-Click on button Login - Navigate to page internal web applicationorangehrmwebindexphp.png')

"Step 160: Click on link Admin -> Navigate to page 'admin panel#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_web_application/link_Admin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 160-Click on link Admin - Navigate to page admin panelorangehrmwebindexphp.png')

"Step 161: Click on icon adminPanelOptions (UserManagementIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_admin_panel/icon_adminPanelOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 161-Click on icon adminPanelOptions UserManagementIcon.png')

"Step 162: Click on item Users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/item_Users'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 162-Click on item Users.png')

"Step 163: Click on button Add -> Navigate to page 'web application#orangehrm/web/index.php/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_panel/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 163-Click on button Add - Navigate to page web applicationorangehrmwebindexphp.png')

"Step 164: Click on i FormIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/i_FormIcon'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 164-Click on i FormIcon.png')

"Step 165: Click on div Select2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_Select2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 165-Click on div Select2.png')

"Step 166: Click on input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 166-Click on input TypeForHints.png')

"Step 167: Enter input value in input TypeForHints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_TypeForHints'), input_TypeForHints_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 167-Enter input value in input TypeForHints.png')

"Step 168: Click on div EmployeeNameInvalid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/div_EmployeeNameInvalid'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 168-Click on div EmployeeNameInvalid.png')

"Step 169: Click on input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_Textbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 169-Click on input Textbox.png')

"Step 170: Enter input value in input Textbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_Textbox'), input_Textbox_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 170-Enter input value in input Textbox.png')

"Step 171: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 171-Click on input Password.png')

"Step 172: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_Password'), input_Password_4)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 172-Enter input value in input Password.png')

"Step 173: Enter input value in input Password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_web_application/input_Password2'), input_Password2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 173-Enter input value in input Password2.png')

"Step 174: Click on input PasswordValidation -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orangehrm/web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_web_application/input_PasswordValidation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 174-Click on input PasswordValidation - Navigate to page .png')

"Step 175: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Comprehensive User Management and Employee Information Updates in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
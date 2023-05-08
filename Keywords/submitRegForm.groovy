
import com.kms.katalon.core.annotation.Keyword

@Keyword
def submitRegistrationForm() {
	WebUI.click(findTestObject('Object Repository/Page_STORE/button_Sign up'))
}

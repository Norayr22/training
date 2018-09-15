package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePageObject {


    public LoginPage(WebDriver driver) {
        super(driver);

    }

    //tagName of Sylkar logo.
    @FindBy(tagName = Constants.LOGIN_PAGE_LOGO)
    private WebElement wbLogo;
    //Id of UserId or Email field.
    @FindBy(id = Constants.USER_ID_FIELD)
    private WebElement wbUserId;
    //Id of password field.
    @FindBy(id = Constants.PASSWORD_FIELD)
    private WebElement wbPassword;
    //ClassName of RememberMe check box.
    @FindBy(className = Constants.REMEBER_ME)
    private WebElement wbRemeberme;

    @FindBy(xpath = Constants.FORGOT_PASSWORD)
    private WebElement wbForgotPassword;

    @FindBy(xpath = Constants.LOGIN_BUTTON)
    private WebElement wbLoginButton;

    @FindBy(xpath = Constants.SIGN_UP_BUTTON)
    private WebElement wbSignUpButton;

    @FindBy(xpath = Constants.INV_CREDENTALS_ERR_MESAGE)
    private WebElement invalidCredentialsErrMessage;

    @FindBy(xpath = Constants.INV_EMAIL_FORM_ERR_MESAGE)
    private WebElement invEmlFormErrMesage;

    @FindBy(xpath = Constants.BLANK_EMAIL_ERR_MESAGE)
    private WebElement blankEmlErrMesage;

    @FindBy(xpath = Constants.BLANK_PASS_ERR_MESAGE)
    private WebElement blankPassErrMesage;


    public boolean checkLogo() {
        return wbLogo.isDisplayed();
    }


    public boolean invalidCrErrMessageisDisplayed() {
        return invalidCredentialsErrMessage.isDisplayed();

    }

    public boolean invFormEmailErrorMessageIsDisplayed() {
        return invEmlFormErrMesage.isDisplayed();

    }

    public boolean blankFormEmailErrorMessageIsDisplayed() {
        return blankEmlErrMesage.isDisplayed();

    }

    public boolean blankPasswordErrorMessageIsDisplayed() {
        return blankPassErrMesage.isDisplayed();

    }

    public void loginFunctionality(String strUserId, String strPass) {
        wbUserId.sendKeys(strUserId);
        wbPassword.sendKeys(strPass);
        wbLoginButton.click();
    }

    public Header successfullLogin(String strUserId, String strPass) {
        wbUserId.sendKeys(strUserId);
        wbPassword.sendKeys(strPass);
        wbLoginButton.click();
        return new Header(driver);
    }

    public RegistrationPage clickSignUpButton() {
        wbSignUpButton.click();
        return new RegistrationPage(driver);

    }

    public String checkPasswordMasking() {

        return wbPassword.getAttribute("type");


    }

        public String checkPageTitile (){
            return driver.getTitle();

        }
}

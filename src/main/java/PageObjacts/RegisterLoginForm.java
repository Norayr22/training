package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLoginForm extends BasePageObject {

    public RegisterLoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = Constants.REGISTRATION_LOGIN_FORM_TITLE)
    private WebElement wbRegTitle;

    @FindBy(id = Constants.REGISTRATION_USER_ID_FIELD)
    private WebElement wbRegUserId;

    @FindBy(id = Constants.REGISTRATION_PASSWORD_FIELD)
    private WebElement wbRegPassword;

    @FindBy(xpath = Constants.REGISTRATION_REGISTER_INDIVIDUAL_ACCOUNT_LINK)
    private WebElement wbRegIndvAccButton;

    @FindBy(xpath = Constants.REGISTRATION_FORGOT_PASSWORD_LINK)
    private WebElement wbRegForgotPass;

    @FindBy(xpath = Constants.REGISTRATION_BACK_BUTTON)
    private WebElement wbRegBackButton;

    @FindBy(xpath = Constants.REGISTRATION_PROCEED_BUTTON)
    private WebElement wbRegProceedButton;

    public boolean checkRegTitle() {
        return wbRegTitle.isDisplayed();

    }

    public void successfullLoginBussinessRegistration(String userId, String password) {
        wbRegUserId.sendKeys(userId);
        wbRegPassword.sendKeys(password);
        wbRegProceedButton.click();

    }

    public void clickBeckButton() {
        wbRegBackButton.click();

    }

    public void clickProceedButton(){
        wbRegProceedButton.click();

    }


}

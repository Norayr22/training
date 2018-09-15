package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePageObject {


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = Constants.INDIVIDUAL_TITLE)
    private WebElement wbIndTitle;

    @FindBy(xpath = Constants.INDIVIDUAL_TEXT)
    private WebElement wbIndText;

    @FindBy(xpath = Constants.INDIVIDUAL_SIGNUP_BUTTON)
    private WebElement wbIndSignUpButton;

    @FindBy (xpath = Constants.BUSINESS_TITLE)
    private WebElement wbBusTitle;

    @FindBy (xpath = Constants.BUSINESS_TEXT)
    private WebElement wbBusText;

    @FindBy(xpath = Constants.BUSINESS_SIGNUP_BUTTON)
    private WebElement wbBusSignUpButton;

    @FindBy (xpath = Constants.SELLER_TITLE)
    private WebElement wbSellTitile;

    @FindBy (xpath = Constants.SELLER_TEXT)
    private WebElement wbSellText;

    @FindBy(xpath = Constants.SELLER_SIGNUP_BUTTON)
    private WebElement wbSellSignUpButton;


    public boolean checkIndTitle() {
        return wbIndTitle.isDisplayed();
    }

    public String getIndTitle() {
        return wbIndTitle.getText();
    }
    public boolean checkIndText() {
        return wbIndText.isDisplayed();
    }

    public void clickIndividualSignUpButton(){
        wbBusSignUpButton.click();
    }

    public boolean checkBussTitle() {
        return wbBusTitle.isDisplayed();
    }

    public boolean checkBussText() {
        return wbBusText.isDisplayed();
    }

    public void clickBusinessSignUpButton(){
        wbBusSignUpButton.click();
    }

    public boolean checkSellTitle() {
        return wbSellTitile.isDisplayed();
    }

    public boolean checkSellText() {
        return wbSellText.isDisplayed();
    }
    public void clickSellerSignUpButton(){
        wbSellSignUpButton.click();
    }

}

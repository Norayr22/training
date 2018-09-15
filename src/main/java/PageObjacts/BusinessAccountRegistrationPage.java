package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessAccountRegistrationPage extends BasePageObject {

    public BusinessAccountRegistrationPage(WebDriver driver) {
        super(driver);

        }

     @FindBy(xpath = Constants.BUSINESS_REGISTRATION_TITLE)
    private WebElement wbBusinessRegTitle;



    public boolean checkBusinessTitle(){
       return wbBusinessRegTitle.isDisplayed();

    }



}

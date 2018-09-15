package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualRegistrationPage extends BasePageObject {
    public IndividualRegistrationPage(WebDriver driver) {
        super(driver);

    }

    @FindBy (xpath = Constants.INDIVIDUAL_REGISTRATION_TITLE)
    protected WebElement wbIndRegTitle;


}

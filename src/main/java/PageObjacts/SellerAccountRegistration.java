package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellerAccountRegistration extends BasePageObject {

    public SellerAccountRegistration(WebDriver driver) {
        super(driver);


    }
    @FindBy(xpath = Constants.SELLER_REGISTRATION_TITLE)
    private WebElement wbSellerTitle;


    public boolean checkSellerRegTitle(){
        waitForVisibility(wbSellerTitle);

       return wbSellerTitle.isDisplayed();

    }


}

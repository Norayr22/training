package PageObjacts;

import PageObjacts.Selectors.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePageObject {

    public Header(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = Constants.HEADER_USER_AVATAR)
    private WebElement headerUserAvatar;

    @FindBy(xpath = Constants.LOGOUT_BUTTON)
    private WebElement logOutButton;


    public boolean isAvatarDisplayed() {
        return headerUserAvatar.isDisplayed();
    }

    public void openHeaderAvatarMenu () {
        headerUserAvatar.click();
    }

    public void logOutFunctionality(){
        logOutButton.click();
    }

}

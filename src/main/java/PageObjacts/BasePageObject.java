package PageObjacts;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void waitForVisibility(WebElement element) throws Error {
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
    }


}

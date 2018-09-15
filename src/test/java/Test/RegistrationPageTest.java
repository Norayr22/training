package Test;

import PageObjacts.IndividualRegistrationPage;
import PageObjacts.LoginPage;
import PageObjacts.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationPageTest extends BaseWebdriver {

    private RegistrationPage reg;
    private IndividualRegistrationPage indRegPage;

    @BeforeMethod
    public void navigate(){
        driver.get("https://app.sylkar-dev.tk/auth/register");

    }


    @Test
    public void verifyIndividualTitle() throws InterruptedException {
        reg = new RegistrationPage(driver);
        Assert.assertEquals(reg.getIndTitle(),"Individual");
        Thread.sleep(5000);
    }


}

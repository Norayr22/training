package Test;

import PageObjacts.BusinessAccountRegistrationPage;
import PageObjacts.RegisterLoginForm;
import PageObjacts.RegistrationPage;
import PageObjacts.SellerAccountRegistration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegLoginFormTest extends BaseWebdriver {
    private RegisterLoginForm LoginForm;
    private BusinessAccountRegistrationPage busReg;
    private RegistrationPage regPage;
    private SellerAccountRegistration selReg;
    @BeforeMethod
    public void navigate() {
        driver.get("https://app.sylkar-dev.tk/auth/register");
    }


    @Test
    public void successfullyLoginToBusinessRegPage() throws InterruptedException {
        regPage = new RegistrationPage(driver);
        regPage.clickBusinessSignUpButton();
        LoginForm = new RegisterLoginForm(driver);
        LoginForm.successfullLoginBussinessRegistration("sylkar-test-45@mailinator.com","hunter");
        Thread.sleep(5000);
        busReg = new BusinessAccountRegistrationPage(driver);
        Assert.assertTrue(busReg.checkBusinessTitle());
        Thread.sleep(5000);



    }

    @Test
    public void successfullyLoginSellerRegPage() throws InterruptedException {
        regPage = new RegistrationPage(driver);
        regPage.clickSellerSignUpButton();
        LoginForm = new RegisterLoginForm(driver);
        LoginForm.successfullLoginBussinessRegistration("sylkar-test-45@mailinator.com","hunter");
        selReg = new SellerAccountRegistration(driver);
        Assert.assertTrue(selReg.checkSellerRegTitle());
        Thread.sleep(5000);

    }



}



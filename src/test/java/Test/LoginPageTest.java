package Test;


import PageObjacts.Header;
import PageObjacts.LoginPage;
import PageObjacts.RegistrationPage;

import Utilities.RandomDatas;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseWebdriver {

    private LoginPage login;
    private Header header;
    private RegistrationPage reg;

    @BeforeMethod
    public void navigate(){
        driver.get("https://app.sylkar-dev.tk/auth/login");
    }

    @Test(priority = 1, description = "Verify page title is correct")
    public void loginPageTitile() throws InterruptedException {
        login = new LoginPage(driver);
        Assert.assertEquals(login.checkPageTitile(),"Login - Sylkar");
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void loginWithEmptyUserId() throws InterruptedException {
        login = new LoginPage(driver);
        login.loginFunctionality("", "hunter");
        Assert.assertTrue(login.blankFormEmailErrorMessageIsDisplayed());
        Thread.sleep(5000);
    }

    @Test
    public void loginWithEmptyPasswrd() throws InterruptedException {
        login = new LoginPage(driver);
        login.loginFunctionality("sylkar-test-1@mailinator.com", "");
        Assert.assertTrue(login.blankPasswordErrorMessageIsDisplayed());
        Thread.sleep(5000);
    }

    @Test
    protected void signUpButtonFunctionality() throws InterruptedException {
        login = new LoginPage(driver);
        reg = login.clickSignUpButton();
        Assert.assertTrue(reg.checkIndTitle());
        Thread.sleep(5000);
    }

    @Test
    public void loginWithInvalidCredentials() throws InterruptedException {
        login = new LoginPage(driver);
        login.loginFunctionality("tst@gmail.com", "123456");
        Assert.assertTrue(login.invalidCrErrMessageisDisplayed());
        Thread.sleep(5000);
    }

    @Test
    public void loginWithWrongEmailFormat() throws InterruptedException {

        login = new LoginPage(driver);
        login.loginFunctionality(RandomDatas.wrongEmail(), "hunter");
        Assert.assertTrue(login.invFormEmailErrorMessageIsDisplayed());
        Thread.sleep(5000);

    }

    @Test
    public void passwordMaskin() throws InterruptedException {

        login = new LoginPage(driver);
        Assert.assertEquals(login.checkPasswordMasking(), "password");
        Thread.sleep(5000);

    }

    @Test
    public void wrongPassword() throws InterruptedException {

        login = new LoginPage(driver);
        login.loginFunctionality("sylkar-test-1@mailinator.com", "123456");
        Assert.assertTrue(login.invalidCrErrMessageisDisplayed());
        Thread.sleep(5000);
    }

    @Test
    public void wrongUserId() throws InterruptedException {

        login = new LoginPage(driver);
        login.loginFunctionality("sylkar-test@mailinator.com", "hunter");
        Assert.assertTrue(login.invalidCrErrMessageisDisplayed());
        Thread.sleep(5000);
    }

    @Test
    public void successfullLogin() throws InterruptedException {

        login = new LoginPage(driver);
        header = login.successfullLogin("sylkar-test-1@mailinator.com", "hunter");
        Assert.assertTrue(header.isAvatarDisplayed());
        Thread.sleep(5000);

    }

    @Test
    public void logOut() throws InterruptedException {
        login = new LoginPage(driver);
        header = login.successfullLogin("sylkar-test-1@mailinator.com", "hunter");
        Assert.assertTrue(header.isAvatarDisplayed());
        header.openHeaderAvatarMenu();
        header.logOutFunctionality();
        Assert.assertTrue(login.checkLogo());

        Thread.sleep(5000);

    }


}

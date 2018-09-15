package PageObjacts.Selectors;

public class Constants {



//Logon Page***********************
    public static final String LOGIN_PAGE_LOGO = "img";
    public static final String USER_ID_FIELD = "email";
    public static final String PASSWORD_FIELD = "password";
    public static final String REMEBER_ME = "ant-checkbox-input";
    public static final String FORGOT_PASSWORD = "//a[@class = 'login-form-forgot']";
    public static final String LOGIN_BUTTON = "//button [@type = 'submit']";
    public static final String SIGN_UP_BUTTON = "//a[@class = 'sign-up']";
    public static final String INV_CREDENTALS_ERR_MESAGE = "//nz-form-explain//div[contains(text(),'User ID')]";
    public static final String INV_EMAIL_FORM_ERR_MESAGE = "//div[contains(text(),'Please, enter a valid Email address')]";
    public static final String BLANK_EMAIL_ERR_MESAGE = "//div[contains(text(),'Please, fill out this field.')]";
    public static final String BLANK_PASS_ERR_MESAGE = "//div[contains(text(),'Please, fill out this field.')]";
    //public static final String  = ;

// Header ********************************
    public static final String HEADER_USER_AVATAR = "//img[@alt = 'user avatar']";
    public static final String LOGOUT_BUTTON = "//div//a[contains(text(),'Log out')]";
//Registration******************************************
    public static final String INDIVIDUAL_TITLE = "//h2[text() = 'Individual']";
    public static final String INDIVIDUAL_TEXT = "";
    public static final String INDIVIDUAL_SIGNUP_BUTTON = "//div//h2[text() = 'Individual']/..//a[text() = 'Sign Up']";
    public static final String BUSINESS_TITLE = "//h2[text() = ' Business ']";
    public static final String BUSINESS_TEXT = "";
    public static final String BUSINESS_SIGNUP_BUTTON = "//div//h2[text() = ' Business ']/..//a[text() = 'Sign Up']";
    public static final String SELLER_TITLE = "//h2[text() = 'Seller']";
    public static final String SELLER_TEXT = "";
    public static final String SELLER_SIGNUP_BUTTON = "//div//h2[text() = 'Seller']/..//a[text() = 'Sign Up']";
//IndividualRegistration*****************************************
    public static final String INDIVIDUAL_REGISTRATION_TITLE = "//h2[text() = 'Individual account registration']";
//BusinessAccountRegistration******************************************
    public static final String BUSINESS_REGISTRATION_TITLE = "//h2[text() = 'Business account registration']";
//SellerAccountRegistration*************************************
    public static final String SELLER_REGISTRATION_TITLE = "//h2[text() = 'Seller account registration']";




    //Register Login Form************************************************************
    public static final String REGISTRATION_LOGIN_FORM_TITLE = "//p[contains (text(), 'Please login with your individual account')]";
    public static final String REGISTRATION_USER_ID_FIELD = "email";
    public static final String REGISTRATION_PASSWORD_FIELD = "password";
    public static final String REGISTRATION_REGISTER_INDIVIDUAL_ACCOUNT_LINK = "//div//a[text() = 'Register Individual account']";
    public static final String REGISTRATION_FORGOT_PASSWORD_LINK = "//div//a[text() = 'Forgot password?']";
    public static final String REGISTRATION_BACK_BUTTON = "//a[@class = 'login-form-button btn-back ant-btn']";
    public static final String REGISTRATION_PROCEED_BUTTON = "//button[@class = 'login-form-button ant-btn ant-btn-orange']";



}

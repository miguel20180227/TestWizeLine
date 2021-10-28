package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#welcome-page > p:nth-child(4) > button")
    @CacheLookup
    private WebElement LoginButton;

    @FindBy(css = "#login-page > p:nth-child(5) > button.btn.btn-lg.btn-primary.button-login")
    @CacheLookup
    private WebElement LoginButtonSecond;

    @FindBy(css = "#tab-navigation-1 > li.innertab.tabBooking.active > a")
    @CacheLookup
    private WebElement fromToward;

    @FindBy(css = "#login-page > p:nth-child(2) > input")
    @CacheLookup
    private WebElement userName;

    @FindBy(css = "#login-page > p:nth-child(3) > input")
    @CacheLookup
    private WebElement password;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/input[1]")
    @CacheLookup
    private WebElement dateTrip;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div/div[1]/div[4]/div[3]/div[8]")
    @CacheLookup
    private WebElement dayStartTrip;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div/div[1]/div[4]/div[3]/div[14]")
    @CacheLookup
    private WebElement dayEndTrip;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button")
    @CacheLookup
    private WebElement btnSearchFlights;

    @FindBy(id = "btnLogin")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    @CacheLookup
    private WebElement loginPanel;

    public void loginPanel() {

        WaitUntilElementVisible(loginPanel);
        loginPanel.isEnabled();

    }


    public void userName(String from) {

        ScrollDownElement(userName);
        WaitUntilElementVisible(userName);
        userName.isEnabled();
        clickElement(userName);
        userName.click();
        userName.sendKeys(from);

    }

    public void password(String password) {

        WaitUntilElementVisible(this.password);
        this.password.isEnabled();
        this.password.clear();
        this.password.sendKeys(password, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void dateField() {

        WaitUntilElementVisible(dateTrip);
        dateTrip.click();
        ScrollDownElement(dateTrip);
        WaitUntilElementClickable(dateTrip);
        dayStartTrip.click();
        dayEndTrip.click();
        btnSearchFlights.click();

    }


    public boolean loginPageIsDisplayed() {

        WaitUntilElementVisible(LoginButton);
        LoginButton.isDisplayed();
        return true;
    }

    public boolean clickOnLogin() {

        WaitUntilElementVisible(LoginButton);
        LoginButton.click();
        return true;
    }

    public boolean clickOnLoginSecond() {

        WaitUntilElementVisible(LoginButtonSecond);
        LoginButtonSecond.click();
        return true;
    }
}
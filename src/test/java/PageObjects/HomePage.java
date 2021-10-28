package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#my-notes-page > h2")
    @CacheLookup
    private WebElement myNotesPage;

    @FindBy(css = "#menu_dashboard_index > b")
    @CacheLookup
    private WebElement dashBoardSection;


    public boolean homePageIsDisplayed() {

        WaitUntilElementVisible(myNotesPage);
        myNotesPage.isDisplayed();
        return true;
    }

    public void clickAdminSection() {

        WaitUntilElementVisible(myNotesPage);
        myNotesPage.isEnabled();
        myNotesPage.click();
    }

    public boolean dashBoardIsDisplayed() {

        WaitUntilElementVisible(dashBoardSection);
        dashBoardSection.isDisplayed();
        return true;
    }


}
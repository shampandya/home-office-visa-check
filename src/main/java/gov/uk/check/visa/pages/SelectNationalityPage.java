package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement countryDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement contiuneButton;


    public void selectNationality(String value) {
        selectByVisibleTextFromDropDown(countryDropDown, value);
        log.info("Selecting country name : " + countryDropDown.toString());
    }

    public void clickOnContinueButton() {
        clickOnElement(contiuneButton);
        log.info("Clicking on continue buttton : " + contiuneButton.toString());
    }
}

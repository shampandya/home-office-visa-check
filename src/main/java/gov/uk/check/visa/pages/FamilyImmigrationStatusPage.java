package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-0']")
    WebElement yesRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-1']")
    WebElement noRadio;

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next " + nextStepButton.toString());
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yesRadio);
                log.info("Clicking on Yes : " + status + " to " + yesRadio.toString());
                break;
            case "no":
                clickOnElement(noRadio);
                log.info("Clicking on No : " + status + " to " + noRadio.toString());
                break;
        }
    }
}

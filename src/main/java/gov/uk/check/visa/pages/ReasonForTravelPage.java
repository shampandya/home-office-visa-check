package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    //@FindBy(xpath = "//div[@class='govuk-radios']//label")
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    //@FindBy(xpath = "//div[@class='govuk-radios']//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectReasonOption(String reason) {
        for (WebElement reasonElement : reasonList) {
            if (reasonElement.getText().equalsIgnoreCase(reason))
                clickOnElement(reasonElement);
            break;
        }
        log.info("select reason for travel " + reasonList.toString());
    }

    public void clickNextContinueButton() {
        clickOnElement(nextStepButton);
        log.info("click on continue button" + nextStepButton.toString());
    }
}

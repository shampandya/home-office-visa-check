package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> workType;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectWorkType(String worktype) {
        for (WebElement workList : workType) {
            if (workList.getText().contains(worktype)) {
                clickOnElement(workList);
                break;
            }
            log.info("Selecting work type" + workType.toString());
        }
    }

    public void clickContinueButton() {
        log.info("click on continue button " + continueButton);
        clickOnElement(continueButton);
    }
}

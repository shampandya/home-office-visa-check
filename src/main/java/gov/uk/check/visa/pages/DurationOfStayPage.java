package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='response-0'])[1]")
    WebElement lessThanSixMonth;

    @CacheLookup
    //@FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    //@FindBy(xpath = "//input[contains(@id,'response-1')]")
    @FindBy(xpath = "//div[@class='govuk-radios']//div[2]")
    WebElement moreThanSixMonth;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "longer than 6 months":
                clickOnElement(moreThanSixMonth);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonth);
                break;
            default:
                System.out.println("Selection is wrong");
        }
    }
}

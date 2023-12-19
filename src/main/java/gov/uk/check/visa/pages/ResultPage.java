package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@data-flow-name='check-uk-visa']//h2")
    WebElement resultMessage;

    public String verifyResultText() {
        log.info("Getting result  " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage) {
        if (verifyResultText().equalsIgnoreCase(expectedMessage)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}

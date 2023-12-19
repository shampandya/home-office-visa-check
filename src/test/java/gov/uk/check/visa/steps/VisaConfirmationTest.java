package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTest {
    @Given("I am on start page")
    public void iAmOnStartPage() {
    }

    @When("Click on start button")
    public void clickOnStartButton() throws InterruptedException {
        Thread.sleep(2000);
        new StartPage().clickOnStartButton();
    }

    @And("Select a Nationality {string}")
    public void selectANationalityAustralia(String nationality) throws InterruptedException {
        Thread.sleep(2000);
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(2000);
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("Select reason {string}")
    public void selectReasonTourism(String reason) throws InterruptedException {
        Thread.sleep(3000);
        new ReasonForTravelPage().selectReasonOption(reason);
    }

    @And("Select intendent to stay for longer than 6 months")
    public void selectIntendentToStayForLongerThanMonths(String time) {
        new DurationOfStayPage().selectLengthOfStay(time);
    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional(String worktype) throws InterruptedException {
        Thread.sleep(2000);
        new WorkTypePage().selectWorkType(worktype);
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes(String option) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(option);
    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String errorMessage) {
        Assert.assertEquals(new ResultPage().verifyResultText(), errorMessage, "Result message is not displayed");
    }
}

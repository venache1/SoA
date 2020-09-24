import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @Given("user is on Landing page")
    public void userIsOnLandingPage() {
    }

    @Then("{string} page is displayed")
    public void pageIsDisplayed(String pageName) {
    }
}

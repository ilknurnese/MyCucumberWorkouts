package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _03_CitizenShipSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();


    @When("Create a CitizenShip")
    public void createACitizenShip() {
    }

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
    }
}

package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("campus acildi");
        GWD.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and Click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("kullanıcı adı ve şifre girildi");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("login başarılı");
    }
}
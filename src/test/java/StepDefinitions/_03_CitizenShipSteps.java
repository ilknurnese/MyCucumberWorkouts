package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();


    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a CitizenShip")
    public void createACitizenShip() {
        String citizenshipName= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String citizenshipShortName= RandomStringUtils.randomNumeric(4); // 4 tane karşık rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,citizenshipName);
        dc.mySendKeys(dc.shortName,citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a CitizenShip name as {string} shortKod as {string}")
    public void createACitizenShipNameAsShortKodAs(String name, String sKod) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.shortName,sKod);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("Already exist");
    }

    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {

        dc.deleteItem(deleteName);
//        dc.mySendKeys(dc.searchInput,deleteName);
//        dc.myClick(dc.searchButton);
//        dc.myClick(dc.deleteImageBtn);
//        dc.myClick(dc.deleteDialogBtn);
        //searche aranacak kelimeyi gönder
        //search butonuna bas
        //çöp kutusuna bas
        //diyalogdaki delete ye bas




    }
}

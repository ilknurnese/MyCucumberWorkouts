package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;


public class _02_CountrySteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
    ln.myClick(ln.setup);
    ln.myClick(ln.parameters);
    ln.myClick(ln.countries);

    }

    @When("Create a country")
    public void createACountry() {

        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf

        String ulkeKodu=RandomStringUtils.randomNumeric(4);
        dc.myClick(dc.addButton);

        //isim ve kodu gönder
        dc.mySendKeys(dc.nameInput,"ulkeAdi");
        dc.mySendKeys(dc.codeInput,"ulkeKodu");

        //kaydet butonuna bas


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        //kaydoldu mesajını kontrol et
        dc.verifyContainsText(dc.successMessage,"success");

    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAdi, String ulkeKodu) {
    }
}

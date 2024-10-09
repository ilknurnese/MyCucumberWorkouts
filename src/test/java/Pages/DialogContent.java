package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{

public DialogContent(){

    PageFactory.initElements(GWD.getDriver(),this);

}
    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;


    @FindBy(xpath = "//ns-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ns-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath="//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    public WebElement successMessage;


}
////span[@class='mat-mdc-tooltip-trigger logo-text']

//ms-add-button[@tooltip='COUNTRY.TITLE.ADD']//button
//ms-add-button[@tooltip='STATE.TITLE.ADD']//button

//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button
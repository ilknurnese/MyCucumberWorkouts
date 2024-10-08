package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{

public DialogContent(){

    PageFactory.initElements(GWD.getDriver(),this);

}


    @FindBy(css="mat-input-6")
    public WebElement username;

    @FindBy(css="mat-input-7")
    public WebElement password;

    @FindBy(css="")
    public WebElement loginButton;


}

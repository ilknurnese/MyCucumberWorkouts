package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(8));

    public void mySendKeys(WebElement element, String yazi){

        //görünür olana kadar bekle wait
        //elemente kadar scroll yap var ise
        //içini temizle
        //veriyi gönder

        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myClick(WebElement element){

        //clickable olana kaar bekle wait
        //elemente kadar scroll yap
        //click yap

        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();

    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void verifyContainsText(WebElement element, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));


    }


}
//Text e bir veri göndermek için
//gerekli olanlar
//
//-Görünür olana kadar bekle(wait)
//-Elemente kadar scroll yap (var ise)
//-içini temizle
//-veriyi gönder
//
//
//Button için neler yapılır
//
//-Clickable olana kadar bekle(wait)
//-Elemente kadar scroll yap
//-Click yap
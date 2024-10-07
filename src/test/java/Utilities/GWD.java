package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {   //genel web driver

private static WebDriver driver;

public static WebDriver getDriver(){

    if(driver==null)  //hiç oluşturulmamış ise
         driver=new ChromeDriver();
    //eğer zaten oluşmuşsa önceden oluşmuş driver ı gönder
    return driver;

}


}

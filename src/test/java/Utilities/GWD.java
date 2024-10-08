package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {   //genel web driver

private static WebDriver driver;

public static WebDriver getDriver(){

    if(driver==null)  //hiç oluşturulmamış ise

    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }
    //eğer zaten oluşmuşsa önceden oluşmuş driver ı gönder
    //
    return driver;

}

public static void quitDriver(){

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    if(driver!=null){

        driver.quit();
        driver=null;

    }

}

}

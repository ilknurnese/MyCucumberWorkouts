package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    //Cucumber a ait her senaryodan sonra çalışan
    //Annotation

    @After
    public void after(){

        GWD.quitDriver();


    }

}

package Hotstar_login;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/tes/resources/Features/Hotstar_Login.feature",glue= {"Hotstar_login"})


public class Test {

}

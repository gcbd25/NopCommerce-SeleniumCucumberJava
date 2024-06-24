package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features",
		glue = "stepDefinitions",
		//tags = "@Skip",
		dryRun=false,//creo que esto sirve para que se abra la ventana del navegador cuando esta en false
		plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)

public class testRun {

}
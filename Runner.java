package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Loginfunctionality",
features= {"C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\eclipse bakup\\Cucmber1\\src\\test\\resources\\NewLogin.feature"},
glue= {"stepDefination"},
plugin= {"pretty","html:target/newjavarun.html"}
)
public class Runner extends AbstractTestNGCucumberTests  {
 
  }

package com.primeclass.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions

            (features = "D:\\Core Java\\Cucumber-AakashPrime\\src\\main\\java\\com\\primeclass\\qa\\features", 
            glue = {"com.primeclass.qa.stepdefenitions" },
        	plugin = { "pretty", "html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },//for reporting 
            monochrome = true, //display the console output in proper readble format
            strict=true, //it will check if any step is not define inside the step defenitions.
        	dryRun = true)//to check the mapping between feature file and step definitions file.
		

		

public class TestRunner {

}

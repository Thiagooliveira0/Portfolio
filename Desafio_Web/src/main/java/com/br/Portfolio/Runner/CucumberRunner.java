package com.br.Portfolio.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.br.Portfolio.Code",
		features = {"src/main/resources/features/"},
		monochrome = true
		)

public class CucumberRunner {

	
}

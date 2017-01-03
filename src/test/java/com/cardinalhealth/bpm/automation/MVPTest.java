package com.cardinalhealth.bpm.automation;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "com/cardinalhealth/bpm/automation/MVP.feature",
        format = {"json:target/integration_cucumber.json"}//what formatters to use
		
        )
public class MVPTest {
}

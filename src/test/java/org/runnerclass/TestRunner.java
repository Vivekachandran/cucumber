package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature Files",glue="org.stepdefinition",
snippets=SnippetType.UNDERSCORE,dryRun=false,monochrome=true,strict=true,plugin={
		"html:src\\test\\resources\\ReportGeneration\\htmlRepor",
		"junit:src\\test\\resources\\ReportGeneration\\junit\\report1.xml",
		"json:src\\test\\resources\\ReportGeneration\\json\\reportjson.xml"})


public class TestRunner {
	@AfterClass
	public static void JVM() {
       GenerateReport.reportJVM("src\\\\test\\\\resources\\\\ReportGeneration\\\\json\\\\reportjson.xml");
	}
	

}

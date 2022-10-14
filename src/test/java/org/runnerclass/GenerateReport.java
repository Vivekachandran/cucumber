package org.runnerclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	public static void reportJVM(String path) {
		File f= new File("src\\test\\resources\\ReportGeneration\\JVMReport");
		Configuration c=new Configuration(f, "reportlogin");
		c.addClassifications("tag", "logintag");
		c.addClassifications("os", "windows");
		c.addClassifications("tool", "selenium");
		
		List<String> l=new ArrayList<String>();
		l.add(path);
		 ReportBuilder r=new ReportBuilder(l, c);
		 r.generateReports();

	}

}

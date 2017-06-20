package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	 public DynamicPort dynamicPort = new DynamicPort("http.port");
	 
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	  System.out.print("\n\nJUnit Test case #1: HTTP Dynamic Port -------> " + dynamicPort.getNumber() + "\n\n");
        runFlowAndExpect("maven-projectFlow", "hello");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}

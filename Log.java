

	package com.logExample;
	import org.apache.log4j.xml.DOMConfigurator;
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	                Demo.class
	                                })
	public class Log {
	                /**
	                 * Setup method to set system property for log file name
	                 */
	                @BeforeClass
	                public static void Setup() {
	                                // loading log4j.xml file
	                               DOMConfigurator.configure("log4j.xml");
	                }
	                /**
	                 * @param args
	                 */
	                public static void main(String[] args) {
	                                Result result = JUnitCore.runClasses(TestSuite.class);
	                                for (Failure failure : result.getFailures()) {
	                                                System.out.println("\nTEST NAME: " + failure.getTestHeader());
	                                                System.out.println("\nERROR: " + failure.getMessage() + "\n");
	                                                System.out.println(failure.getTrace());
	                                                System.exit(1);
	                                }
	                }             
	}


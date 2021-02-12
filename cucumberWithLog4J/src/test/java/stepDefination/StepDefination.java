package stepDefination;

import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import log4j.SystemOutToLog4j;

public class StepDefination {

	final static Logger logger = Logger.getLogger(StepDefination.class.getName());

	static {
		SystemOutToLog4j.enableForClass(StepDefination.class);
	}

	@Before
	public void beforeAll() throws Exception {
		// Reading the property file
		String log4jConfPath = System.getProperty("user.dir") + "/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
	}

	@Given("^Create an empty file\\.$")
	public void create_an_empty_file() throws Throwable {

		// Clearing the Output file
		PrintWriter pw = new PrintWriter(System.getProperty("user.dir") + "/logs/project/debug-log.out");
		pw.close();
	}

	@Given("^Share URL$")
	public void share_URL() throws Throwable {

		try {
			System.out.println("Accessed URL");
			System.out.println(" Step Name - Share URL");
		} catch (Exception e) {
			System.err.println(" Error Occured  due to --- " + e);
		}
	}

	@When("^Loggin to Application$")
	public void loggin_to_Application() throws Throwable {
		System.out.println("Loggin to application");

	}

	@Then("^User is logged into Application$")
	public void user_is_logged_into_Application() throws Throwable {
		System.out.println("Loged in successful");

	}

	@Then("^Validation Failed$")
	public void validation_Failed() throws Throwable {
		System.out.println("Validation Failed");
	}

}

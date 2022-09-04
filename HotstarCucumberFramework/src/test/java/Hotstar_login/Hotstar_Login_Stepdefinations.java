package Hotstar_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hotstar_Login_Stepdefinations {
	WebDriver driver;
	
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\sachi\\eclipse-workspace\\XML\\HotstarCucumberFramework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

	   
	}

	@Given("Land on login page")
	public void land_on_login_page() {
	   
	}

	@When("User enters valid credentials <mobile number>")
	public void user_enters_valid_credentials_mobile_number() {
	    
	}

	@When("Click on CONTINUE button")
	public void click_on_CONTINUE_button() {
	  
	}

	@Then("Enters OTP")
	public void enters_OTP() {
	    
	}

	@Then("Again click on CONTINUE button")
	public void again_click_on_CONTINUE_button() {
	    
	}

	@Then("User land on HOMEPAGE.")
	public void user_land_on_HOMEPAGE() {
	   
	}

}

package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GermanyLoginPage;

public class GermanyLoginFailureEmptyInput_stepdifinition {

	WebDriver driver;
	GermanyLoginPage germanyLoginPage;
	
	@Before
	public void init() {

		driver = new ChromeDriver();
		System.out.println("Browser Started");
		
		germanyLoginPage = new GermanyLoginPage(driver);
	}
	
	@Given("user should be on Germany Is Calling login page")
	public void user_should_be_on_germany_is_calling_login_page() {
		
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");
	}
	
	@When("user enters username and keep password will be empty")
	public void user_enters_username_and_keep_password_will_be_empty() {
		
		germanyLoginPage.LoginToGermany("manjushameshram95@gmail.com", " ");
	}
	
	@When("user will be click on login button")
	public void user_will_be_click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Then("user should display the error message as Password: This field is required.")
	public void user_should_display_the_error_message_as_password_this_field_is_required() {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.germanyiscalling.com/cv/upload/");
	}

	@After
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed");
	}
}


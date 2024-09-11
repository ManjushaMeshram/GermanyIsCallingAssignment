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

public class GermanyLoginFailure_stepdifinition {

	WebDriver driver;
	GermanyLoginPage germanyLoginPage;
	
	@Before
	public void init() {

		driver = new ChromeDriver();
		System.out.println("Browser Started");
		
		germanyLoginPage = new GermanyLoginPage(driver);
	}
	
	@Given("user will be on Germany Is Calling login page")
	public void user_will_be_on_germany_is_calling_login_page() {
		
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");
	}
	
	@When("user enters an incorrect username and password")
	public void user_enters_an_incorrect_username_and_password() {
	    
		germanyLoginPage.LoginToGermany("manjushameshram95@gmail.com", "Demo123");
	}
	
	@When("user click on the login button")
	public void user_click_on_the_login_button() {

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Then("user should display the message as wrong usrname and password provided")
	public void user_should_display_the_message_as_wrong_usrname_and_password_provided() {
	    
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.germanyiscalling.com/cv/upload/");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed");
	}
}


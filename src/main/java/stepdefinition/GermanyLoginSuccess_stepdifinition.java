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

public class GermanyLoginSuccess_stepdifinition {

	WebDriver driver;
	GermanyLoginPage germanyLoginPage;
	
	@Before
	public void init() {

		driver = new ChromeDriver();
		System.out.println("Browser Started");
		
		germanyLoginPage = new GermanyLoginPage(driver);
	}
	
	@Given("user is on Germany Is Calling login page")
	public void user_is_on_germany_is_calling_login_page() {
		
		driver.manage().window().maximize();
		driver.get("https://app.germanyiscalling.com/common/login/");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		germanyLoginPage.LoginToGermany("manjushameshram95@gmail.com", "Demo@123#");
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("user should navigate to Germany Is Calling landing page")
	public void user_should_navigate_to_germany_is_calling_landing_page() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.germanyiscalling.com/cv/upload/");
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed");
	}

}

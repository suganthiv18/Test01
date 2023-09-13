package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
//	String projectPath=System.getProperty("user.dir");
//	System.out.println("Project path is : "+projectPath);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
	
	}


	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	
	}


}

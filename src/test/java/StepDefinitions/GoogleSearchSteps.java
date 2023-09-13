package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
//
	WebDriver driver=null;
//	
//	
//@Given("browser is open")
//public void browser_is_open() {
//	
// System.out.println("Step 1 - browser is open");
//// System.setProperty("webdriver.chrome.driver", "C:/Users/satis/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
//	//driver = new ChromeDriver();
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	driver = new ChromeDriver(options);
//	
//	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//	//driver.manage().timeouts().pageLoadTimeout(20);
//	//driver.manage().window().maximize();
//}
//   
//
//@Given("user is on google search page")
//public void user_is_on_google_search_page() throws InterruptedException {
//   System.out.println("Step2 - user is on google serach page");
//   driver.navigate().to("https://google.com");
//   Thread.sleep(2000);
//}
//
//@When("user enters a text in search box")
//public void user_enters_a_text_in_search_box() throws InterruptedException {
//   System.out.println("Step3 - user enters a text");
//   driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//   Thread.sleep(2000);
//}
//
@And("hits enter")
public void hits_enter() throws InterruptedException {
	System.out.println("Step4 - user hits enter");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
}
//
//@Then("user is navigated to search results")
//public void user_is_navigated_to_search_results() throws InterruptedException {
//    System.out.println("Step5 - user is navigated");
//    driver.getPageSource().contains("OnlineCourses");
//    Thread.sleep(2000);
//    driver.close();
//    }

}


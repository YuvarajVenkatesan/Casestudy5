package logingin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("I want login")
	public void i_want_login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Eclipse\\Drive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@When("I enter username {string}")
	public void i_enter_username(String string) {
		driver.findElement(By.cssSelector("#userName")).sendKeys(string);
		 
	}

	@And("I enter my password {string}")
	public void i_enter_my_password(String string) {
		 driver.findElement(By.cssSelector("#password")).sendKeys(string);
		  
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(8) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();
		 
	}

	@Then("I should be in homepage")
	public void i_should_be_in_homepage() {
		 
		 if(driver.getTitle()=="Home") {
			 System.out.println("\n Success!!! \n");
		 }
	}

}

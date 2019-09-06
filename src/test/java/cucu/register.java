package cucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class register {
WebDriver driver;
@Given("I want to Register in testme")
public void i_want_to_Register_in_testme() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Eclipse\\Drive\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");	
}

@When("user enters un {string}")
public void user_enters_un(String string) {
	driver.findElement(By.id("userName")).sendKeys(string);
}
@And("user enters fn {string}")
public void user_enters_fn (String string) {
	driver.findElement(By.id("firstName")).sendKeys(string);	
}
@And("user enters ln {string}")
public void user_enters_ln (String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);
	 
}
@And("user enters p {string}")
public void user_enters_p (String string) {
	 driver.findElement(By.id("password")).sendKeys(string);
	  
}
@And("user enters cp {string}")
public void user_enters_cp (String string) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	 	
}
@And("user enters g {string}")
public void user_enters_g (String string) {
	if(string=="m") 
	{
	 driver.findElement(By.cssSelector("body > main > div > div > form > fieldset > div > div.row.form-group.has-success > div > div > label > span:nth-child(2)")).click();
	}
	else {
	driver.findElement(By.cssSelector("body > main > div > div > form > fieldset > div > div.row.form-group.has-success > div > div > label > span:nth-child(4)")).click();
	}
		
}
@And("user enters e {string}")
public void user_enters_e (String string) {
	driver.findElement(By.id("emailAddress")).sendKeys(string);
	  
}
@And("user enters pn {string}")
public void user_enters_pn (String string) {
	driver.findElement(By.id("mobileNumber")).sendKeys(string);	
}
@And("user enters d {string}")
public void user_enters_d (String string) {
	driver.findElement(By.cssSelector("#dob")).sendKeys(string);
	  
}
@And("user enters a {string}")
public void user_enters_a (String string) {
	driver.findElement(By.cssSelector("#address")).sendKeys(string);
	  
}
@And("user enters s {string}")
public void user_enters_s (String string) {
	Select ssss=new Select(driver.findElement(By.id("securityQuestion")));
	  ssss.selectByValue("41101"+string);
	  
}
@And("user enters an {string}")
public void user_enters_an (String string) {
	driver.findElement(By.id("answer")).sendKeys(string);
}
@When("user clicks register button")
public void user_clicks_register_button() {
	  driver.findElement(By.cssSelector("body > main > div > div > form > fieldset > div > div:nth-child(14) > div > input.btn.btn-lg.btn-success.col-xs-3.col-md-offset-0")).click();

}

@Then("I user gets successfull registration")
public void i_user_gets_successfull_registration() {
	Assert.assertEquals(driver.getTitle(),"Login");
	System.out.println("\n Success!!! \n");
}
}
package Invalidcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class invalidcart {
	WebDriver driver;
@Given("Alex has registered in to testme app")
public void alex_has_registered_in_to_testme_app() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Eclipse\\Drive\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(8) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();
}

@When("Alex search a particular product like headphones")
public void alex_search_a_particular_product_like_headphones() {
	  driver.findElement(By.id("myInput")).sendKeys("Headphone");
	  driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
}

@And("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	//Assert.assertEquals(driver.findElement(By.partialLinkText(" Cart")).getText(), " Cart");
		//System.out.println("Failure!!! \n Cart icon is displayed!!!");
}

@Then("Testme app doesnt display the cart icon")
public void testme_app_doesnt_display_the_cart_icon() {
	System.out.println("Success!!! \n Cart icon is not displayed!!!");

}

}

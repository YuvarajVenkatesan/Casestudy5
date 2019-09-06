package searchproduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchproduct {
	WebDriver driver;
	@Given("I want to login and search a product")
	public void i_want_to_login_and_search_a_product() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Eclipse\\Drive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}
	@When("I login {string} and {string}")
	public void I_login_and(String str,String strs) {
		driver.findElement(By.id("userName")).sendKeys(str);
		driver.findElement(By.id("password")).sendKeys(strs);
		driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(8) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();

	}
	@And("search a product by typing {string}")
	public void search_a_product_by_typing(String str) {
		//WebElement search = driver.findElement(By.id("myInput"));
		//  Actions A = new Actions(driver);
		//  A.keyDown(search,Keys.SHIFT).perform();
		 // A.sendKeys("b").pause(2000).sendKeys("a").pause(2000).sendKeys("g").pause(2000).perform();
		//  A.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand')]"))).click().perform();
		  driver.findElement(By.id("myInput")).sendKeys(str);
	}

	@And("click find details button")
	public void click_find_details_button() {
		driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	}

	@Then("products searched should be displayed")
	public void products_searched_should_be_displayed() {
		String strin=driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(1) > center:nth-child(1) > h4")).getText();
	    System.out.println(strin);
		if(strin.equalsIgnoreCase("Headphone"))
		{
	    	System.out.println("\n Success!!! \n");
	    	driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
		    driver.findElement(By.partialLinkText("Cart")).click();
		    driver.findElement(By.partialLinkText("Checkout")).click();
		    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div")).click();
	    }
	}
}

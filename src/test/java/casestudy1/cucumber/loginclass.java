package casestudy1.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginclass {
	WebDriver driver;
	WebDriver wait;
	@Given("^user not logged in$")
	public void user_not_logged_in() throws Throwable {
		driver=UtilityDriver1.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
		page pages= new page(driver);
		pages.do_login("lalitha", "Password123");
	}

	@Then("^logged in Successfully$")
	public void logged_in_Successfully() throws Throwable {
	
		Assert.assertEquals("Home", driver.getTitle());
		System.out.println("logged in successfully !!");
		driver.close();
	}
}

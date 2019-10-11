package casestudy1.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class signupclas {
	WebDriver driver;
/*	@Given("^launch the testme app and Click the signup button$")
	public void launch_the_testme_app_and_Click_the_signup_button() throws Throwable {
		driver=UtilityDriver1.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^Enter the credentials$")
	public void enter_the_credentials() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		  driver.findElement(By.name("userName")).sendKeys("jeevaprakaygs");
		  driver.findElement(By.name("firstName")).sendKeys("Radfsa");
		  Assert.assertEquals("Available", driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[1]/h3/span")).getText());
		  driver.findElement(By.name("lastName")).sendKeys("Selva");
		  driver.findElement(By.name("password")).sendKeys("rams97");
		  driver.findElement(By.name("confirmPassword")).sendKeys("rams97");
		  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")).click();
		  driver.findElement(By.name("emailAddress")).sendKeys("rams97@gmail.com");
		  driver.findElement(By.name("mobileNumber")).sendKeys("9764310258");
		  driver.findElement(By.name("dob")).sendKeys("06/01/1990");
		  driver.findElement(By.name("address")).sendKeys("19(6), CA");
		  Select secqu= new Select(driver.findElement(By.name("securityQuestion")));
		  secqu.selectByVisibleText("What is your Birth Place?");
		  driver.findElement(By.name("answer")).sendKeys("Madurai");
		  driver.findElement(By.name("Submit")).click();
	}

	@Then("^registered successfully$")
	public void registered_successfully() throws Throwable {
		Assert.assertEquals("Login", driver.getTitle());
		 driver.close();
	}
}*/
	@Given("^Open browser and proceed to TestMe App$")
	public void open_browser_and_proceed_to_TestMe_App() throws Throwable {
		driver = UtilityDriver1.openBrowser("chrome"); 
				driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	 
	}

	@When("^User enters User Name as \"([^\"]*)\"$")
	public void user_enters_User_Name_as(String arg1) throws Throwable {
	  driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters First Name as \"([^\"]*)\"$")
	public void user_enters_First_Name_as(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^User enters Last Name as \"([^\"]*)\"$")
	public void user_enters_Last_Name_as(String arg1) throws Throwable {
		 driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^User enters Password as \"([^\"]*)\"$")
	public void user_enters_Password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User enters Confirm Password as \"([^\"]*)\"$")
	public void user_enters_Confirm_Password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^User select gender  as \"([^\"]*)\"$")
	public void user_select_gender(String arg1) throws Throwable {
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[1]")).click();
	}

	@When("^User enters E -Mail as \"([^\"]*)\"$")
	public void user_enters_E_Mail_as(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^User enters Mobile Number as \"([^\"]*)\"$")
	public void user_enters_Mobile_Number_as(String arg1) throws Throwable {
		 driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^User enters DOB as \"([^\"]*)\"$")
	public void user_enters_DOB_as(String arg1) throws Throwable {
		 driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^User enters Address as \"([^\"]*)\"$")
	public void user_enters_Address_as(String arg1) throws Throwable {
		 driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^User enters Answer as \"([^\"]*)\"$")
	public void user_enters_Answer_as(String arg1) throws Throwable {
		 driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^Check if TestMe App login page is displayed$")
	public void check_if_application_homepage_is_displayed() throws Throwable {


		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
	
}

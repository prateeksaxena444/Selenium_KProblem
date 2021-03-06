package stepDefinitions;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages.Login_Page;
import Pages.SignUp_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scripts {
	public static WebDriver driver;
	Login_Page lp = new Login_Page();
	SignUp_Page sp = new SignUp_Page();
	
	 @Given("^I go to \"(.*)\"$")
	 public void User_go_to_url(String url) throws Throwable {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.findElement(lp.pop_up_close).click();
		 String title = driver.getTitle();
		 Assert.assertEquals("MyPedia", title);
		 System.out.println("We are on MyPedia Login Page");
	 }
	 
	 @And("^Check three languages in drop down$")
	 public void Check_three_languages() throws Throwable {
	 driver.findElement(lp.language_button).click();
	 String language1 = driver.findElement(lp.language_english).getText();
	 String language2 = driver.findElement(lp.language_hindi).getText();
	 String language3 = driver.findElement(lp.language_espanol).getText();
	 
	 Assert.assertEquals("English", language1);
	 Assert.assertEquals("हिंदी", language2);
	 Assert.assertEquals("Español", language3);
	 driver.findElement(lp.language_english).click();
	 }
	 
	 @When("^If i Choose \"(.*)\"$")
	 public void click_language(String language) throws InterruptedException
	 {
		 driver.findElement(lp.language_button).click();
		 
		 if(language.equals("English"))
		     driver.findElement(lp.language_english).click();
		 
		 if(language.equals("Hindi"))
			 driver.findElement(lp.language_hindi).click();
		 
		 if(language.equals("Espanol"))
			 driver.findElement(lp.language_espanol).click();
	 }
	 
	@Then("^Check Continue_language$")
	public void check_continue()
	{
		if(driver.findElement(lp.language_chosen).getText().equals("English"))
			{String continue_language = "CONTINUE";
			System.out.println(driver.findElement(lp.continue_language).getText());
		    Assert.assertEquals(driver.findElement(lp.continue_language).getText(), continue_language);}
		
		if(driver.findElement(lp.language_chosen).getText().equals("हिंदी"))
			{String continue_language = "अग्रसर रहें";
			System.out.println(driver.findElement(lp.continue_language).getText());
			Assert.assertEquals(driver.findElement(lp.continue_language).getText(), continue_language);}
		
		if(driver.findElement(lp.language_chosen).getText().equals("Español"))
			{String continue_language = "CONTINUAR";
			System.out.println(driver.findElement(lp.continue_language).getText());
			Assert.assertEquals(driver.findElement(lp.continue_language).getText(), continue_language);}
		
	}
	
	
	
	@And("^close browser$")
	public void close_browser()
	{
		driver.close();
	}
	
	@And("^Go to new registration page$")
    public void gotonewRegistration()
    {
		driver.findElement(lp.setup_account_button).click();
		driver.findElement(lp.create_new_account_button).click();
		Assert.assertTrue(driver.findElement(sp.personla_info_elem).isDisplayed());
    }
	
	@When("^I fill \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void gotonewRegistration(String firstname,String ParentUserName,String LastName,String Parentpassword,String Email,String ConfirmPassword)
	{
		WebElement we = driver.findElement(sp.create_account);
		driver.findElement(sp.firstName).sendKeys(firstname);
		Assert.assertFalse(sp.isClickable(driver,we));
		driver.findElement(sp.parent_username).sendKeys(ParentUserName);
		Assert.assertFalse(sp.isClickable(driver,we));
		driver.findElement(sp.last_name).sendKeys(LastName);
		Assert.assertFalse(sp.isClickable(driver,we));
		driver.findElement(sp.parent_Password).sendKeys(Parentpassword);
		Assert.assertFalse(sp.isClickable(driver,we));
		driver.findElement(sp.email).sendKeys(Email);
		Assert.assertFalse(sp.isClickable(driver,we));
		driver.findElement(sp.confirm_password).sendKeys(ConfirmPassword);
		
		System.out.println(sp.isClickable(driver,we) );
		Assert.assertFalse(sp.isClickable(driver,we));
	}
	
	@Then("^create account button should still be disabled$")
	public void create_account_shouldbe_disabled()
	{
		Assert.assertTrue(driver.findElement(sp.create_account).isDisplayed());
		Assert.assertTrue(driver.findElement(sp.create_account).isEnabled());
	}
			
			
	
	
	
	
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_Page {

	public By personla_info_elem = By.xpath("//*[@id=\"main\"]/div/div[3]/div[1]/div[1]/div[1]");
	
	public By firstName = By.xpath("//*[starts-with(@id,'undefined-undefined-Firstname')]");
	public By parent_username = By.xpath("//*[starts-with(@id,'undefined-undefined-Createparentusername')]");
	public By last_name = By.xpath("//*[starts-with(@id,'undefined-undefined-Lastname')]");
	public By parent_Password = By.xpath("//*[starts-with(@id,'undefined-undefined-Createparentpassword')]");
	public By email = By.xpath("//*[starts-with(@id,'undefined-undefined-Emailaddress')]");
	public By confirm_password = By.xpath("//*[starts-with(@id,'undefined-undefined-Confirmpassword')]");
	
	public By create_account = By.xpath("//*[@id=\"main\"]/div/div[5]/div/button/div/div/span");
	
	
	public boolean isClickable(WebDriver driver,WebElement elem)
	{
	
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver; String script =
		 * "var s = '';" + "var o = getComputedStyle(arguments[0]);" +
		 * "for(var i = 0; i < o.length; i++){" +
		 * "s+=o[i] + ':' + o.getPropertyValue(o[i])+';';}" + "return s;";
		 * 
		 * System.out.println(executor.executeScript(script, elem));
		 */
		
		String opacity=elem.getAttribute("style");
		System.out.println(opacity);
		if(opacity.contains("opacity: 0.3"))
		    return false;
		else if(opacity.contains("opacity: 1.0"))
			return true;
		else
			return true;
			
		
	}  
}

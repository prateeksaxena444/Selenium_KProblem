package Pages;

import org.openqa.selenium.By;

public class Login_Page {

	public By pop_up_close = By.cssSelector("#main-body-container > div:nth-child(14) > div > div:nth-child(1) > div > div > div > svg");
	
	public By language_button = By.cssSelector("#main > div > div.Chapter.loginLocaleWrap > div > div > div:nth-child(1) > div:nth-child(2)");
	public By language_english = By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[1]");
	public By language_hindi = By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[2]");
	public By language_espanol = By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[3]");
	
	
	public By language_chosen=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/div[1]/div[2]");
	public By continue_language = By.xpath("//*[@id=\"SI_0005\"]/div/div");
	
	public By setup_account_button = By.xpath("//*[contains(text(),'Set up parent support')]");
	public By create_new_account_button = By.xpath("//*[@id=\"main-body-container\"]/div[8]/div/div[1]/div/div/div[2]/div/div/div[4]/button/div/div/span");
	
	
}


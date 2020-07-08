package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_Page {

	WebDriver driver = null;

	
	public void  use_Name(String text) {
		driver.findElement(By.name("txtUsername")).sendKeys(text);
		}
	
	public void pass_word(String text) {
		driver.findElement(By.name("txtPassword")).sendKeys(text);
		}
	
	public void button_Click( ) {
		driver.findElement(By.name("Submit")).click();
	}
	
	public login_Page(WebDriver driver) {
		this.driver=driver;
			}

}

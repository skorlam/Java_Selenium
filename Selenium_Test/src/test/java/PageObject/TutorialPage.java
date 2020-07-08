package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialPage {
	WebDriver driver;
	By firstname = By.name("firstname");
	By lastName = By.name("lastname");
	By male = By.xpath("//input[@value='Male']");
	By female = By.xpath("//input[@value='Female']");
	By date = By.xpath("//strong[contains(text(),'Date')]/following::td[1]/input[1]");
	By experience = By.xpath("//input[@value='4']");
	By automation = By.xpath("//input[@value='Automation Tester']");
	By manual = By.xpath("//input[@value='Manual Tester']");
	By Flavours = By.xpath("//input[@value='Selenium Webdriver']");
	By continents = By.name("continents");
	By command = By.name("selenium_commands");
	By submit = By.name("submit");
	String projectPath = System.getProperty("user.dir");
	
	public TutorialPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void fname(String text) {
		driver.findElement(firstname).sendKeys(text);
	}
	
	public void lname(String text) {
		driver.findElement(lastName).sendKeys(text);
	}
	
	public void sex() {
		driver.findElement(female).click();
	}
	
	public void experience() {
		driver.findElement(experience).click();
	}
	
	public void date(String text) {
		driver.findElement(date).sendKeys(text);
	}
	
	public void Profession() {
		driver.findElement(manual).click();
	}
	
	public void flavour() {
		driver.findElement(Flavours).click();
	}
	
	public void continets(String text) {
		Select con = new Select(driver.findElement(continents));
		con.selectByVisibleText(text);
	}
	
	public void commands(String text) {
		Select com = new Select(driver.findElement(command));
		com.selectByVisibleText(text);
	}
	
	public void summit(){
		driver.findElement(submit).click();
	}
	
	
}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObject.TutorialPage;

public class fillUpForm {
	
	WebDriver driver;
	String F_Name = "Keerthi";
	String L_Name ="Korlam";
	String Date = "08/07/2020";
	String NA = "North America";
	String Sel_Comm1 = "Browser Commands";
	String Sel_Comm2 = "Navigation Commands";
	String Sel_Comm3 = "Switch Commands";
	String Sel_Comm4 = "Wait Commands";
	String Sel_Comm5 = "WebElement Commands";
	String projectPath = System.getProperty("user.dir");
	
	@Test(priority = 1)
	public void setBrowser() {
		System.setProperty("webdriver.gecko.driver", projectPath+"\\Driver\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		System.out.println("Firfox is Opened");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void fillingForm() {
		
		TutorialPage tp = new TutorialPage(driver);
		tp.fname(F_Name);
		tp.lname(L_Name);
		tp.sex();			//Selecting Female
		tp.experience(); 	//Selecting 4
		tp.date(Date);
		tp.Profession();  	//Selecting Manual Tester
		tp.flavour();		//Selenium Webdriver
		tp.continets(NA); 	//North Amreica
		tp.commands(Sel_Comm1);
		tp.commands(Sel_Comm2);
		tp.commands(Sel_Comm3);
		tp.commands(Sel_Comm4);
		tp.commands(Sel_Comm5);
		System.out.println("Test is Completed");
		
	}
	
	@Test(priority = 3)
	public void tearDown() {
		driver.close();
		System.out.println("Form Fill Up is Completed");
	}
	

}

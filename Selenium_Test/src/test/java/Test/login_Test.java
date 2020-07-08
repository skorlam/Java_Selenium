package Test;

//Using Main Method

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.login_Page;


public class login_Test {

	public static WebDriver driver;
	static String user="Admin";
	static String pass="admin123";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\Chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		login_Page lg = new login_Page(driver);
		lg.use_Name(user);
		lg.pass_word(pass);
		lg.button_Click();
		
		driver.close();
		System.out.println("Test is completed");
	}
		

	
			
}

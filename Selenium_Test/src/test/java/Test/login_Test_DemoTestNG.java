package Test;

//Using TestNG

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.login_Page;


public class login_Test_DemoTestNG {

	public static WebDriver driver;
	static String user="Admin";
	static String pass="admin123";
	static String browserName = "firefox";
	static String projectPath = System.getProperty("user.dir");
	
	@BeforeTest
	public static void setUpTest() {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Driver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome is Opened");
		} 
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Driver\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firfox is Opened");
		}
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath+"\\Driver\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Internet Explorer is Opened");
		}
		
	}
	
	@Test(priority = 1)
	public static void loginTest1() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Website is openned");
		System.out.println(projectPath);
		}
	
	@Test(priority = 2)
	public static void loginTest2() {
		login_Page lg = new login_Page(driver);
		lg.use_Name(user);
		lg.pass_word(pass);
		lg.button_Click();
		System.out.println("Login is successful");
	}
		
	@AfterTest
	public static void closeBrowser() {
		driver.close();
		System.out.println("Test is completed");
	}

	
			
}

package test.java;

import java.sql.Connection;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class NewTest {

	public static WebDriver driver1;
	public static String Browser;
	public XSSFWorkbook wb;
	public XSSFSheet sheet1;
	Properties p;
	public Connection con;
	String connectionString;
	@Test
	public static void testgooglesearch() 
	{
		
		
		System.out.println("Launching browser..");
		Browser = "chrome";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
		options.addArguments("--silent");
		driver1 = new ChromeDriver(options);
		
		
		driver1.get("http://google.in");
		// we expect the title “Google “ should be present
		String Expectedtitle = "Google";
		// it will fetch the actual title
		String Actualtitle = driver1.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		// it will compare actual title and expected title
		// print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		System.out.println("Hello World");
	}
	

}

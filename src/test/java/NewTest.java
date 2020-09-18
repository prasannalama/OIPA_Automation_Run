package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {

	@Test
	public static void testgooglesearch() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\Framework\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.in");
		// we expect the title “Google “ should be present
		String Expectedtitle = "Google";
		// it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		// it will compare actual title and expected title
		// print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		System.out.println("Hello World");
	}
	

}

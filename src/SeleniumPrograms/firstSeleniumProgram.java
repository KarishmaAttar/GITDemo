package SeleniumPrograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSeleniumProgram 
{
	public static void main(String[] arr)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com/");
	}
}

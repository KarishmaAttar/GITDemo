 
package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class secondSeleniumProgram 
{
	public static void main(String[] arr)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		Select sel=new Select(driver.findElement(By.id("continents")));
		sel.selectByIndex(1);
		
		driver.findElement(By.name("firstname")).sendKeys("Karishma");
		driver.findElement(By.name("lastname")).sendKeys("Attar");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("20/04/2019");
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("tool-0")).click();
		sel.selectByVisibleText("Africa");
		
		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		driver.findElement(By.linkText("Link Test")).click();
		driver.navigate().back();
		
		driver.findElement(By.id("submit")).click();
		
		
		
		
		
	}
}

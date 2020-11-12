package Seleniumprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Salesparent {
	static WebDriver driver;

	 
	 
	public void invokeChromeBrowser()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	public void invokeIEBrowser()
	{
		 
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	public void salesLogin() throws Exception
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/?locale=eu");
		String title=driver.getTitle();
		System.out.println("Title of the page : "+title);
		FileInputStream fs=new FileInputStream("C:\\Users\\Manila\\eclipse-workspace\\monica\\src\\Seleniumprograms\\details.properties");
		Properties p=new Properties();
		p.load(fs);
		String pwd=p.getProperty("password");
		WebElement username=driver.findElement(By.cssSelector("#username"));
		username.sendKeys(p.getProperty("username"));
		WebElement password=driver.findElement(By.cssSelector("#password"));
		password.sendKeys(pwd);
		WebElement loginbtn=driver.findElement(By.cssSelector("#Login"));
		loginbtn.click();
		String error=driver.findElement(By.cssSelector("#error")).getText();
		System.out.println("Error message : "+error);
		if(error.contains("Please check your username and password"))
		{
			System.out.println("login failed");
	    }
		else
		{
			System.out.println("login passed");
		}
	
	}
	
	
}

package Wignify;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	//Login With Valid data Without Clicking On Remember Me Button
	
	@Test(priority=1)
	public void loginWithValidData() throws InterruptedException
	{
	   WebDriverManager.firefoxdriver().setup();
	   WebDriver driver=new FirefoxDriver();
       driver.get("https://sakshingp.github.io/assignment/login.html#");
       driver.manage().window().maximize();
       driver.findElement(By.xpath(".//input[@id=\"username\"]")).sendKeys("shubham supane");
       driver.findElement(By.xpath(".//input[@id=\"password\"]")).sendKeys("Shubham1818");
       driver.findElement(By.id("log-in")).click();
       Thread.sleep(2000);

	}
		//Login With Valid data With Clicking On Remember Me Button
	 
	@Test(priority=2)
	 public void loignWithClickingRememberMeButton() throws InterruptedException
	 {
		 WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
	       driver.get("https://sakshingp.github.io/assignment/login.html#");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath(".//input[@id=\"username\"]")).sendKeys("shubham supane");
	       driver.findElement(By.xpath(".//input[@id=\"password\"]")).sendKeys("Shubham1818");
	       driver.findElement(By.className("form-check-input")).click();
	       driver.findElement(By.id("log-in")).click();
	       Thread.sleep(2000); 
	 }
	// check can we login with twitter or not
	@Test(priority=3)
	public void loginWithTwitter() throws InterruptedException
	{

		 WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
	       driver.get("https://sakshingp.github.io/assignment/login.html#");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath(".//img[@src='img/twitter.png']")).click();
	       Thread.sleep(2000); 
	}
	// check can we login with Facebook or not
	@Test(priority=4)
	public void loginWithFacebook() throws InterruptedException
	{

		 WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
	       driver.get("https://sakshingp.github.io/assignment/login.html#");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath(".//img[@src='img/facebook.png']")).click();
	       Thread.sleep(2000); 
	}
	// check can we login with Linkdin or not
	@Test(priority=5)
	public void loginWithLinkdin() throws InterruptedException
	{

		 WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
	       driver.get("https://sakshingp.github.io/assignment/login.html#");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath(".//img[@src='img/linkedin.png']")).click();
	       Thread.sleep(2000); 

}
}

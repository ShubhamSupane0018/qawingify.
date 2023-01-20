package Wignify;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver=new FirefoxDriver();
	      driver.get("https://sakshingp.github.io/assignment/login.html#");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath(".//input[@id=\"username\"]")).sendKeys("shubham supane");
	      driver.findElement(By.xpath(".//input[@id=\"password\"]")).sendKeys("Shubham1818");
	      driver.findElement(By.id("log-in")).click();
	      
	      
	      List<WebElement> transactions=driver.findElements(By.xpath(".//div[@class='table-responsive']"));
	      String[] beforeSort_amount=new String[ transactions.size()];
	      for(int i=0;i< transactions.size();i++)
	      {
	    	 beforeSort_amount[i]= transactions.get(i).getText();
	
	      }
	     System.out.println("Before sort");
	     print(beforeSort_amount);
	  
	     WebElement amountBtn=driver.findElement(By.xpath(".//th[@id='amount']"));
	     amountBtn.click();
	    
	     transactions=driver.findElements(By.xpath(".//div[@class='table-responsive']"));
	     String[] afterSort_amount=new String[ transactions.size()];
	      for(int i=0;i< transactions.size();i++)
	      {
	    	 afterSort_amount[i]= transactions.get(i).getText();
	
	      }
	     Assert.assertEquals(beforeSort_amount, afterSort_amount);
	     System.out.println("Sort Verified Properly");
        	}
	    public static void print(String[] ar)
	     {
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}


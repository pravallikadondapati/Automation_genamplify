package Mavenselenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboDropdownAutomation {

	public static void main(String[] args) 
	{
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		//close pop up	
		
		  driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		  
		  
		  driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		  //from
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		  
		List<WebElement> li=  driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle']"));
		System.out.println("Total Options are:"+li.size());
		
		for(WebElement i:li)
		{
			System.out.println(i.getText());
			if(i.getText().contains("pantnagar,India"))
			{
				i.click();
				break;
	}
		}
		  
		  
	}
	

	}
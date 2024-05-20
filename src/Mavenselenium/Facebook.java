package Mavenselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void selectBasedDropdown (WebElement ele, String value)
	{
		Select dd=new Select(ele);
		List<WebElement> list=dd.getOptions();
		
		
		System.out.println("Total options:"+list.size());
		System.out.println("Is dropdown support multiple selection:?"+	dd.isMultiple());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("value"));
			{
				
				i.click();
				break;
				}
		}
		
		
		
	}
	
	

	public static void main(String[] args) 
	
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage ().timeouts(). implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("cerate new account")).click();
		WebElement   dd1=driver.findElement(By.id("day"));
		
		selectBasedDropdown(dd1,"27");
		WebElement monthdd=driver.findElement(By.id("month"));
		
		selectBasedDropdown(monthdd,"Dec");
		
		WebElement yeardd=driver.findElement(By.id("year"));
		selectBasedDropdown(yeardd,"2010");
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
//		
//		//Select class
//	}
//		
//		public void selectBasedDropdown(WebElement ele, String value)
//		{
//			
//		
//		Select dd=new Select(ele);
//		List<WebElement> list=dd.getOptions();
//		
//		
//		System.out.println("Total options:"+list.size());
//		System.out.println("Is dropdown support multiple selection:?"+	dd.isMultiple());
//		
//		for(WebElement i:list)
//		{
//			System.out.println(i.getText());
//			
//			if(i.getText().contains("value"));
//			{
//				
//				i.click();
//				break;
//				}
//		}
//		
//		
//		
//		
//		
//	}
//
//}
//
// 
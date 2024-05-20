package Mavenselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_page {



	public static void main(String[] args) throws InterruptedException {
	 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.amazon.in");
		//dropdown address
		
		WebElement ddEle=driver.findElement(By.id("searchDropdownBox"));
		
		//select class
		Select allDd=new Select(ddEle);
		
		System.out.println("Is dropdown support multiple selection:?"+allDd.isMultiple());
		
		//Single Selection
		allDd.selectByIndex(3);
		Thread.sleep(2000);
		
		allDd.selectByValue("Select-alias=stripboks");
		Thread.sleep(2000);
		
		allDd.deselectByVisibleText("Toys & Games");
		
		//TO get all the options
		List <WebElement> list=allDd.getOptions();
		
		
		System.out.println("Total options  are:"+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("software"))
			{
				
				i.click();
				break;
			}
		}
	

		
		
		

	}

}

package Day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpCountryEle=driver.findElement(By.xpath("//Select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		//select option from  the drop down
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByValue("Japan");
		drpCountry.selectByIndex(6);
		List <WebElement>Options=drpCountry.getOptions();
		System.out.println("Number of options in a drop down:"+Options.size());//10
		//printing the options
		for(int i=0;i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
			
		}
		
		
		
		
		
		
		
		
	}
	

	

}

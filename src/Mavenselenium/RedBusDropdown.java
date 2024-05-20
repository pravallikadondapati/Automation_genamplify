package Mavenselenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RedBusDropdown {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyd");
		List<WebElement> Todd=driver.findElements(By.xpath("class=\"sc-ifAKCX gLwVlD\""));
		System.out.println("Total options are:"+Todd.size());
		for(WebElement i:Todd)
		{
			System.out.println(i.getText());
		if(i.getText().contains("Viman Nagar"))
		{
			i.click();
			break;	
//		driver.findElement(By.id("src")).sendKeys("pune");
//		List<WebElement> fromdd=driver.findElements(By.xpath("//ul[@class ='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
//		System.out.println("Total options are:"+fromdd.size());
//		for(WebElement i:fromdd)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("Viman Nagar"))
//			{
//				i.click();
//				break;
//			}
//		}
	}
}
	}
}




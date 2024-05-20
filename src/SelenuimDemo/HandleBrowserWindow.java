package SelenuimDemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Propagator.Setter;

public class HandleBrowserWindow {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM,Inc]")).click();
		Set<String>windowIDs=driver.getWindowHandles();
		List<String>windowList=new ArrayList(windowIDs);
		
		String parentID=windowList.get(0);
		String chlidID=windowList.get(1);
	}
	
	
		
		
		
	



}


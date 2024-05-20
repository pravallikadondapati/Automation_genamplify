package Mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//locator
		By email=By.name("email");
		By pass=By.name("password");
		By btn=By.xpath("//input[@value='Login']");
		driver.findElement(email).sendKeys("test@gmail.com");
		driver.findElement(pass).sendKeys("test123");
		driver.findElement(btn).click();
		

	}

}

package Mavenselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert1
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of Alert is:"+alt1.getText());
		
		alt1.accept();
		WebElement resele=driver.findElement(By.id("result"));
		
		System.out.println(resele.getText());
		//alert2
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		Alert alt2=driver.switchTo().alert();
		
		System.out.println("Text of Alert2 is:"+alt2.getText());
		
		alt2.dismiss();
		
		System.out.println(resele.getText());
		
		//alert3
		
		
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
		
		Alert alt3=driver.switchTo().alert();
		
		System.out.println("Text of Alert3 is:"+alt3.getText());
		
		alt3.sendKeys("Hello All"); 
		
		alt3.accept();
	}

}

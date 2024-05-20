package Mavenselenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDemo {
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//name
	driver.findElement(By.id("login1")).sendKeys("pravallika");
//	//password
//	driver.findElement(By.id("pass")).sendKeys("bujji");
//	
	//button
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(3000);
	Alert alt=driver.switchTo().alert();
	}
}


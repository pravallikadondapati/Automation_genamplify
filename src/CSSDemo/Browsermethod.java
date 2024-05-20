package CSSDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(1000);
			driver.findElement(By.linkText("OrangeHRM.Inc")).click();//this will opens newbroswer window
			
			Thread.sleep(1000);
			driver.quit();
		}
	}



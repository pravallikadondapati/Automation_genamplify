package SelenuimDemo;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {
	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("\"https://demo.nopcomnerce.com/");
		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		//driver.navigate().to("https://demo.nopcomnerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());//("https://demo.nopcomnerce.com/");
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());//("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();

	}

}

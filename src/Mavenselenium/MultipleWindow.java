package Mavenselenium;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindow {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://openssources-demo.orangehrmlive.com/web/index.php/");
	}

}


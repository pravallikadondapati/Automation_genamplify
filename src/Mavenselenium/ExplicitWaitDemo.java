package Mavenselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExplicitWaitDemo {
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	By startbtn=By.xpath("//button[text()='Start']");
	By text=By.xpath("//h4[text()='Hello World!']");
	driver.findElement(startbtn).click();
	String restext=driver.findElement(text).getText();
	System.out.println(restext);
	}
}

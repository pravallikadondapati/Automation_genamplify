package CSSDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class conditionalmethods {
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
	//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopcommerce demo store']"));
	//System.out.println("Dispaly status of logo:"+logo.isDisplayed());
	boolean status=driver.findElement(By.xpath("//img[@alt='nopcommerce demo store']")).isDisplayed();
	System.out.println("Dispaly status:"+status);
	//isEnable()
	//boolean status1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	// System.out.println("Enable status:"+status);
	//isSelected
	WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("Before selection.....");
	System.out.println(male_rd.isSelected());//flase
	System.out.println(female_rd.isSelected());//flase
	System.out.println("After selecting male..");
	male_rd.click();  //select male radio button
	System.out.println(male_rd.isSelected());//true
	System.out.println(female_rd.isSelected());//false
	}
}

package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handleframes {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Pravallika");
		driver.switchTo().defaultContent();//go back to page
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("pavan");
		driver.switchTo().defaultContent();//go back to page
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenuim");
		driver.switchTo().defaultContent();//go back to page
		//frame4
		//WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		//driver.switchTo().frame(frame4);
	//	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("mouinka");
		
		//inner iframe -part of frame 3
		 driver.switchTo().frame(0);//Swtiching to frame using  index
		 
		 driver.findElement(By.xpath("//div[@id='i3']//div[@class='AB7Lab Id5V1']")).click();
	}

}

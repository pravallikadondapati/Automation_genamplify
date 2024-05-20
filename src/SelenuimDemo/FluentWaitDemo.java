package SelenuimDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.profiler.model.FunctionCoverage;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static  <webElement, webDriver> void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		//fluent wait declaration
		
		Wait<WebDriver> mywait=new FluentWait <WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
				
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtUsername = mywait.until((java.util.function.Function<? super WebDriver, T>) new Function<webDriver,webElement>(){

			@Override
			public webElement apply(webDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		}
		
		
		
		}
		
	}

}

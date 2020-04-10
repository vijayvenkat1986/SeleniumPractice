package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		WebElement frameone = driver.findElement(By.id("iframe1"));
		
		driver.switchTo().frame(frameone);
		
		driver.findElement(By.linkText("Hotels")).click();	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("q")).sendKeys("Vijay Venkatesh");
		

	}

}

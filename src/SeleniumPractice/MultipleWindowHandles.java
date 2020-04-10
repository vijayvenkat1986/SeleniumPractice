package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		String parentWindowID = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		for(String tempWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(parentWindowID);
		}
		
		driver.findElement(By.linkText("Blogger")).click();
		

		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String WindowID = itr.next();
			
			driver.switchTo().window(WindowID);
			
			System.out.println(driver.getTitle());
		}
		}
		
				
		
		

	}



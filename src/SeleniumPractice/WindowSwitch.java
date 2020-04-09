package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> wndw = driver.getWindowHandles();
		
		Iterator<String> nw = wndw.iterator();
		
		String mainWindow = nw.next();
		String ChildWindow = nw.next();
		
		driver.switchTo().window(ChildWindow);
		
		Thread.sleep(50000);
		
		driver.close();
		
		
		
		
	}
	
	
	
	
	

}

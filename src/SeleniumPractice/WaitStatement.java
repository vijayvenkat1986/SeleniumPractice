package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		//elementtobeclickable option for elements which will get enabled after some time.
		
		element.click();
				
		
		
		
		

	}

}

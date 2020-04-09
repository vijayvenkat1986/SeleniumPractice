package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		Dimension newDimension = new Dimension(1000,700);
		driver.manage().window().setSize(newDimension);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirm")).click();
		
		driver.switchTo().alert().accept();
		
		String str = driver.getTitle();
		System.out.println(str);
		
		String FirstURL = driver.getCurrentUrl();
		System.out.println(FirstURL);
		
		String attrib = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(attrib);
		
		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println("Button 2 is displayed " +displayed);
		
		boolean displayed2 = driver.findElement(By.id("but1")).isDisplayed();
		System.out.println("Button 1 is displayed " +displayed);
		
		boolean enabled = driver.findElement(By.id("but1")).isEnabled();
		System.out.println("Button 1 is enabled " +enabled);
		
		boolean selected = driver.findElement(By.xpath("//*[@name='color'][@value='orange']")).isSelected();
		System.out.println("Option is enabled " +selected);
		
		driver.findElement(By.linkText("Blogger")).click();
		
		/*driver.findElement(By.linkText("newtours")).click();
		
		String secondURL = driver.getCurrentUrl();
		System.out.println(secondURL);
		
		driver.findElement(By.linkText("Blogger")).click();*/
		driver.close();

	}

}

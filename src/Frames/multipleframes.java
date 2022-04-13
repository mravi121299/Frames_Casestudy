package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleframes {
	@Test
	public void Framesdemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Ravi%20Mishra/Downloads/frame.html");
		
		
		// COUNTING THE NUMBER OF FRAMES
		
		int n=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames is..."+n);
		
		//Perform some action in 
		//SWITCH STATEMENT
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("7905691295");
		driver.findElement(By.id("log_password")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]")).click();
		driver.navigate().to("file:///C:/Users/Ravi%20Mishra/Downloads/frame.html");
		
		
		
		
		
		
		}

}

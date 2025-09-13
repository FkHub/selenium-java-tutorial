package PersonalPratice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faizan Khan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faizan Khan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[class *='submit-button']")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/div/button[@id='react-burger-menu-btn']")).click();	
		driver.findElement(By.cssSelector("a[id='logout_sidebar_link']")).click();
		
		driver.navigate().to("http://www.rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.close();
		
		
		//driver.close();		
		

	}

}

package PersonalPratice;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutomationPractice {
	
	private String String;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faizan Khan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faizan Khan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = gettingPassword(driver);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[class *='submit-button']")).click();
		//driver.switchTo().alert().dismiss();
		//System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/div/button[@id='react-burger-menu-btn']")).click();	
		driver.findElement(By.cssSelector("a[id='logout_sidebar_link']")).click();
		
		driver.navigate().to("http://www.rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
			
		

	}
	
	public static  String gettingPassword(WebDriver driver) {
		
		driver.get("https://www.saucedemo.com/");
		String passwordList = driver.findElement(By.cssSelector("div[class='login_password']")).getText();
		String [] passwordArray = passwordList.split(":");
		String password = passwordArray[1];
		return password;
		
	}

}

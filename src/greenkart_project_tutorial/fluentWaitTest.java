package greenkart_project_tutorial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faizan Khan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id =\"start\"] button")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout( Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		  WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 if(driver.findElement(By.cssSelector("div[id =\"finish\"] h4")).isDisplayed()) {
			    		 
			    		 return driver.findElement(By.cssSelector("div[id =\"finish\"] h4"));
			    	 }
			    	 else {
			    		 return null;
			    	 }
			       
			     }
			   });
		  System.out.println(driver.findElement(By.cssSelector("div[id =\"finish\"] h4")).getText());
		
	}

}

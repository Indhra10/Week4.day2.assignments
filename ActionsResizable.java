package Week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		//WebElement resize=driver.findElement(By.id("resizable"));
		WebElement cursor=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions actionbuilder=new Actions(driver);
		actionbuilder.clickAndHold(cursor).moveByOffset(80, 60).release().build().perform();
		
		
		
		
		
        
	}

}

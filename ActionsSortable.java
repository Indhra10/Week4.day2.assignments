package Week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		
	
		
		Actions actionbuilder=new Actions(driver);
		
		
		WebElement Item1=driver.findElement(By.xpath("//ul[@id='sortable']/li"));
		WebElement Item5=driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
		
		actionbuilder.click(Item1).clickAndHold().moveToElement(Item5).moveByOffset(170,170).build().perform();
	}

}

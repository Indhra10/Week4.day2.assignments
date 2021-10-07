package Week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectable {
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		
		WebElement selec=driver.findElement(By.id("selectable"));
		
		Actions actionbuilder=new Actions(driver);
		
		
		WebElement Item1=driver.findElement(By.xpath("//ol[@id='selectable']/li"));
		WebElement Item5=driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		
		actionbuilder.click(Item1).clickAndHold().dragAndDropBy(Item5, 10, 10).release().build().perform();
		
		
		
		
	}

}

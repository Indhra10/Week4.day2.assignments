package Week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDroppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//WebElement frame1=driver.findElement(By.id("demo-frame"));
		//driver.switchTo().frame(frame1);
		driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        
        Actions actionbuilder=new Actions(driver);
        actionbuilder.dragAndDrop(drag, drop).perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.close();
        
	}

}

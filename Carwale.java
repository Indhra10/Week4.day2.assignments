package Week4.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Carwale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      
      driver.get("https://www.carwale.com/");
    //     driver.findElement(By.xpath("//div[@class='o-cKuOoN ']")).click();
    //  driver.findElement(By.xpath("//img[@title='Chennai']")).click();
  //    driver.close();
  //    driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[2]/div[1]/span/span/svg/path")).click();
      
      WebElement listoption=driver.findElement(By.xpath("//ul[@class='o-bkmzIL o-cpnuEd']/li[2]/div"));
      Actions actionbuilder=new Actions(driver);
      
      actionbuilder.moveToElement(listoption).perform();
      
      WebElement subMenu=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[2]/div[2]/div/div/div/div[2]/a[2]"));
      
      actionbuilder.moveToElement(subMenu).click().build().perform();
      
      
      
     WebElement cityName=driver.findElement
    		 (By.xpath("//div[@id='locationProceed']/div[2]/div/input"));
     cityName.sendKeys("Che");
     //cityName.sendKeys(Keys.ENTER);
    List<WebElement> lists= driver.findElements(By.xpath("//*[@id='ui-id-2']/li/a"));
    System.out.println(lists.size());
    
    for (WebElement webElement : lists) {
    	String s=webElement.getAttribute("cityname");
    	if(s.equalsIgnoreCase("Chennai,tamilnadu"))
    		webElement.click();    	
    	
		
	}
    
    
     
	
	  driver.findElement(By.xpath("//div[@class='used-budget-box']/div/span")).click();
	  
	  WebElement min= driver.findElement(By.id("minInput")); min.clear();
	  min.sendKeys("8"); WebElement max=driver.findElement(By.id("maxInput"));
	  max.clear(); max.sendKeys("12");
//	  driver.findElement(By.xpath("//ul[@id='makesList']/li[16]/span")).click();
	  driver.findElement(By.id("btnSetBudget")).click();
	 
     
     
     
     
     
     
	}

}

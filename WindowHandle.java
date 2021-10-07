
package Week4.day2.assignments;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
	      ChromeDriver  webdrive=new ChromeDriver();
	      webdrive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      webdrive.manage().window().maximize();
       
       webdrive.get("http://www.leafground.com/pages/Window.html");
       
       WebElement homebutton= webdrive.findElement(By.id("home"));
       
       String parentwindow = webdrive.getWindowHandle();
       homebutton.click();
       
       
       Set<String> handle= webdrive.getWindowHandles();
       
       for (String secondwindow : handle) {
    	   
    	   webdrive.switchTo().window(secondwindow);
    	
	}
       WebElement editbutton = webdrive.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
	   editbutton.click();
	   Thread.sleep(5000);
	   webdrive.close();
	   
	   
		webdrive.switchTo().window(parentwindow);			
		WebElement secondbutton=webdrive.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
				   
			       secondbutton.click();
			

			       Set<String> handle1= webdrive.getWindowHandles();
			       
			       for (String otherwindow : handle1) {
			    	   
			    	   
			    	   
			    	   webdrive.switchTo().window(otherwindow);
			    	   
			    	   
			    			   
			    			   
			    	   
			    	
				}
    
      
       
       

}
}


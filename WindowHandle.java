package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
   // Get the current window handle
        String mainwindowHandle = driver.getWindowHandle();

   // Print the current window handle
        System.out.println("Current Window Handle: " + mainwindowHandle);
	
   //click on New Tab and print the displayed text
		 
        driver.findElement(By.id("tabButton")).click();
			
		Set<String>allWindowhandles=driver.getWindowHandles();
		
		for (String windowHandle : allWindowhandles) {
            if (!windowHandle.equals(mainwindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
		
            }
		}
		WebElement element= driver.findElement(By.id("sampleHeading"));
		String elementText = element.getText(); 
		 System.out.println("Element Text: " + elementText);	 	 
		driver.switchTo().window(mainwindowHandle);
		
 
	//click on New Window and print the displayed text
		
       driver.findElement(By.id("windowButton")).click();
		
		 Set<String>allWindowhandles1=driver.getWindowHandles();
		
		 for (String windowHandle : allWindowhandles1) {
	            if (!windowHandle.equals(mainwindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
			
	            }
			}
		 WebElement element1= driver.findElement(By.id("sampleHeading"));
			String elementText1 = element1.getText(); 
		 System.out.println("Element Text: " + elementText1);	 	 
		driver.switchTo().window(mainwindowHandle);
		
	
	//click on New Window Message and print the displayed text
			
			driver.findElement(By.id("messageWindowButton")).click();
			
			 Set<String>allWindowhandles2=driver.getWindowHandles();
			
			 for (String windowHandle : allWindowhandles2) {
		            if (!windowHandle.equals(mainwindowHandle)) {
		                driver.switchTo().window(windowHandle);
		                break;
				
		            }
				}
			 //WebElement element2= driver.findElement(By.xpath("/html/body/text()"));
				//String elementText2 = element2.getText(); 
				 //System.out.println("Element Text: " + elementText2);	 	 
				driver.switchTo().window(mainwindowHandle);	
			
						
	     driver.quit();
	}
		
}

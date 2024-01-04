package live.once;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAWindow {
	static WebDriver driver;
	
	public static void generic(String m) {
		driver.findElement(By.id (m)).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

driver= new ChromeDriver();
driver.get("https://demoqa.com/browser-windows");

String parentwindow= driver.getWindowHandle();
generic("tabButton");
generic("windowButton");
generic("messageWindowButton");


 Set<String> d=driver.getWindowHandles();
 for (String dm: d) {
	
 if (!dm.equals(parentwindow)) {
	 
	 driver.switchTo().window(dm);
	 String c= driver.getCurrentUrl();
	
	System.out.println(c);
	driver.close();
 }
	 
 }
driver.quit();
	}}



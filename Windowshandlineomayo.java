package live.once;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandlineomayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new ChromeDriver();

driver.get("https://omayo.blogspot.com/");

String parentwindow=driver.getWindowHandle();
System.out.println(parentwindow);

driver.findElement(By.id("selenium143")).click();
driver.findElement(By.linkText("Open a popup window")).click();
Set <String> childwindows=driver.getWindowHandles();

for (String childwd:childwindows ) {
	 if (!childwd.equals(parentwindow)) {
		//If window handle is not main window handle then close it 
		 driver.switchTo().window(childwd);
		 driver.close();
	
	 }
	
}
driver.switchTo().window(parentwindow);	}

}

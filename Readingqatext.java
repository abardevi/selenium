package live.once;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingqatext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentwindow=driver.getWindowHandle();
		
		// to click on new tab
		WebElement newbutton= driver.findElement(By.id("tabButton"));
		newbutton.click();
		
		Set<String> d=driver.getWindowHandles();
		
		for (String m: d) {
			
			if (!m.equals(parentwindow)) {
				driver.switchTo().window(m);
			String op=driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(op);
			
			break;
			}
		}
		Thread.sleep(3000);
driver.switchTo().window(parentwindow);
driver.quit();
	}

}

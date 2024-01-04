package live.once;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		// clicking tab and find current window by get title
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		System.out.println(driver.getTitle());
		// to get title of all windows
		
		/*Set <String> s=driver.getWindowHandles();
		for (String sm:s) {
			String t=driver.switchTo().window(sm).getTitle();
			System.out.println(t);
		}*/
		
		// to get what id contains
		Set <String> s=driver.getWindowHandles();
		for (String sm:s) {
			System.out.println(sm);
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}

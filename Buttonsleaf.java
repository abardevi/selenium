package live.once;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttonsleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		String parentwindow= driver.getWindowHandle();
		
		//1.Click and Confirm title.
		
		WebElement clik =driver.findElement(By.id("j_idt88:j_idt90"));
		clik.click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		//2.Confirm if the button is disabled.
		WebElement second= driver.findElement(By.id("j_idt88:j_idt92"));
		System.out.println(second.isEnabled());
		
		//3.Find the position of the Submit button
		WebElement pos=driver.findElement(By.id("j_idt88:j_idt94"));
		Point p= pos.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//4. Find the save color
		
		WebElement save =driver.findElement(By.id("j_idt88:j_idt96"));
		System.out.println(save.getCssValue("color"));
		
		//5. Find the height and width of this button
		WebElement button= driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension d= button.getSize();
		System.out.println("Height is: "+d.getHeight());
		System.out.println("width is: "+d.getWidth());
		//6.Mouse over and confirm the color changed
		
		WebElement actm= driver.findElement(By.id("j_idt88:j_idt100"));
		System.out.println(actm.getCssValue("background-color"));
		Actions act= new Actions(driver);
		act.moveToElement(actm).perform();
		
		System.out.println("after color change: "+actm.getCssValue("background-color"));
		
		//7.how many rounded buttons present
		
		List<WebElement> dr=driver.findElements(By.xpath("//div[@class='card']/button[contains(@class,'only rounded')]"));
		
		System.out.println(dr.size());
		Thread.sleep(9000);
		driver.quit();

	}

}

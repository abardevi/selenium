package live.once;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		//1. type your name-- first text box
		WebElement firstbox= driver.findElement(By.id("j_idt88:name"));
		firstbox.sendKeys("mugil");
		
		//2. Append Country to this City.--second box
		
		WebElement secondbox=driver.findElement(By.id("j_idt88:j_idt91"));
		secondbox.sendKeys(" madurai");
		//Verify if text box is disabled
		
		WebElement thirdbox= driver.findElement(By.id("j_idt88:j_idt93"));
		System.out.println(thirdbox.isEnabled());
		//Clear the typed text.
		
		WebElement clearbox=driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		// reterive the typed text
		WebElement getext= driver.findElement(By.id("j_idt88:j_idt97"));
		String mval= getext.getAttribute("value");
		System.out.println(mval);
		
		//Type email and Tab. Confirm control moved to next element.
		
		WebElement emailbox= driver.findElement(By.id("j_idt88:j_idt99"));
		emailbox.sendKeys("abc@gmail.com"+ Keys.TAB);
		//about yourself
		
		WebElement textarea=driver.findElement(By.id("j_idt88:j_idt101"));
		textarea.sendKeys("I am mugil from maduari");
		Thread.sleep(8000);
		driver.close();
		
	}

}

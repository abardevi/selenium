package live.once;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Textbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		// Just Press Enter and confirm error message
		WebElement page =driver.findElement(By.id("j_idt106:thisform:age"));
		page.sendKeys(Keys.ENTER);
		
		WebElement errormessage =driver.findElement(By.className("ui-message-error-detail"));
		String msg=errormessage.getText();
		String expectmsg="Age is mandatory";
		System.out.println(msg);
		
	Assert.assertEquals(msg, expectmsg);
		
		
		//Click and Confirm Label Position Changes
	
	WebElement label= driver.findElement(By.xpath("//input[contains(@class,'ui-corner-all')]"));
	label.sendKeys(Keys.ENTER);
	
	String value=label.getAttribute("class");
	
	if (value.contains("ui-state-focus")){
		System.out.println("confirme  label position");
	}
	else {
		System.out.println("no label changes");
	}
	Thread.sleep(2000);
	//Type your name and choose the third option
	
	
	
	
		Thread.sleep(5000);
		driver.close();

	}

}

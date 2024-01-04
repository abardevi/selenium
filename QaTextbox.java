package live.once;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaTextbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new ChromeDriver();

driver.get("https://demoqa.com/text-box");

WebElement fullname= driver.findElement(By.id("userName"));
fullname.sendKeys("mugen");

WebElement email=driver.findElement(By.id("userEmail"));
email.sendKeys("mugen@gmail.com");

WebElement address=driver.findElement(By.id("currentAddress"));
address.sendKeys("karnataka");

WebElement permanentaddress= driver.findElement(By.id("permanentAddress"));
permanentaddress.sendKeys("karnataka");

WebElement button =driver.findElement(By.id("submit"));
button.click();

Thread.sleep(3000);
driver.close();
	}

}

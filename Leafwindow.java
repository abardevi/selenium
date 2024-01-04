package live.once;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new ChromeDriver();

driver.get("https://www.leafground.com/window.xhtml");

String parentwindow=driver.getWindowHandle();

//Click and Confirm new Window Opens

/*WebElement news= driver.findElement(By.id("j_idt88:new"));
news.click();

Set<String> lm=driver.getWindowHandles();

for (String l:lm) {
	if (!l.equals(parentwindow)) {
		driver.switchTo().window(l);
		System.out.println(driver.getTitle());
		driver.close();
		break;
	}

driver.switchTo().window(parentwindow);

}
Thread.sleep(3000);*/
//2.Find the number of opened tabs

/*WebElement opentab=driver.findElement(By.id("j_idt88:j_idt91"));
opentab.click();

Thread.sleep(3000);
Set<String> lt=driver.getWindowHandles();

System.out.println(lt.size());
driver.quit();*/

//3. Close all windows except Primary
WebElement openmulti=driver.findElement(By.id("j_idt88:j_idt93"));
openmulti.click();

Set<String> ls=driver.getWindowHandles();
for (String lr:ls) {
	if (!lr.equals(parentwindow)) {
		driver.switchTo().window(lr);
		driver.close();
	}
}
driver.switchTo().window(parentwindow);
driver.close();
	}

}

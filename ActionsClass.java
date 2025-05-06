import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("mousehover")); 
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Broken Link']"));
		
		//Move to web element, click, then type value while holding shift key and double click to highlight
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("congrats").doubleClick().build().perform();
		
		//Hover mouse cursor to a specific element that displays value
		a.moveToElement(move).build().perform();
		
		//Right click
		a.moveToElement(move).contextClick().build().perform();
		
		Thread.sleep(3000);
		//Scroll to specific element
		a.scrollToElement(scroll).build().perform();
		
		

	}
}
